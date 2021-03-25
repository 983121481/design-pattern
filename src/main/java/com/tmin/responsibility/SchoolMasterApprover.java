package com.tmin.responsibility;

/**
 * @author
 * @date 2021-03-25 23:52
 */
public class SchoolMasterApprover extends Approver {
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (30000 < purchaseRequest.getPrice()) {
            System.out.println("请求编号id="+ purchaseRequest.getId()+"被"+this.name+"处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
