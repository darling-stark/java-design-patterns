package com.huangqi.designpatterns.mode.strategy.domain;

import com.huangqi.designpatterns.mode.strategy.service.FlyService;
import com.huangqi.designpatterns.mode.strategy.service.TakeOffService;

/**
 * 具体环境类
 *
 * @author huangqi
 * @date 2023-05-25 11:32
 */
public class Aircraft {
    private final String name;
    private final FlyService flyService;
    private final TakeOffService takeOffService;

    public Aircraft(String name, TakeOffService takeOffService, FlyService fightService) {
        this.name = name;
        this.takeOffService = takeOffService;
        this.flyService = fightService;
    }

    public void behavior() {
        System.out.println(this.name);
        takeOffService.takeOff();
        flyService.fly();
    }
}
