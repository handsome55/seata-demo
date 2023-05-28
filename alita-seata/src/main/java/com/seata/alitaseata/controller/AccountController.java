package com.seata.alitaseata.controller;

import com.seata.alitaseata.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author wubx
 * @date 2023/5/28 16:05
 **/
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PutMapping
    public String edit(String userId, BigDecimal num){
        accountService.edit(userId,num);
        return "success";
    }
}
