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
@Table(name="subjects")
public class Subject implements Serializable {
	
	@Id
	@Column(name="subject_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer subjectId;
	
	@Column(name="subject_name")
	private String subjectName;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy ="subject")
	private List<Class> classes;
		

}
