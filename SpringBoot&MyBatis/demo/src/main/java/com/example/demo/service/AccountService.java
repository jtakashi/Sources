package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountDao;
import com.example.demo.entity.Account;

@Service
public class AccountService {
	@Autowired
	AccountDao accountDao;

	public Account findById(String id) {
        Account account = new Account();
        account.setUserID(id);
        return this.accountDao.findById(account);
    }
}
