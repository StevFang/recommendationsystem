package com.qs.strategy;

/**
 * 推荐策略接口
 *
 * create by fbin 2018/9/9
 */
public interface RecommendStrategyIF {

    /**
     * 推荐算法调用方法
     *
     * @param obj
     * @param <T>
     * @return
     */
    <T> T recommend(Object obj);

}
