package com.platform.tip.service.imp;

import com.platform.tip.entity.Role;
import com.platform.tip.mapper.RoleMapper;
import com.platform.tip.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImp implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getRoleList() {
        return roleMapper.getRoleList();
    }

    @Override
    public Role getRoleById(int id, String name) {
        return roleMapper.getRoleById(id,name);
    }

    @Override
    public int addRole(Role role) {
        return roleMapper.addRole(role);
    }

    @Override
    public int delRole(int id) {
        return roleMapper.delRole(id);
    }

    @Override
    public int updateRole(Role role) {
        return roleMapper.updateRole(role);
    }
}
