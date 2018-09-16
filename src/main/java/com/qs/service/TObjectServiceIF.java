package com.qs.service;

import java.util.List;

/**
 * Created by fbin on 2018/9/16.
 */
public interface TObjectServiceIF {

    <T> List<T> findAll(Class<T> tClass);

    <T> T findOne(Class<T> tClass, Long serial);

}
