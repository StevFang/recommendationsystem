package com.qs.enums;

/**
 * 推荐系统 策略类型
 *
 * create by fbin on 2018/9/9
 */
public enum RecommendStrategyTypeEnum {

    CFBOUR("cfbour", "基于用户的协同过滤策略"),
    CFWOR("cfwor", "基于资源权重的协同过滤策略"),
    CTR("ctr", "基于内容的推荐策略"),
    KER("ker", "基于知识的推荐策略"),
    CXR("cxr", "混合推荐策略");

    private String code;
    private String label;

    RecommendStrategyTypeEnum(String code, String label){
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
