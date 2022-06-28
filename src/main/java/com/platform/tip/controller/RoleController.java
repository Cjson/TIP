package com.platform.tip.controller;

import com.platform.tip.entity.Role;
import com.platform.tip.service.RoleService;
import com.platform.tip.util.ResponseData;
import com.platform.tip.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("role")
@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    //获取角色列表
    @GetMapping("/getRoleList")
    public ResponseData<List<Role>> getRoleList(){
        return ResponseUtil.success(roleService.getRoleList());
    }

    //获取角色
    @GetMapping("/getRoleById")
    public ResponseData<Role> getRoleById(int id, String name){
        return ResponseUtil.success(roleService.getRoleById(id,name));
    }

    //添加角色
    @PostMapping("/addRole")
    public ResponseData<Integer> addRole(Role role){
        return ResponseUtil.success(roleService.addRole(role));
    }

    //删除角色
    @PostMapping("/delRole")
    public ResponseData<Integer> delRole(int id){
        return ResponseUtil.success(roleService.delRole(id));
    }


    //更新角色
    @PostMapping("/updateRole")
    public ResponseData<Integer> updateRole(Role role){
        return ResponseUtil.success(roleService.updateRole(role));
    }
}
