package com.qs.strategy;

import com.google.common.collect.Lists;
import com.qs.dto.CollaborativeFilterBaseOnUserDto;
import com.qs.model.BookScore;
import com.qs.model.User;
import com.qs.service.TObjectServiceIF;
import com.qs.utils.RecommendAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 基于用户的协同过滤推荐策略
 *
 * create by fbin on 2018/9/12
 */
@Component
public class CollaborativeFilterBaseOnUserStrategy
        implements RecommendStrategyIF<CollaborativeFilterBaseOnUserDto> {

    @Autowired
    private TObjectServiceIF tObjectService;

    @Override
    public CollaborativeFilterBaseOnUserDto recommend(Map<String, Object> param) {
        // demo recommend book
        List<Long> userIds = (List) param.get("userIds");
        RecommendAssert.assertNotEmpty(userIds, "用户Id未获取到！");
        // 获取所有用户
        List<User> users = Lists.newArrayList();
        userIds.forEach(userId -> users.add(tObjectService.findOne(User.class, userId)));
        // 获取所有的用户书籍评价信息
        List<BookScore> bookScores = Lists.newArrayList();

        return null;
    }

}
