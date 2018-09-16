package com.qs.manager;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Map;

/**
 * Created by fbin on 2018/9/16.
 */
@Component
public class SqlManager {

    @PersistenceContext(unitName = "springJpa")
    EntityManager entityManager;

    /**
     * 获取根据唯一标识查询的sql
     *
     * @param clazz
     * @param serial
     * @return
     */
    public String getQuerySql(Class<?> clazz, Long serial){
        StringBuilder sql = new StringBuilder();
        // todo
        return sql.toString();
    }

    /**
     * 获取根据过滤条件查询的sql
     *
     * @param clazz
     * @param param
     * @return
     */
    public String getQuerySql(Class<?> clazz, Map<String, Object> param){
        StringBuilder sql = new StringBuilder();
        // todo
        return sql.toString();
    }

    /**
     * 无条件查询的sql
     *
     * @param clazz
     * @return
     */
    public String getQuerySql(Class<?> clazz){
        StringBuilder sql = new StringBuilder();
        // todo
        return sql.toString();
    }
}
