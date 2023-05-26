package com.huangqi.designpatterns.mode.chainofresponsibility.service;

import com.huangqi.designpatterns.mode.chainofresponsibility.domain.LeaveApproval;

/**
 * @author huangqi
 * @date 2023-05-26 9:33
 */
public abstract class LeaveApprovalHandle {

    public String name;
    public LeaveApprovalHandle nextHandle;

    public void setHandle(LeaveApprovalHandle leaveApprovalHandle) {
        this.nextHandle = leaveApprovalHandle;
    }

    public abstract void handle(LeaveApproval leaveApproval);
}
