package com.nlzh.common.util.bean;


/**
 * 树的节点
 * @author 13521
 *
 */
public class Node {
	
	private Long id;
	
	private Long pId;
	
	private String name;
	
	private String url;
	
	private boolean open = false;
	
	private String target = "main"; 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getpId() {
		return pId;
	}

	public void setpId(Long pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return "Node [id=" + id + ", pId=" + pId + ", name=" + name + ", url=" + url + ", open=" + open + ", target="
				+ target + "]";
	}

}
