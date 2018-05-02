package com.nlzh.common.util.bean;

/**
 * 树形节点
 * @author 13521
 *
 */
public class TreeNode {
	
	/**
	 * 节点id
	 */
	private Long id;

	/**
	 * 节点的名称
	 */
	private String text;
	
	/**
	 * 节点的状态
	 * 		is_parent=1 表示有子节点，state=closed，表示可打开状态
	 * 		is_parent=0,表示id没有子节点，state=open，表示已经打开不能再打开了
	 */
	private String state;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "TreeNode [id=" + id + ", text=" + text + ", state=" + state + "]";
	}
	
}
