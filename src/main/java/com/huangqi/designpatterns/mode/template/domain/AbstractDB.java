package com.huangqi.designpatterns.mode.template.domain;

/**
 * 模板类
 *
 * @author huangqi
 * @date 2023-05-25 17:20
 */
public abstract class AbstractDB {

    public String sql;
    public String operate;

    /**
     * 模板公共方法
     * <p>
     * 处理流程
     */
    public void handle(String sql) {
        this.sql = sql;
        connectDB();
        openDB();
        if (operate.equals("查询")) {
            queryDB(sql);
        } else if (operate.equals("更新")) {
            updateDB(sql);
        }
        closeDB();
    }

    /**
     * 钩子方法
     */
    public void setOperate(String operate){
        this.operate = operate;
    }

    /**
     * 抽象方法
     * <p>
     * 连接数据库
     */
    public abstract void connectDB();


    /**
     * 具体方法
     * <p>
     * 打开数据库
     */
    public void openDB() {
        System.out.println("我打开了数据库");
    }

    /**
     * 具体方法
     * <p>
     * 关闭数据库
     */
    public void closeDB() {
        System.out.println("我关闭了数据库");
    }

    /**
     * 具体方法
     * <p>
     * 查询
     */
    public void queryDB(String sql) {
        System.out.println("开始查询: " + sql);
    }

    /**
     * 具体方法
     * <p>
     * 更新
     */
    public void updateDB(String sql) {
        System.out.println("开始更新: " + sql);
    }
}
