package com.platform.tip.service.imp;


import com.platform.tip.entity.User;
import com.platform.tip.mapper.UserMapper;
import com.platform.tip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *@Author hzp
 *@ClassName UserServiceImp
 *@Description
 *@Data 2020/7/16 2:13
 * */
@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

     /**
       *@MethodName: getUserList
       *@Description: TODO
       *@Param: null
       *@Return:
       *@time: 2020/7/16 2:14
      */
    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
