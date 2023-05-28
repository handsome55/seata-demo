package com.client.alitaclient.controller;

import com.client.alitaclient.model.Order;
import com.client.alitaclient.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author wubx
 * @date 2023/5/28 16:51
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/insert")
    public String insert(@RequestBody Order order){
        orderService.insert(order);
        return "success";
    }
}
