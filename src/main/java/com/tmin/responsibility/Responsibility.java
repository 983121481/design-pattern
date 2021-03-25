package com.tmin.responsibility;

/**
 * @author
 * @date 2021-03-25 23:32
 */
public class Responsibility {
    public static void main(String[] args) {

        //创建一个请求
        PurchaseRequest request = new PurchaseRequest(1, 1001, 1);

        //创建相关的审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("赵主任");
        CollegeApprover collegeApprover = new CollegeApprover("钱院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("孙父校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("李校长");

        //需要将各个审批级别的下一级设置好(处理人构成环型)
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(request);
    }
}
