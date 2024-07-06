package com.hari.Banking_App.controller;

import com.hari.Banking_App.model.Account;
import com.hari.Banking_App.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService service;

    @PostMapping("add")
    public void addAccount(@RequestBody Account account){
        service.addAccount(account);
    }

    @GetMapping("get")
    public List<Account> returnAllAccount(){
        return service.getAccount();
    }

    @GetMapping("get/{id}")
    public Account returnOneAccount(@PathVariable("id") Long id){
        return service.getOneAccount(id);
    }

    @PutMapping("update")
    public Account updateAccount(@RequestBody Account account){
        service.updateAccount(account);
        return service.getOneAccount(account.getId());
    }

    @DeleteMapping("delete/{id}")
    public String deleteAccount(@PathVariable("id") Long id){
        service.deleteAccount(id);
        return "Deleted";
    }
}
