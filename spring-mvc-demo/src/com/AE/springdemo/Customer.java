package com.AE.springdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
private String firstName;


@NotNull(message="is required")
@Size(min=1, message="is required")
private String lastName;

@Min(value=0, message="must be greater than or equal to zero")
@Max(value=10, message="must be less than or equal to 10")
@NotNull(message="is required")
private Integer freePass;

@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
private String zipCode;

@NotNull(message="is required")
@CourseCode
private String courseCode;



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
public Integer getFreePass() {
	return freePass;
}
public void setFreePass(Integer freePass) {
	this.freePass = freePass;
}
public String getZipCode() {
	return zipCode;
}
public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}
public String getCourseCode() {
	return courseCode;
}
public void setCourseCode(String courseCode) {
	this.courseCode = courseCode;
}




}
