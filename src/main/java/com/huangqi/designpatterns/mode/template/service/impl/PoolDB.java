package com.huangqi.designpatterns.mode.template.service.impl;

import com.huangqi.designpatterns.mode.template.service.AbstractDB;

/**
 * @author huangqi
 * @date 2023-05-25 17:44
 */
public class PoolDB extends AbstractDB {
    @Override
    public void connectDB() {
        System.out.println("我是数据库连接池连接");
    }
}
