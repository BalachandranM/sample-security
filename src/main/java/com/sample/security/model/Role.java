package com.sample.security.model;

import org.springframework.beans.BeanUtils;

public class Role {
	private Integer id;
	private String roleName;

	public Role() {
		super();
	}

	public Role(com.sample.security.entity.Role role) {
		super();
		BeanUtils.copyProperties(role, this);
	}

	public Role(Integer id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
