package com.anudip.dto;

import java.util.List;

import com.anudip.entity.Batches;
import com.anudip.entity.Department;
import com.anudip.entity.Teacher;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class TeacherDTO 
{
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	//@Column(length=25, nullable = false)
	//@NotBlank(message="Teacher name can not be blank..") // validation
	private String tname;
	
	//@Column(length=25,nullable = false)
	//@NotBlank(message="Trainer surname name can not be blank..") // validation
	private String tsurname;
	
	//@Column(length=25,nullable = false, unique=true)
	//@NotBlank(message="Trainer email can not be blank..") // validation
	//@Email(message="Email id is not proper")
	private String temail;
	
	//@Column(length=25,nullable = false, unique=true)
	//@NotBlank(message="Phone Number can not be blank..") // validation
	private String tphone;
	
	//@Column(length=25,nullable = false)
	//@NotBlank(message="Designation can not be blank..") // validation
	private String designation;

	public TeacherDTO(int tid, String tname, String tsurname, String temail, String tphone, String designation) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tsurname = tsurname;
		this.temail = temail;
		this.tphone = tphone;
		this.designation = designation;
	}

	public TeacherDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
