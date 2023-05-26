package com.huangqi.designpatterns.mode.template;

import com.huangqi.designpatterns.mode.template.service.impl.JdbcDB;
import com.huangqi.designpatterns.mode.template.service.impl.PoolDB;

/**
 * @author huangqi
 * @date 2023-05-25 17:37
 */
public class TemplateClient {
    public static void main(String[] args) {
        JdbcDB jdbcDB = new JdbcDB();
        jdbcDB.setOperate("查询");
        jdbcDB.handle("select 1");

        System.out.println("----------");

        PoolDB poolDB = new PoolDB();
        poolDB.setOperate("更新");
        poolDB.handle("update 1");
    }
}
