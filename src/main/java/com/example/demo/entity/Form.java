package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

enum FormState {
	EMPTY, DRAFT, COMPLETE,
}

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "form_table")

public class Form {

	private boolean canEdit;

	private String description;
	
	private FormState state;
	@Id
	private String title;

//	@OneToMany(targetEntity = FormQuestion.class,cascade = CascadeType.ALL)
//	@JoinColumn(name ="form_title",referencedColumnName = "title")
//	private List<FormQuestion> questions;
	
	/*
	 * FormQuestion dt based attribute missing
	 */

}