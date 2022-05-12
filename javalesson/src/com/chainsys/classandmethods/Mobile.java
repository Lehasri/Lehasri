package com.chainsys.classandmethods;
public class Mobile {
private final long phoneNo;
public Mobile(long phNo)
{
	this.phoneNo=phNo;
}
public int getFrontCameraPixel() {
	return frontCameraPixel;
}
public void setFrontCameraPixel(int frontCameraPixel) {
	this.frontCameraPixel = frontCameraPixel;
}
public int getRearCameraPixel() {
	return rearCameraPixel;
}
public void setRearCameraPixel(int rearCameraPixel) {
	this.rearCameraPixel = rearCameraPixel;
}
public float getCost() {
	return cost;
}
public void setCost(float cost) {
	this.cost = cost;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getManufacturer() {
	return manufacturer;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}
public int getMemory() {
	return memory;
}
public void setMemory(int memory) {
	this.memory = memory;
}

public String getPlanDetails() {
	return planDetails;
}
public void setPlanDetails(String planDetails) {
	this.planDetails = planDetails;
}
public long getPhoneNo() {
	return phoneNo;
}
public String getDataOfPurchase() {
	return dataOfPurchase;
}
public void setDataOfPurchase(String string) {
	this.dataOfPurchase = string;
	
	//System.out.println(date);
	//SimpleDateFormat dateFormat=dateformat(dateOfpurchase);
}
private int frontCameraPixel;
private int rearCameraPixel;
private float cost;
private String model;
private String manufacturer;
private int memory;
private String dataOfPurchase;
private String planDetails;

}
