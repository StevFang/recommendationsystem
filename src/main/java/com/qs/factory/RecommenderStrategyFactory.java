package com.qs.factory;

import com.google.common.collect.Lists;
import com.qs.configuration.RecommenderStrategyTypeEnum;
import com.qs.strategy.RecommendStrategyIF;

import java.util.List;

/**
 * 推荐系统策略处理实例获取简单工厂类
 *
 * create by fbin on 2018/9/9
 */
public class RecommenderStrategyFactory {

    /**
     * 获取策略集
     * @param recommenderStrategyType
     * @return
     */
    public static List<RecommendStrategyIF> getStrategies(RecommenderStrategyTypeEnum recommenderStrategyType){

        return Lists.newArrayList();
    }

}
