package com.huangqi.designpatterns.mode.chainofresponsibility.domain;

/**
 * @author huangqi
 * @date 2023-05-25 21:51
 */
public class LeaveApproval {
    private Integer Days;

    public LeaveApproval(Integer days) {
        Days = days;
    }


    public Integer getDays() {
        return Days;
    }

    public void setDays(Integer days) {
        Days = days;
    }
}
