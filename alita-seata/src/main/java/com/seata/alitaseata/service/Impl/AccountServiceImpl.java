package com.seata.alitaseata.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.seata.alitaseata.mapper.AccountMapper;
import com.seata.alitaseata.model.Account;
import com.seata.alitaseata.service.AccountService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author wubx
 * @date 2023/5/28 15:36
 **/
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;


    @Override
    public Account selectByUserId(String userId) {
        return accountMapper.selectByUserId(userId);
    }

    @GlobalTransactional
    @Override
    public void edit(String userId, BigDecimal num) {
        Account account = accountMapper.selectByUserId(userId);
        account.setTotal(account.getTotal().subtract(num));
        QueryWrapper<Account> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id",userId);
        accountMapper.update(account,wrapper);
        int a = 10/0;
    }
}
