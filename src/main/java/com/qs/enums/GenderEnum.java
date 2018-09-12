package com.qs.enums;

/**
 * create by fbin on 2018/9/12
 */
public enum GenderEnum {

    Male("male", "男"),
    Female("female", "女"),
    Unknown("unknown", "保密");

    private String code;
    private String label;

    GenderEnum(String code, String label){
        this.code = code;
        this.label = label;
    }

    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

}
