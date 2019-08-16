package com.crsit.chain;

/**
 * @ClassName: App
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 16:57
 * @Version: 1.0.0
 **/
public class App {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 19000, 1);
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("正校长");
        departmentApprover.setNext(collegeApprover);
        collegeApprover.setNext(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setNext(schoolMasterApprover);

        departmentApprover.processRequest(purchaseRequest);

    }
}
