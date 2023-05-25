package com.huangqi.designpatterns.mode.strategy;

import com.huangqi.designpatterns.mode.strategy.domain.Aircraft;
import com.huangqi.designpatterns.mode.strategy.service.TakeOffService;
import com.huangqi.designpatterns.mode.strategy.service.impl.SubSonicFlyServiceImpl;
import com.huangqi.designpatterns.utils.XmlUtil;

/**
 * @author huangqi
 * @date 2023-05-25 11:46
 */
public class StrategyClient {
    public static void main(String[] args) {
        TakeOffService bean = (TakeOffService) XmlUtil.getBean();
        Aircraft aircraft = new Aircraft("直升机", bean, new SubSonicFlyServiceImpl());
        aircraft.behavior();
    }
}
