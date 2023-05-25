package com.huangqi.designpatterns.mode.strategy.service.impl;

import com.huangqi.designpatterns.mode.strategy.service.FlyService;

/**
 * 具体策略类
 *
 * @author huangqi
 * @date 2023-05-25 11:44
 */
public class SuperSonicFlyServiceImpl implements FlyService {
    public void fly() {
        System.out.println("我是超音速飞行");
    }
}
