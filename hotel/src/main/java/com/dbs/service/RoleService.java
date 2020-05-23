package com.dbs.service;

import com.dbs.entity.Role;

import java.util.List;

public interface RoleService {

    /**
     * 根据用户名获得用户
     * @param rname
     * @return
     */
    Role findByRoleName(String rname);

    /**
     * 根据用户ID获得用户
     * @param rno
     * @return
     */
    Role findByRoleId(int rno);

    /**
     * 查询所有用户信息
     * @return
     */
    List<Role> getAll();

    /**
     * 添加用户
     * @param role
     * @return
     */
    boolean addRole(Role role);

    /**
     * 删除用户
     * @param rno
     * @return
     */
    boolean deleteRole(int rno);

    /**
     * 修改用户信息
     * @param role
     * @return
     */
    boolean updateRole(Role role);
}
