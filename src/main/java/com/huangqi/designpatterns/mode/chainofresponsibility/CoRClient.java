package com.huangqi.designpatterns.mode.chainofresponsibility;

import com.huangqi.designpatterns.mode.chainofresponsibility.domain.LeaveApproval;
import com.huangqi.designpatterns.mode.chainofresponsibility.service.impl.DirectorLeaveApprovalHandle;
import com.huangqi.designpatterns.mode.chainofresponsibility.service.impl.GeneralManageLeaveApprovalHandle;
import com.huangqi.designpatterns.mode.chainofresponsibility.service.impl.ManageLeaveApprovalHandle;

/**
 * @author huangqi
 * @date 2023-05-26 10:11
 */
public class CoRClient {

    public static void main(String[] args) {
        DirectorLeaveApprovalHandle director = new DirectorLeaveApprovalHandle("李白");
        ManageLeaveApprovalHandle manage = new ManageLeaveApprovalHandle("赵四");
        GeneralManageLeaveApprovalHandle generalManage = new GeneralManageLeaveApprovalHandle("张三");

        director.setHandle(manage);
        manage.setHandle(generalManage);

        director.handle(new LeaveApproval(25));
    }
}
