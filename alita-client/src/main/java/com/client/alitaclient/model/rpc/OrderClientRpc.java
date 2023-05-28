package com.client.alitaclient.model.rpc;

import com.grpc.Account;
import com.grpc.AccountServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author wubx
 * @date 2023/5/28 16:27
 **/
@Repository
public class OrderClientRpc {

    @GrpcClient("alita-account")
    private AccountServiceGrpc.AccountServiceBlockingStub accountServiceBlockingStub;

    public void edit(String userId, BigDecimal num){
        Account account = Account.newBuilder().setUserId(userId).setNum(num.doubleValue()).build();
        accountServiceBlockingStub.debit(account);
    }
}
