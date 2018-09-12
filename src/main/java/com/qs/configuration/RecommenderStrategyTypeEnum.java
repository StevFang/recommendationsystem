package com.qs.configuration;

/**
 * 推荐系统 策略类型
 *
 * create by fbin on 2018/9/9
 */
public enum RecommenderStrategyTypeEnum {

    CFBOU("collaborativeFilterBaseOnUser", "基于用户的协同过滤策略"),
    CFWOR("collaborativeFilterWeightOfResources", "基于资源权重的协同过滤策略"),
    CTR("contentRecommend", "基于内容的推荐策略"),
    KER("knowledgeRecommend", "基于知识的推荐策略"),
    CXR("complexRecommend", "混合推荐策略");

    private String code;
    private String label;

    RecommenderStrategyTypeEnum(String code, String label){
        this.code = code;
        this.label = label;
    }

    public String getCode(){
        return code;
    }

    public String getLabel(){
        return label;
    }

}
