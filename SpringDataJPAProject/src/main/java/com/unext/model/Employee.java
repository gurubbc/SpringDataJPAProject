package com.unext.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eno;
	@Column
	private String name;
	@Column
	private float bp;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(int eno, String name, float bp) {
		super();
		this.eno = eno;
		this.name = name;
		this.bp = bp;
	}



	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBp() {
		return bp;
	}
	public void setBp(float bp) {
		this.bp = bp;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", bp=" + bp + "]";
	}
	
	 
	
}
