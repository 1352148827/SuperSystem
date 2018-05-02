package com.nlzh.core.pojo;

public class SysTemplate {
    private Long sysTemplateId;

    private String sysTemplateName;

    private String sysTemplateRemark;

    private String gmtCreate;

    private String gmtModified;

    public Long getSysTemplateId() {
        return sysTemplateId;
    }

    public void setSysTemplateId(Long sysTemplateId) {
        this.sysTemplateId = sysTemplateId;
    }

    public String getSysTemplateName() {
        return sysTemplateName;
    }

    public void setSysTemplateName(String sysTemplateName) {
        this.sysTemplateName = sysTemplateName == null ? null : sysTemplateName.trim();
    }

    public String getSysTemplateRemark() {
        return sysTemplateRemark;
    }

    public void setSysTemplateRemark(String sysTemplateRemark) {
        this.sysTemplateRemark = sysTemplateRemark == null ? null : sysTemplateRemark.trim();
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
    }
}