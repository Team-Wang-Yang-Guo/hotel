package com.dbs.controller;

import com.dbs.entity.Role;
import com.dbs.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/hotel/role", produces="application/json;charset=UTF-8")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping(value = "/login", produces="application/json;charset=UTF-8")
    public Object login(@RequestParam("username") String rname,
                      @RequestParam("password") String rpwd){
        Role role1 = roleService.findByRoleName(rname);
        if(role1==null){
            return "用户名不存在！";
        }
        if(!rpwd.equals(role1.getRpwd())){
            return "密码输入错误！";
        }
        return role1;
    }

    @PostMapping(value = "/selectById", produces="application/json;charset=UTF-8")
    public Object selectById(@RequestParam("id") int rno){
        Role role = roleService.findByRoleId(rno);
        return role;
    }

    @GetMapping(value = "/getAll", produces="application/json;charset=UTF-8")
    public Object getAll(){
        List<Role> list = null;
        list = roleService.getAll();
        if(list==null){
            return "没有用户信息，请先添加！";
        }
        return list;
    }

    @PostMapping(value = "/add", produces="application/json;charset=UTF-8")
    public Object add(Role role){
        boolean flag = false;
        System.out.println(role);
        flag = roleService.addRole(role);
        return flag;
    }

    @PostMapping(value = "/update", produces="application/json;charset=UTF-8")
    public Object update(Role role){
        boolean flag = false;
        System.out.println(role);
        flag = roleService.updateRole(role);
        return flag;
    }

    @PostMapping(value = "/delete", produces="application/json;charset=UTF-8")
    public Object delete(@RequestParam("id") int rno){
        boolean flag = false;
        flag = roleService.deleteRole(rno);
        return flag;
    }

    @PostMapping(produces="application/json;charset=UTF-8")
    public String test(){
        return "你好啊！";
    }

}
