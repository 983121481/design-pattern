package com.tmin.responsibility;

/**
 * @author
 * @date 2021-03-25 23:50
 */
public class ViceSchoolMasterApprover extends Approver {
    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (10000 < purchaseRequest.getPrice() && purchaseRequest.getPrice() <= 3000) {
            System.out.println("请求编号id="+ purchaseRequest.getId()+"被"+this.name+"处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
