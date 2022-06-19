package com.springboot.beans.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int studentid;
@Override
	public String toString() {
		return "student [studentid=" + studentid + ", name=" + name + ", marks=" + marks + "]";
	}
public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
private String name;
private int marks;
}
