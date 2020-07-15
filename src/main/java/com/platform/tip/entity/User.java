package com.platform.tip.entity;

/*
 *@Author hzp
 *@ClassName User
 *@Description
 *@Data 2020/7/16 1:41
 * */

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private Integer role_Id;
}
