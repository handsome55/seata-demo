package com.client.alitaclient.service.Impl;

import com.client.alitaclient.mapper.OrderMapper;
import com.client.alitaclient.model.Order;
import com.client.alitaclient.model.rpc.OrderClientRpc;
import com.client.alitaclient.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * TODO
 *
 * @author wubx
 * @date 2023/5/28 16:24
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderClientRpc orderClientRpc;

    @GlobalTransactional
    @Override
    public void insert(Order order) {
        order.setOrderNo(this.generateOrderNo());
        order.setUserId("1");
        order.setCount(1);
        order.setProductId("1");
        order.setMoney(BigDecimal.valueOf(20L));

        orderMapper.insert(order);

        orderClientRpc.edit(order.getUserId(), order.getMoney());
    }

    private String generateOrderNo() {
        return LocalDateTime.now()
                .format(
                        DateTimeFormatter.ofPattern("yyMMddHHmmssSSS")
                );
    }
}
