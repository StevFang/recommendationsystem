package com.qs.strategy;

import com.qs.dto.ComplexRecommendDto;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 混合系统推荐策略
 *
 * create by fbin on 2018/9/12
 */
@Component
public class ComplexRecommendStrategy implements RecommendStrategyIF<ComplexRecommendDto> {
    @Override
    public ComplexRecommendDto recommend(Map<String, Object> param) {
        return null;
    }
}
