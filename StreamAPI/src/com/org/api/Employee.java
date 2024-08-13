package com.org.api;

public class Employee {
	int id;
	String name;
	int age;
	int doj;
	String gender;
	int salary;
	public Employee(int id, String name, int age, int doj, String gender, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.doj = doj;
		this.gender = gender;
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDoj() {
		return doj;
	}
	public void setDoj(int doj) {
		this.doj = doj;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
