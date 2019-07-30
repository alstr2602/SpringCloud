package com.everis.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="teachers")
public class Teacher implements Serializable {
	
	@Id
	@Column(name="teacher_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer teacherId;
	
	@Column(name="school_id")
	private Integer schoolId;
	
	@Column(name = "gender", nullable = false, length = 80)
	private String gender;
	
	@Column(name = "first_name", nullable = false, length = 80)
	private String firstName;
	
	@Column(name = "middle_name", nullable = false, length = 80)
	private String middleName;
	
	@Column(name = "last_name", nullable = false, length = 80)
	private String lastName;
	
	@Column(name = "other_teacher_details", nullable = false, length = 80)
	private String otherTeacherDetail;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy ="teacher")
	private List<Class> classes;
	

}
