package com.huangqi.designpatterns.mode.chainofresponsibility.service.impl;

import com.huangqi.designpatterns.mode.chainofresponsibility.domain.LeaveApproval;
import com.huangqi.designpatterns.mode.chainofresponsibility.service.LeaveApprovalHandle;

/**
 * @author huangqi
 * @date 2023-05-26 10:00
 */
public class ManageLeaveApprovalHandle extends LeaveApprovalHandle {
    public ManageLeaveApprovalHandle(String name) {
        super.name = name;
    }

    @Override
    public void handle(LeaveApproval leaveApproval) {
        if (leaveApproval.getDays() >= 3 && leaveApproval.getDays() < 10) {
            System.out.println(name + "经理审批");
        } else {
            super.nextHandle.handle(leaveApproval);
        }
    }
}
