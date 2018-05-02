package com.nlzh.core.pojo;

public class SysMemo {
    private Long sysMemoId;

    private Long sysTemplateId;

    private String sysMemoName;

    private String sysMemoAnothername;

    private String sysMemoUrl;

    private String sysMemoRemark;

    private String gmtCreate;

    private String gmtModified;
    
    private SysTemplate sysTemplate;

    public Long getSysMemoId() {
        return sysMemoId;
    }

    public void setSysMemoId(Long sysMemoId) {
        this.sysMemoId = sysMemoId;
    }

    public Long getSysTemplateId() {
        return sysTemplateId;
    }

    public void setSysTemplateId(Long sysTemplateId) {
        this.sysTemplateId = sysTemplateId;
    }

    public String getSysMemoName() {
        return sysMemoName;
    }

    public void setSysMemoName(String sysMemoName) {
        this.sysMemoName = sysMemoName == null ? null : sysMemoName.trim();
    }

    public String getSysMemoAnothername() {
        return sysMemoAnothername;
    }

    public void setSysMemoAnothername(String sysMemoAnothername) {
        this.sysMemoAnothername = sysMemoAnothername == null ? null : sysMemoAnothername.trim();
    }

    public String getSysMemoUrl() {
        return sysMemoUrl;
    }

    public void setSysMemoUrl(String sysMemoUrl) {
        this.sysMemoUrl = sysMemoUrl == null ? null : sysMemoUrl.trim();
    }

    public String getSysMemoRemark() {
        return sysMemoRemark;
    }

    public void setSysMemoRemark(String sysMemoRemark) {
        this.sysMemoRemark = sysMemoRemark == null ? null : sysMemoRemark.trim();
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

	public SysTemplate getSysTemplate() {
		return sysTemplate;
	}

	public void setSysTemplate(SysTemplate sysTemplate) {
		this.sysTemplate = sysTemplate;
	}

	@Override
	public String toString() {
		return "SysMemo [sysMemoId=" + sysMemoId + ", sysTemplateId=" + sysTemplateId + ", sysMemoName=" + sysMemoName
				+ ", sysMemoAnothername=" + sysMemoAnothername + ", sysMemoUrl=" + sysMemoUrl + ", sysMemoRemark="
				+ sysMemoRemark + ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified + ", sysTemplate="
				+ sysTemplate + "]";
	}
    
}