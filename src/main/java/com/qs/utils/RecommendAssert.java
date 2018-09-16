package com.qs.utils;

import com.qs.exceptions.RecommendRuntimeException;

import java.util.Collection;

/**
 * 推荐系统异常抛出类
 *
 * Created by fbin on 2018/9/16.
 */
public class RecommendAssert {

    public static void assertNotNull(Object obj, String msg, String... args){
        if(obj == null){
            fail(msg, args);
        }
    }

    public static void assertTrue(Boolean bool, String msg, String... args){
        if(bool == null || bool.equals(Boolean.FALSE)){
            fail(msg, args);
        }
    }

    public static void assertFalse(Boolean bool, String msg, String... args){
        if(bool == null || bool.equals(Boolean.TRUE)){
            fail(msg, args);
        }
    }

    public static void assertNotEmpty(Collection collection, String msg, String... args){
        if(collection == null || collection.isEmpty()){
            fail(msg, args);
        }
    }

    public static void assertEmpty(Collection collection, String msg, String... args){
        if(collection == null || collection.isEmpty()){
            fail(msg, args);
        }
    }

    public static void fail(String msg, String... args){
        throw new RecommendRuntimeException(msg, args);
    }

}
