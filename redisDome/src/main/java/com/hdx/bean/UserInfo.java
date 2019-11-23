package com.hdx.bean;

public class UserInfo {
    private String userId;
    private String userName;
    private String userAge;
    private String pwd;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId:'" + userId + '\'' +
                ", userName:'" + userName + '\'' +
                ", userAge:'" + userAge + '\'' +
                ", pwd:'" + pwd + '\'' +
                '}';
    }
}
