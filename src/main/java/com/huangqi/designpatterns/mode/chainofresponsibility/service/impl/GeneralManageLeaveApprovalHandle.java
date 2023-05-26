package com.huangqi.designpatterns.mode.chainofresponsibility.service.impl;

import com.huangqi.designpatterns.mode.chainofresponsibility.domain.LeaveApproval;
import com.huangqi.designpatterns.mode.chainofresponsibility.service.LeaveApprovalHandle;

/**
 * @author huangqi
 * @date 2023-05-26 10:01
 */
public class GeneralManageLeaveApprovalHandle extends LeaveApprovalHandle {
    public GeneralManageLeaveApprovalHandle(String name) {
        super.name = name;
    }

    @Override
    public void handle(LeaveApproval leaveApproval) {
        if (leaveApproval.getDays() >= 10 && leaveApproval.getDays() < 30) {
            System.out.println(name + "总经理审批");
        } else {
            System.out.println("拒绝审批");
        }
    }
}

