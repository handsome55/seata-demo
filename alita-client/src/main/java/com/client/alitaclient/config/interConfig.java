package com.client.alitaclient.config;

import io.seata.integration.grpc.interceptor.client.ClientTransactionInterceptor;
import io.seata.integration.grpc.interceptor.server.ServerTransactionInterceptor;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;

/**
 * TODO
 *
 * @author WUBX
 * @date 2023/6/8 17:40
 */
public class interConfig {

    @GrpcGlobalClientInterceptor
    public ClientTransactionInterceptor clientTransactionInterceptor(){
        return new ClientTransactionInterceptor();
    }

    @GrpcGlobalServerInterceptor
    public ServerTransactionInterceptor serverTransactionInterceptor(){
        return new ServerTransactionInterceptor();
    }

}
