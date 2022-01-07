package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "form_table")

public class Form {

	private boolean canEdit;

	private String description;
	
	@Id
	private String title;

//	private List<FormQuestion> questions;

}