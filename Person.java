package com.demo.beans;

public class Person {
   private int personId;
   private String name;
   private String address;
public Person(int personId, String name, String address) {
	super();
	this.personId = personId;
	this.name = name;
	this.address = address;
}
public int getPersonId() {
	return personId;
}
public void setPersonId(int personId) {
	this.personId = personId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
