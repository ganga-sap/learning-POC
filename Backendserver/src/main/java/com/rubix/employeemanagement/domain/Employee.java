package com.rubix.employeemanagement.domain;

import javax.persistence.*;

@Entity
@Table(name = "employee", schema = "public")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "phoneno")
	private String phoneno;
	@Column(name = "email")
	private String email;
	@Column(name = "dob")
	private String dob;
	@Column(name = "address")
	private String address;
	@Column(name = "bloodgroup")
	private String bloodgroup;
	@Column(name = "bank_acc_no")
	private String bank_acc_no;
	@Column(name = "pan_card_no")
	private String pan_card_no;
	
	
	public Employee() {

	}

	public Employee(long id, String name, String phoneno, String email, String dob, String address, String bloodgroup,
			String bank_acc_no, String pan_card_no) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		this.email = email;
		this.dob = dob;
		this.address = address;
		this.bloodgroup = bloodgroup;
		this.bank_acc_no = bank_acc_no;
		this.pan_card_no = pan_card_no;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getBank_acc_no() {
		return bank_acc_no;
	}

	public void setBank_acc_no(String bank_acc_no) {
		this.bank_acc_no = bank_acc_no;
	}

	public String getPan_card_no() {
		return pan_card_no;
	}

	public void setPan_card_no(String pan_card_no) {
		this.pan_card_no = pan_card_no;
	}

	

}
