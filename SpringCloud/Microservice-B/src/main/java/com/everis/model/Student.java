package com.everis.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
@Table(name="students")
public class Student implements Serializable {
	
	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	
	@Column(name = "gender", nullable = false, length = 80)
	private String gender;
	
	@Column(name = "first_name", nullable = false, length = 80)
	private String firstName;
	
	@Column(name = "middle_name", nullable = false, length = 80)
	private String middleName;
	
	@Column(name = "last_name", nullable = false, length = 80)
	private String lastName;
	
	@Column(name = "date_of_birth", nullable = false)	
	@JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dateBirth;	
	
	//@Column(name = "class_id")
	//private Integer classId;

}
