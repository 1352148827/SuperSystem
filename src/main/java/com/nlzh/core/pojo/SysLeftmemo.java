package com.nlzh.core.pojo;

public class SysLeftmemo {
    private Long sysLeftmemoId;

    private Long sysMemoId;

    private Long sysLeftmemoParentid;

    private String sysLeftmemoName;

    private String sysLeftmemoAnothername;

    private String sysLeftmemoUrl;

    private String gmtCreate;

    private String gmtModified;

    public Long getSysLeftmemoId() {
        return sysLeftmemoId;
    }

    public void setSysLeftmemoId(Long sysLeftmemoId) {
        this.sysLeftmemoId = sysLeftmemoId;
    }

    public Long getSysMemoId() {
        return sysMemoId;
    }

    public void setSysMemoId(Long sysMemoId) {
        this.sysMemoId = sysMemoId;
    }

    public Long getSysLeftmemoParentid() {
        return sysLeftmemoParentid;
    }

    public void setSysLeftmemoParentid(Long sysLeftmemoParentid) {
        this.sysLeftmemoParentid = sysLeftmemoParentid;
    }

    public String getSysLeftmemoName() {
        return sysLeftmemoName;
    }

    public void setSysLeftmemoName(String sysLeftmemoName) {
        this.sysLeftmemoName = sysLeftmemoName == null ? null : sysLeftmemoName.trim();
    }

    public String getSysLeftmemoAnothername() {
        return sysLeftmemoAnothername;
    }

    public void setSysLeftmemoAnothername(String sysLeftmemoAnothername) {
        this.sysLeftmemoAnothername = sysLeftmemoAnothername == null ? null : sysLeftmemoAnothername.trim();
    }

    public String getSysLeftmemoUrl() {
        return sysLeftmemoUrl;
    }

    public void setSysLeftmemoUrl(String sysLeftmemoUrl) {
        this.sysLeftmemoUrl = sysLeftmemoUrl == null ? null : sysLeftmemoUrl.trim();
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