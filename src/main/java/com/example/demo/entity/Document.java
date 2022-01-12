package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

enum DocumentType {
	PDF, IMG
}

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Document {

	@Id
	private String title;
	
	private String file;
	
	private Date uploadedOn;
	
	private DocumentType type;
}
