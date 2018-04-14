/**
 * 
 */
package com.mybank.fundtrans.domain;

import java.util.Date;

/**
 * @author Hong
 *
 */
public class Client {

	/**
	 * 
	 */
	String idcard;
	String name;
	String sex;
	Integer phone;
	String addredss;
	String email;
	String hobby;
	Date createTime;
	
	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getAddredss() {
		return addredss;
	}

	public void setAddredss(String addredss) {
		this.addredss = addredss;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(String idcard, String name, String sex, Integer phone, String addredss, String email, String hobby,
			Date createTime) {
		super();
		this.idcard = idcard;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.addredss = addredss;
		this.email = email;
		this.hobby = hobby;
		this.createTime = createTime;
	}
	

}
