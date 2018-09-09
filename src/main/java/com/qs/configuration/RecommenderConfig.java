package com.qs.configuration;

import com.qs.strategy.RecommendStrategyIF;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

/**
 * 推荐系统配置
 *
 * create by fbin on 2018/9/9
 */
@Component
public class RecommenderConfig {

    /**
     * 1. 重载推荐系统配置
     * 2. 刷新缓存
     */
    public void reloadConfig(){
        // todo 重载推荐系统配置
    }

    /**
     * 获取系统采用的推荐系统的类型
     *
     * @return
     */
    public RecommenderStrategyTypeEnum getRecommenderType(){
        // todo 获取系统采用的推荐系统的类型
        return RecommenderStrategyTypeEnum.CFBOU;
    }

    /**
     * 混合推荐系统前提下，获取各个推荐系统的算法权重
     *
     * @return
     */
    public Map<String, Object> getWeightOfRecommender(){

        return Collections.emptyMap();
    }

    /**
     * 混合系统前提下，获取各个推荐系统的增强顺序
     *
     * @return
     */
    public Map<String, Object> getRecommenderSeq(){

        return Collections.emptyMap();
    }

    /**
     * 混合系统前提下，获取切换（主动 or 随机选择的一种推荐方法）
     *
     * @return
     */
    public RecommendStrategyIF getRecommendStategy(){

        return null;
    }
}
