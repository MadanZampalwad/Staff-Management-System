package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
	@Id
	private int id;
	private String name;
	private String profile;
	private double salary;
	private int exp;
	
	
	public Staff(int id, String name, String profile, double salary, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.profile = profile;
		this.salary = salary;
		this.exp = exp;
	}
	public Staff() {
		super();
		
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
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", profile=" + profile + ", salary=" + salary + ", exp=" + exp
				+ "]";
	}
	

}
