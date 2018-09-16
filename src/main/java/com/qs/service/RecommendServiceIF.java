package com.qs.service;

import java.util.List;
import java.util.Map;

/**
 * 推荐服务接口
 *
 * Created by fbin on 2018/9/16.
 */
public interface RecommendServiceIF {

    /**
     * 推荐至个人
     * @param userId
     * @return
     */
    Map<String, Object> recommendToUser(Long userId);

    /**
     * 推荐至多人
     * @param userIds
     * @return
     */
    Map<String, Object> recommendToUsers(List<Long> userIds);



}
