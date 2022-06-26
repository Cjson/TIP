package com.platform.tip.entity;

/*
 *@Author hzp
 *@ClassName User
 *@Description
 *@Data 2020/7/16 1:41
 * */




public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private Integer role_Id;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setRole_Id(Integer role_Id) {
        this.role_Id = role_Id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public Integer getRole_Id() {
        return role_Id;
    }
}
