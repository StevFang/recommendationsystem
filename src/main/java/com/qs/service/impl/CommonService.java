package com.qs.service.impl;

import com.qs.dto.*;
import com.qs.strategy.RecommendStrategyIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by fbin on 2018/9/16.
 */
@Component
public class CommonService {

    // 基于用户的协同过滤推荐策略
    @Autowired
    private RecommendStrategyIF<CollaborativeFilterBaseOnUserDto> collaborativeFilterBaseOnUserStrategy;

    // 基于系统中的资源权重的协同过滤推荐策略
    @Autowired
    private RecommendStrategyIF<CollaborativeFilterWeightOfResourcesDto> collaborativeFilterWeightOfResourcesStrategy;

    // 混合推荐策略
    @Autowired
    private RecommendStrategyIF<ComplexRecommendDto> complexRecommendStrategy;

    // 内容推荐策略
    @Autowired
    private RecommendStrategyIF<ContentRecommendDto> contentRecommendStrategy;

    // 知识推荐策略
    @Autowired
    private RecommendStrategyIF<KnowledgeRecommendDto> knowledgeRecommendStrategy;

    /**
     * 基于用户的协同过滤
     *
     * @param param
     * @return
     */
    public CollaborativeFilterBaseOnUserDto recommendByCFBOU(Map<String, Object> param){
        return collaborativeFilterBaseOnUserStrategy.recommend(param);
    }

    /**
     * 基于资源权重的协同过滤
     *
     * @param param
     * @return
     */
    public CollaborativeFilterWeightOfResourcesDto recommendByCFWOR(Map<String, Object> param){
        return collaborativeFilterWeightOfResourcesStrategy.recommend(param);
    }

    /**
     * 混合推荐
     *
     * @param param
     * @return
     */
    public ComplexRecommendDto recommendByCXR(Map<String, Object> param){
        return complexRecommendStrategy.recommend(param);
    }

    /**
     * 基于内容的推荐
     *
     * @param param
     * @return
     */
    public ContentRecommendDto recommendByCTR(Map<String, Object> param){
        return contentRecommendStrategy.recommend(param);
    }

    /**
     * 基于知识的推荐
     *
     * @param param
     * @return
     */
    public KnowledgeRecommendDto recommendByKER(Map<String, Object> param){
        return knowledgeRecommendStrategy.recommend(param);
    }
}
