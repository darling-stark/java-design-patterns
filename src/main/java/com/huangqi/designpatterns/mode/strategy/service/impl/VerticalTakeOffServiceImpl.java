package com.huangqi.designpatterns.mode.strategy.service.impl;

import com.huangqi.designpatterns.mode.strategy.service.TakeOffService;

/**
 * 具体策略类
 *
 * @author huangqi
 * @date 2023-05-25 11:38
 */
public class VerticalTakeOffServiceImpl implements TakeOffService {
    public void takeOff() {
        System.out.println("我是垂直起飞");
    }
}
