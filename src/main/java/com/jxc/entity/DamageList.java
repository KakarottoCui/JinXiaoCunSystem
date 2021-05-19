package com.jxc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 报损单
 */
@Entity
@Table(name="t_damageList")
public class DamageList {

	@Id
	@GeneratedValue
	private Integer id; // 编号
	
	@Column(length=100)
	private String damageNumber; // 报损单号
	

	@Temporal(TemporalType.TIMESTAMP) 
	private Date damageDate; // 报损日期
	
	@Transient
	private Date bDamageDate; // 起始时间 搜索用到
	
	@Transient
	private Date eDamageDate; // 结束时间 搜索用到
	
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user; // 操作用户
	
	@Column(length=1000)
	private String remarks; // 备注

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public String getDamageNumber() {
		return damageNumber;
	}

	public void setDamageNumber(String damageNumber) {
		this.damageNumber = damageNumber;
	}

	

	@JsonSerialize(using=CustomDateSerializer.class)
	public Date getDamageDate() {
		return damageDate;
	}

	public void setDamageDate(Date damageDate) {
		this.damageDate = damageDate;
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getbDamageDate() {
		return bDamageDate;
	}

	public void setbDamageDate(Date bDamageDate) {
		this.bDamageDate = bDamageDate;
	}

	public Date geteDamageDate() {
		return eDamageDate;
	}

	public void seteDamageDate(Date eDamageDate) {
		this.eDamageDate = eDamageDate;
	}

	@Override
	public String toString() {
		return "DamageList [id=" + id + ", damageNumber=" + damageNumber + ", damageDate=" + damageDate
				+ ", bDamageDate=" + bDamageDate + ", eDamageDate=" + eDamageDate + ", user=" + user + ", remarks="
				+ remarks + "]";
	}

	
	
	
	
}
