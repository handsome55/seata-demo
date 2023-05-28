package com.seata.alitaseata.model;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author wubx
 * @date 2023/5/28 15:31
 **/
public class Account {

    private Integer id;

    private String userId;

    private BigDecimal total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
