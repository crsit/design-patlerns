package com.crsit.chain;

/**
 * @ClassName: ViceSchoolMasterApprover
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 16:55
 * @Version: 1.0.0
 **/
public class ViceSchoolMasterApprover extends Approver {

    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice()<=30000){
            System.out.println(" 请求编号id="+purchaseRequest.getId()+" 被 "+ this.name+" 处理");
        }else {
            next.processRequest(purchaseRequest);
        }
    }
}
