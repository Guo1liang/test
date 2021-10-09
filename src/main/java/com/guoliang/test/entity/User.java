package com.guoliang.test.entity;

public class User {
    private String userName;            //用户姓名
    private String userCode;            //用户账号
    private String certNumber;          //身份证号
    private String mobile;              //手机号
    private String userEmail;           //电子邮箱
    private String userOrg;             //所在区县
    private String userDept;            //所在部门
    private String userSystem;          //所在系统
    private String operType;            //操作属性
    private String client_id;           //云认证系统
    private String approve_status;      //审核状态
    private String status;              //数据状态

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userCode='" + userCode + '\'' +
                ", certNumber='" + certNumber + '\'' +
                ", mobile='" + mobile + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userOrg='" + userOrg + '\'' +
                ", userDept='" + userDept + '\'' +
                ", userSystem='" + userSystem + '\'' +
                ", operType='" + operType + '\'' +
                ", client_id='" + client_id + '\'' +
                ", approve_status='" + approve_status + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getCertNumber() {
        return certNumber;
    }

    public void setCertNumber(String certNumber) {
        this.certNumber = certNumber;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserOrg() {
        return userOrg;
    }

    public void setUserOrg(String userOrg) {
        this.userOrg = userOrg;
    }

    public String getUserDept() {
        return userDept;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept;
    }

    public String getUserSystem() {
        return userSystem;
    }

    public void setUserSystem(String userSystem) {
        this.userSystem = userSystem;
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getApprove_status() {
        return approve_status;
    }

    public void setApprove_status(String approve_status) {
        this.approve_status = approve_status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
