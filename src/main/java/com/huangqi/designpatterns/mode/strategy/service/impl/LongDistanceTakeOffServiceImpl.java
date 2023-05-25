package com.huangqi.designpatterns.mode.strategy.service.impl;

import com.huangqi.designpatterns.mode.strategy.service.TakeOffService;

/**
 * 具体策略类
 *
 * @author huangqi
 * @date 2023-05-25 11:39
 */
public class LongDistanceTakeOffServiceImpl implements TakeOffService {
    public void takeOff() {
        System.out.println("我是长距离起飞");
    }
}
