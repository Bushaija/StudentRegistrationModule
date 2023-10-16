package com.auca.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Teacher {
    @Id
    private Long teacherId;
    private String teacherName;

    @Enumerated(EnumType.STRING)
    private TeacherQualification qualification;

    private boolean assistant;

    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;
    
    public enum TeacherQualification {
        PhD,
        Masters,
        Professor
    }

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public TeacherQualification getQualification() {
		return qualification;
	}

	public void setQualification(TeacherQualification qualification) {
		this.qualification = qualification;
	}

	public boolean isAssistant() {
		return assistant;
	}

	public void setAssistant(boolean assistant) {
		this.assistant = assistant;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
    
}
