package com.chainsys.miniproject.pojo;

import java.util.Date;

public class Doctor{
	private int doctor_id;
	private String name; 
	private Date dob;
	private String speciality;
	private String city;         
	private String phone_no; 
	private int standard_fees;
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String l) {
		this.phone_no = l;
	}
	public int getStandard_fees() {
		return standard_fees;
	}
	public void setStandard_fees(int standard_fees) {
		this.standard_fees = standard_fees;
	}
	
	
}