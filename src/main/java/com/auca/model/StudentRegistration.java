package com.auca.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class StudentRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date registeredDate;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Semester semester;

    @Enumerated(EnumType.STRING)
    private studentRegistrationStatus status;

    
    public enum studentRegistrationStatus { 
	    PENDING,
	    ADMITTED,
	    REJECTED
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getRegisteredDate() {
		return registeredDate;
	}


	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public Semester getSemester() {
		return semester;
	}


	public void setSemester(Semester semester) {
		this.semester = semester;
	}


	public studentRegistrationStatus getStatus() {
		return status;
	}


	public void setStatus(studentRegistrationStatus status) {
		this.status = status;
	}
    
    

}
