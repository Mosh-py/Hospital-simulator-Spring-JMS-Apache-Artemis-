package org.hospital.model;

import java.util.Date;

import org.springframework.boot.jackson.JsonComponent;

import lombok.Data;

@Data
@JsonComponent
public class Patient {

	
	private String firstName;
	private String lastName;
	
	private String email; 
	private int age;
	private boolean ourMember;
	private String gender;
	private String address;
	private long time = new Date().getTime();
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
}
