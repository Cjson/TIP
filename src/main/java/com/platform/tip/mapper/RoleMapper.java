package com.platform.tip.mapper;

import com.platform.tip.entity.Role;

import java.util.List;

public interface RoleMapper {

    List<Role> getRoleList();

    Role getRoleById(int id,String name);

    int addRole(Role role);

    int delRole(int id);

    int updateRole(Role role);
}
