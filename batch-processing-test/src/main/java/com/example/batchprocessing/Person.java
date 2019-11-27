package com.example.batchprocessing;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Person {

    private String lastName;
    private String firstName;
    private Boolean isActive;
    
    @Temporal(TemporalType.DATE)
    @Column(name="CREATED_TS")
    private String createdTS;
    private LocalDate reminderDate;
    
	public String getCreatedTS() {
		return createdTS;
	}
	public void setCreatedTS(String createdTS) {
		this.createdTS = createdTS;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	
	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", isActive=" + isActive + ", createdTS="
				+ createdTS + ", reminderDate=" + reminderDate + "]";
	}
	public Person() {}
	public Person(String lastName, String firstName, Boolean isActive, String createdTS) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.isActive = isActive;
		this.createdTS = createdTS;
		this.reminderDate = LocalDate.parse(createdTS).plusDays(3);
	}

	
	


}
