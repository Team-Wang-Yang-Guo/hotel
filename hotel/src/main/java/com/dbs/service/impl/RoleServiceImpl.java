package com.dbs.service.impl;

import com.dbs.entity.Role;
import com.dbs.dao.RoleDao;
import com.dbs.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role findByRoleName(String rname) {
        return this.roleDao.findByRoleName(rname);
    }

    @Override
    public Role findByRoleId(int rno) {
        return this.roleDao.findByRoleId(rno);
    }

    @Override
    public List<Role> getAll() {
        return this.roleDao.getAll();
    }

    @Override
    public boolean addRole(Role role) {
        boolean flag = false;
        if(this.roleDao.addRole(role)>0){
            flag = true;
        }
        return flag;
    }

    @Override
    public boolean deleteRole(int rno) {
        boolean flag = false;
        if(this.roleDao.deleteRole(rno)>0){
            flag = true;
        }
        return flag;
    }

    @Override
    public boolean updateRole(Role role) {
        boolean flag = false;
        if(this.roleDao.updateRole(role)>0){
            flag = true;
        }
        return flag;
    }
}
