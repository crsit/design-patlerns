package com.crsit.chain;

/**
 * @ClassName: ViceSchoolMasterApprover
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 16:55
 * @Version: 1.0.0
 **/
public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        System.out.println(" 请求编号id="+purchaseRequest.getId()+" 被 "+ this.name+" 处理");
    }
}
