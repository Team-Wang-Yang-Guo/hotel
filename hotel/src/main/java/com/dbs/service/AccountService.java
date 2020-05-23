package com.dbs.service;

import com.dbs.entity.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findAll();
    public void saveAccount(Account account);
}
