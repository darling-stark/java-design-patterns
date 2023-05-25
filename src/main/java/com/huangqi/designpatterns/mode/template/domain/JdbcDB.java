package com.huangqi.designpatterns.mode.template.domain;

/**
 * @author huangqi
 * @date 2023-05-25 17:36
 */
public class JdbcDB extends AbstractDB{


    @Override
    public void connectDB() {
        System.out.println("我是 Jdbc 连接");
    }
}
