package com.qs.strategy;

import java.util.Map;

/**
 * 推荐策略接口
 *
 * create by fbin 2018/9/9
 */
public interface RecommendStrategyIF<T> {

    /**
     * 推荐算法调用方法
     *
     * @param param
     * @return
     */
    T recommend(Map<String, Object> param);

}
