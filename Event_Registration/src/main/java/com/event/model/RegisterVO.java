package com.event.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REGISTRATION")
public class RegisterVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PkRid")
	public int pkrid;

	@Column(name = "FullName")
	public String fullname;

	@Column(name = "Mobile")
	public String mobile;

	@Column(name = "Email")
	public String email;

	@Column(name = "IdCardLink")
	public String idcardlink;

	@Column(name = "RegistrationType")
	public String registrationtype;

	@Column(name = "NoOfTickets")
	public int nooftickets;

	@Column(name = "RegistartionStatus")
	public boolean registartionstatus;

	public int getPkrid() {
		return pkrid;
	}

	public void setPkrid(int pkrid) {
		this.pkrid = pkrid;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdcardlink() {
		return idcardlink;
	}

	public void setIdcardlink(String idcardlink) {
		this.idcardlink = idcardlink;
	}

	public String getRegistrationtype() {
		return registrationtype;
	}

	public void setRegistrationtype(String registrationtype) {
		this.registrationtype = registrationtype;
	}

	public int getNooftickets() {
		return nooftickets;
	}

	public void setNooftickets(int nooftickets) {
		this.nooftickets = nooftickets;
	}

	public boolean isRegistartionstatus() {
		return registartionstatus;
	}

	public void setRegistartionstatus(boolean registartionstatus) {
		this.registartionstatus = registartionstatus;
	}

}
