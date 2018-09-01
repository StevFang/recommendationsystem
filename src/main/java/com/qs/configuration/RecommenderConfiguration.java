package com.qs.configuration;

import org.grouplens.lenskit.ItemRecommender;
import org.grouplens.lenskit.ItemScorer;
import org.grouplens.lenskit.RatingPredictor;
import org.grouplens.lenskit.RecommenderBuildException;
import org.grouplens.lenskit.baseline.BaselineScorer;
import org.grouplens.lenskit.baseline.ItemMeanRatingItemScorer;
import org.grouplens.lenskit.baseline.UserMeanBaseline;
import org.grouplens.lenskit.baseline.UserMeanItemScorer;
import org.grouplens.lenskit.core.LenskitConfiguration;
import org.grouplens.lenskit.core.LenskitRecommender;
import org.grouplens.lenskit.data.dao.EventDAO;
import org.grouplens.lenskit.data.dao.SimpleFileRatingDAO;
import org.grouplens.lenskit.knn.item.ItemItemScorer;
import org.grouplens.lenskit.scored.ScoredId;
import org.grouplens.lenskit.transform.normalize.BaselineSubtractingUserVectorNormalizer;
import org.grouplens.lenskit.transform.normalize.UserVectorNormalizer;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by fbin on 2018/8/28.
 */
public class RecommenderConfiguration {

    private LenskitConfiguration config;

    public RecommenderConfiguration() {
        // init
        config = init();
        // connect data source
        connectDataSource();
    }

    /**
     * Configuring the Recommender
     *
     * @return config
     */
    private LenskitConfiguration init() {
        config = new LenskitConfiguration();
        // Use item-item CF to score items
        config.bind(ItemScorer.class).to(ItemItemScorer.class);
        // let's use personalized mean rating as the baseline/fallback predictor.
        // 2-step process:
        // First, use the user mean rating as the baseline scorer
        config.bind(BaselineScorer.class, ItemScorer.class).to(UserMeanItemScorer.class);
        // Second, use the item mean rating as the base for user means
        config.bind(UserMeanBaseline.class, ItemScorer.class).to(ItemMeanRatingItemScorer.class);
        // and normalize ratings by baseline prior to computing similarities
        config.bind(UserVectorNormalizer.class).to(BaselineSubtractingUserVectorNormalizer.class);
        return config;
    }

    /**
     * Connecting the Data Source
     */
    private void connectDataSource(){
        config.bind(EventDAO.class).to(new SimpleFileRatingDAO(new File("ratings.csv"), ","));
    }

    /**
     * Creating the Recommender
     * @return
     */
    public LenskitRecommender createRecommender(LenskitConfiguration config) throws RecommenderBuildException {
        LenskitRecommender rec = LenskitRecommender.build(config);
        return rec;
    }

    /**
     * Generating Recommendations
     *
     * @param recommender
     * @return
     */
    private List<ScoredId> generatingRecommendations(LenskitRecommender recommender){
        ItemRecommender irec = recommender.getItemRecommender();
        List<ScoredId> recommendations = irec.recommend(42, 10);
        return recommendations;
    }

    /**
     * predict ratings
     *
     * @param recommender
     * @return
     */
    private BigDecimal ratingPredictor(LenskitRecommender recommender){
        RatingPredictor pred = recommender.getRatingPredictor();
        double score = pred.predict(42, 17);
        return BigDecimal.valueOf(score);
    }
}
