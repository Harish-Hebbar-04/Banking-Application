package com.hari.Banking_App.service;

import com.hari.Banking_App.Repository.AccountRepository;
import com.hari.Banking_App.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository repo;

    public void addAccount(Account account){
        repo.save(account);
    }

    public List<Account> getAccount(){
        return repo.findAll();
    }

    public Account getOneAccount(Long id){
        return repo.findById(id).orElse(new Account());
    }

    public void updateAccount(Account account){
        repo.save(account);
    }

    public void deleteAccount(Long id){
         repo.deleteById(id);
    }
}
