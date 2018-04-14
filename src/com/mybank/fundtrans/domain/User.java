/**
 * 
 */
package com.mybank.fundtrans.domain;

import java.util.Date;

/**
 * @author Hong
 *
 */
public class User {

	/**
	 * 
	 */
	Integer id;
	String name;
	String password;
	Date createTime;
	String realname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String name, String password, Date createTime, String realname) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.createTime = createTime;
		this.realname = realname;
	}

}
