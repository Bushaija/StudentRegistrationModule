package com.auca.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Faculty {
    @Id
    private String facultyCode;
    private String facultyName;

    @OneToMany(mappedBy = "faculty")
    private List<Department> departments;

	public String getFacultyCode() {
		return facultyCode;
	}

	public void setFacultyCode(String facultyCode) {
		this.facultyCode = facultyCode;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

    
    
}
