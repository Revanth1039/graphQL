package com.example.demo.entity;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.util.Date;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


enum TaskState {
	  FINISHED,
	  PENDING,
	  NOT_AVAILABLE
	}
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Task {
	
	@Id
	@Builder.Default
	private String id= UUID.randomUUID().toString();
	private String name,description,message;
	private Date date;
	private Integer numberOfSteps,numberOfStepsCompleted;
	private TaskState state ;
	private boolean isApproved;
	@ManyToOne(targetEntity = ServiceProvider.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="provider_id",referencedColumnName = "id")
	private ServiceProvider serviceProvider;
	@ManyToOne(targetEntity = Case.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="case_id",referencedColumnName = "id")
	private Case cases;
	
	/*
	 * TaskStep attribute is pending
	 */
}
