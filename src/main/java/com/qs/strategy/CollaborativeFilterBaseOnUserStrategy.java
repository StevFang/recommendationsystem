package com.qs.strategy;

import com.qs.dto.CollaborativeFilterBaseOnUserDto;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 基于用户的协同过滤推荐策略
 *
 * create by fbin on 2018/9/12
 */
@Component
public class CollaborativeFilterBaseOnUserStrategy
        implements RecommendStrategyIF<CollaborativeFilterBaseOnUserDto> {

    @Override
    public CollaborativeFilterBaseOnUserDto recommend(Map<String, Object> param) {

        return null;
    }

}
