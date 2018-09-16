package com.qs.service.impl;

import com.qs.manager.SqlManager;
import com.qs.service.TObjectServiceIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by fbin on 2018/9/16.
 */
@Component
public class TObjectService implements TObjectServiceIF {

    @Autowired
    private SqlManager sqlManager;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public <T> List<T> findAll(Class<T> tClass) {
        String sql = sqlManager.getQuerySql(tClass);
        return jdbcTemplate.queryForList(sql, tClass);
    }

    @Override
    public <T> T findOne(Class<T> tClass, Long serial) {
        String sql = sqlManager.getQuerySql(tClass, serial);
        return jdbcTemplate.queryForObject(sql, tClass);
    }
}
