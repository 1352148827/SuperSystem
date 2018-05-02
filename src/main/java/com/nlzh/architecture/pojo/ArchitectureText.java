package com.nlzh.architecture.pojo;

public class ArchitectureText {
    private Long architectureTextId;

    private String gmtCreate;

    private String gmtModified;

    private String architectureTextContent;

    public Long getArchitectureTextId() {
        return architectureTextId;
    }

    public void setArchitectureTextId(Long architectureTextId) {
        this.architectureTextId = architectureTextId;
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

    public String getArchitectureTextContent() {
        return architectureTextContent;
    }

    public void setArchitectureTextContent(String architectureTextContent) {
        this.architectureTextContent = architectureTextContent == null ? null : architectureTextContent.trim();
    }
}