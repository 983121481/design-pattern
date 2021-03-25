package com.tmin.responsibility;

/**
 * @author
 * @date 2021-03-25 23:49
 */
public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (5000 < purchaseRequest.getPrice() && purchaseRequest.getPrice() <= 1000) {
            System.out.println("请求编号id="+ purchaseRequest.getId()+"被"+this.name+"处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
