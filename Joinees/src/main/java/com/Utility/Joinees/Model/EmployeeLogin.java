package com.Utility.Joinees.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeLogin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "EMPID")
	private String EMPID;
	@Column(name = "name")
	private String name;
	@Column(name = "password")
	private String password;
	@Column(name = "role")
	private String role;

	public EmployeeLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the eMPID
	 */
	public String getEMPID() {
		return EMPID;
	}

	/**
	 * @param eMPID the eMPID to set
	 */
	public void setEMPID(String eMPID) {
		EMPID = eMPID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	public EmployeeLogin(String eMPID, String name, String password, String role) {
		super();
		EMPID = eMPID;
		this.name = name;
		this.password = password;
		this.role = role;
	}

	@Override
	public String toString() {
		return "EmployeeLogin [EMPID=" + EMPID + ", name=" + name + ", password=" + password + ", role=" + role + "]";
	}

}
