package com.nlzh.my.pojo;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class MyConsumptionDay {
    private Long consumptionDayId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date currentDate;

    private BigDecimal totalAmount;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getConsumptionDayId() {
        return consumptionDayId;
    }

    public void setConsumptionDayId(Long consumptionDayId) {
        this.consumptionDayId = consumptionDayId;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
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