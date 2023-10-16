package com.auca.model;

import javax.persistence.*;

@Entity
public class CourseDefinition {
    @Id
    private String courseCode;
    private String courseName;
    private String courseDescription;

    @OneToOne
    @JoinColumn(name = "course_code")
    private Course course;

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

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}    
}
