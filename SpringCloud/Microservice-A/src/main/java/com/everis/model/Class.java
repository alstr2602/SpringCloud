package com.everis.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "classes")
public class Class implements Serializable {
	
	@Id
	@Column(name="class_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer classId;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="subject_id")
	private Subject subject;

	@ManyToOne(optional = false)
	@JoinColumn(name="teacher_id")
	private Teacher teacher;
	
	@Column(name="class_code")
	private String classCode;
	
	@Column(name="class_name")
	private String className;
	
	@Column(name="Date_From")
	private Date dateFrom;
	
	@Column(name="date_to")
	private Date dateTo;
	
	

}
