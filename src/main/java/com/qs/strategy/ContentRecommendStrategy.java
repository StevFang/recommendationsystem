package com.qs.strategy;

import com.qs.dto.ContentRecommendDto;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 内容推荐策略
 *
 * create by fbin on 2018/9/12
 */
@Component
public class ContentRecommendStrategy implements RecommendStrategyIF<ContentRecommendDto> {
    @Override
    public ContentRecommendDto recommend(Map<String, Object> param) {
        return null;
    }
}
