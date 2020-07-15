package com.platform.tip.controller;

import com.platform.tip.entity.User;
import com.platform.tip.service.imp.UserServiceImp;
import com.platform.tip.util.ResponseData;
import com.platform.tip.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author hzp
 * @ClassName UserController
 * @Description
 * @Data 2020/7/16 2:17
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServiceImp userServiceImp;

    @GetMapping("getUserList")
    public ResponseData<List<User>> getUserList(){
        return ResponseUtil.success(userServiceImp.getUserList());
    }
}
