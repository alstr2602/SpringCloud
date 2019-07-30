package com.everis.model;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;

@Data
public class Student implements Serializable {
	
	private Integer studentId;	

	private String gender;	

	private String firstName;	

	private String middleName;	
	
	private String lastName;
	
    private LocalDate dateBirth;

		

}
