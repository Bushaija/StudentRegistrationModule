package com.auca.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    private String courseCode;
    private String courseName;
    private int credits;

    @ManyToOne
    private Department department;

    @OneToMany(mappedBy = "course")
    private List<StudentCourses> studentCourses;

    @ManyToOne
    private Teacher teacher;
    
    

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<StudentCourses> getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(List<StudentCourses> studentCourses) {
		this.studentCourses = studentCourses;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

    
}
