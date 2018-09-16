package com.qs.exceptions;

/**
 * 推荐系统自定义异常
 *
 * Created by fbin on 2018/9/16.
 */
public class RecommendRuntimeException extends RuntimeException {

    public RecommendRuntimeException(){
        super();
    }

    public RecommendRuntimeException(String msg){
        super(msg);
    }

    public RecommendRuntimeException(String msg, String... args){
        super(String.format(msg, args));
    }

}
