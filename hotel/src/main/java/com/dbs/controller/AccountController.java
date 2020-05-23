package com.dbs.controller;

import com.dbs.entity.Account;
import com.dbs.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public List<Account> findAll(){
        System.out.println("表现层：查询所有账户。。。");
        return accountService.findAll();
    }
}
