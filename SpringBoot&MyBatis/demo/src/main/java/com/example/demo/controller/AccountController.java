package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Account;
import com.example.demo.form.AccountForm;
import com.example.demo.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountService accountService;

	@RequestMapping("/search")
	public String index(AccountForm accountForm, Model model) {
		model.addAttribute("title", "アカウント情報");

		if (accountForm.getUserID() != null) {
			Account account = accountService.findById(accountForm.getUserID());
			model.addAttribute("account", account);
			System.out.println("!= null");
		}else {
			System.out.println("== null");
		}
		return "index";
	}
}
