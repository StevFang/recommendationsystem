package com.qs.service.impl;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.qs.configuration.RecommendSysConfiguration;
import com.qs.dto.*;
import com.qs.enums.RecommendStrategyTypeEnum;
import com.qs.service.RecommendServiceIF;
import com.qs.utils.RecommendAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 推荐业务实现类
 *
 * create by fbin on 2018/9/9
 */
@Service
public class RecommendService implements RecommendServiceIF {

    // 推荐系统的参数配置
    @Autowired
    private RecommendSysConfiguration recommendSysConfiguration;

    @Autowired
    private CommonService commonService;

    @Override
    public Map<String, Object> recommendToUser(Long userId) {
        RecommendAssert.assertNotNull(userId, "用户Id不能为空！");
        // 推荐系统 策略类型
        RecommendStrategyTypeEnum recommendStrategyType = recommendSysConfiguration.getRecommenderType();
        RecommendAssert.assertNotNull(recommendStrategyType, "推荐策略类型未获取到！");
        return recommendToUsers(Lists.newArrayList(userId));
    }

    @Override
    public Map<String, Object> recommendToUsers(List<Long> userIds) {
        RecommendAssert.assertNotNull(userIds, "userIds不能为空！");
        // 推荐系统 策略类型
        RecommendStrategyTypeEnum recommendStrategyType = recommendSysConfiguration.getRecommenderType();
        RecommendAssert.assertNotNull(recommendStrategyType, "推荐策略类型未获取到！");
        Map<String, Object> param = ImmutableMap.of("userIds", userIds);
        // 返回结果数据
        Map<String, Object> data = new HashMap<>();
        if(RecommendStrategyTypeEnum.CFBOUR.equals(recommendStrategyType)){
            // 基于用户的协同过滤
            CollaborativeFilterBaseOnUserDto collaborativeFilterBaseOnUserDto = commonService.recommendByCFBOU(param);
        }else if(RecommendStrategyTypeEnum.CFWOR.equals(recommendStrategyType)){
            // 基于资源权重的协同过滤
            CollaborativeFilterWeightOfResourcesDto collaborativeFilterWeightOfResourcesDto = commonService.recommendByCFWOR(param);
        }else if(RecommendStrategyTypeEnum.CTR.equals(recommendStrategyType)){
            // 基于内容的推荐
            ContentRecommendDto contentRecommendDto = commonService.recommendByCTR(param);
        }else if(RecommendStrategyTypeEnum.KER.equals(recommendStrategyType)){
            // 基于知识的推荐
            KnowledgeRecommendDto knowledgeRecommendDto = commonService.recommendByKER(param);
        }else if(RecommendStrategyTypeEnum.CXR.equals(recommendStrategyType)){
            // 混合推荐
            ComplexRecommendDto complexRecommendDto = commonService.recommendByCXR(param);
        }else{
            RecommendAssert.fail("推荐策略类型未定义！");
        }
        return data;
    }


}
