package com.auca.model;
import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    private Long studentId;
    private String firstName;
    private String lastName;

    @ManyToOne
    private Department department;

    @ManyToMany
    @JoinTable(name = "student_semester",
               joinColumns = @JoinColumn(name = "student_id"),
               inverseJoinColumns = @JoinColumn(name = "semester_id"))
    private List<Semester> semesters;

    @OneToMany(mappedBy = "student")
    private List<StudentRegistration> studentRegistrations;

    @ManyToOne
    private Programme programme;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Semester> getSemesters() {
		return semesters;
	}

	public void setSemesters(List<Semester> semesters) {
		this.semesters = semesters;
	}

	public List<StudentRegistration> getStudentRegistrations() {
		return studentRegistrations;
	}

	public void setStudentRegistrations(List<StudentRegistration> studentRegistrations) {
		this.studentRegistrations = studentRegistrations;
	}

	public Programme getProgramme() {
		return programme;
	}

	public void setProgramme(Programme programme) {
		this.programme = programme;
	}
    
}
