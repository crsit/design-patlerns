package com.crsit.chain;

/**
 * @ClassName: Approver
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 16:47
 * @Version: 1.0.0
 **/
public abstract class Approver {
    protected Approver next;
    protected String name;
    public Approver(String name) {
        this.name = name;
    }

    public void setNext(Approver next) {
        this.next = next;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
