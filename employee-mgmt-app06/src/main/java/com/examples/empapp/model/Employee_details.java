package com.examples.empapp.model;

public class Employee_details {

	public String name;
	public String des;
	public int id;
	public String sal;
public Employee_details(int id,String name,String des,String sal){
		this.id=id;
		this.name=name;
		this.des=des;
		this.sal=sal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	
}
