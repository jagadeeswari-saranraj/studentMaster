package com.example.studentMaster;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String stud_name;
	private String stud_department;
	private Integer stud_age;

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getStud_department() {
		return stud_department;
	}
	public void setStud_department(String stud_department) {
		this.stud_department = stud_department;
	}
	public Integer getStud_age() {
		return stud_age;
	}
	public void setStud_age(Integer stud_age) {
		this.stud_age = stud_age;
	}
	
	
}
