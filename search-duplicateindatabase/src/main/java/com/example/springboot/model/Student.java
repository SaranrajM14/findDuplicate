package com.example.springboot.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long studentId;
	private String studentName;
	private String studentdept;
	private int year;
	private String studentEmail;
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentdept() {
		return studentdept;
	}
	public void setStudentdept(String studentdept) {
		this.studentdept = studentdept;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentEmail, studentName, studentdept, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentEmail, other.studentEmail) && Objects.equals(studentName, other.studentName)
				&& Objects.equals(studentdept, other.studentdept) && year == other.year;
	}

}
