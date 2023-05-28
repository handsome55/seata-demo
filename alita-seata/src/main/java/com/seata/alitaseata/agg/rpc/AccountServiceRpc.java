package com.seata.alitaseata.agg.rpc;

import com.grpc.Account;
import com.grpc.AccountReply;
import com.grpc.AccountServiceGrpc;
import com.seata.alitaseata.service.AccountService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author WUBX
 * @date 2023/5/26 17:49
 */
@GrpcService
public class AccountServiceRpc extends AccountServiceGrpc.AccountServiceImplBase {

    @Autowired
    private AccountService accountService;

    @Override
    public void debit(Account request, StreamObserver<AccountReply> responseObserver) {
        accountService.edit(request.getUserId(), BigDecimal.valueOf(request.getNum()));
        responseObserver.onNext(AccountReply.newBuilder().setMessage("success").build());
        responseObserver.onCompleted();
    }
}
