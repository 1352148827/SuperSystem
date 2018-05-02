package com.nlzh.my.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class MyConsumptionItem {
    private Long consumptionItemId;

    private Long consumptionDayId;

    private Integer type;

    private BigDecimal payMoney;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getConsumptionItemId() {
        return consumptionItemId;
    }

    public void setConsumptionItemId(Long consumptionItemId) {
        this.consumptionItemId = consumptionItemId;
    }

    public Long getConsumptionDayId() {
        return consumptionDayId;
    }

    public void setConsumptionDayId(Long consumptionDayId) {
        this.consumptionDayId = consumptionDayId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}