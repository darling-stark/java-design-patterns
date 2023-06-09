package com.huangqi.designpatterns.mode.chainofresponsibility.service.impl;

import com.huangqi.designpatterns.mode.chainofresponsibility.domain.LeaveApproval;
import com.huangqi.designpatterns.mode.chainofresponsibility.service.LeaveApprovalHandle;

/**
 * @author huangqi
 * @date 2023-05-26 9:42
 */
public class DirectorLeaveApprovalHandle extends LeaveApprovalHandle {
    public DirectorLeaveApprovalHandle(String name) {
        super.name = name;
    }

    @Override
    public void handle(LeaveApproval leaveApproval) {
        if (leaveApproval.getDays() < 3) {
            System.out.println(name + "主任审批");
        } else {
            super.nextHandle.handle(leaveApproval);
        }
    }
}
