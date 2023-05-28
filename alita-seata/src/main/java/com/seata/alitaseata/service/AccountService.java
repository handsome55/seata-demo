package com.seata.alitaseata.service;

import com.seata.alitaseata.model.Account;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author wubx
 * @date 2023/5/28 15:34
 **/
public interface AccountService {

    Account selectByUserId(String userId);

    void edit(String userId, BigDecimal num);
}
