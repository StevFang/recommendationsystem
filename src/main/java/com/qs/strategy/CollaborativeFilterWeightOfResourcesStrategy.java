package com.qs.strategy;

import com.qs.dto.CollaborativeFilterBaseOnUserDto;
import com.qs.dto.CollaborativeFilterWeightOfResourcesDto;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 基于资源权重的协同过滤策略
 *
 * create by fbin on 2018/9/12
 */
@Component
public class CollaborativeFilterWeightOfResourcesStrategy
        implements RecommendStrategyIF<CollaborativeFilterWeightOfResourcesDto> {

    @Override
    public CollaborativeFilterWeightOfResourcesDto recommend(Map<String, Object> param) {
        return null;
    }

}
