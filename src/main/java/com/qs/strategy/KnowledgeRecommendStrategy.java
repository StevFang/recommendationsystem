package com.qs.strategy;

import com.qs.dto.KnowledgeRecommendDto;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 知识推荐策略
 *
 * create by fbin on 2018/9/12
 */
@Component
public class KnowledgeRecommendStrategy implements RecommendStrategyIF<KnowledgeRecommendDto> {
    @Override
    public KnowledgeRecommendDto recommend(Map<String, Object> param) {
        return null;
    }
}
