package com.example.demo.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


enum MilestoneState {
	  FINISHED,
	  PENDING,
	  NOT_AVAILABLE
	}
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Milestone {
	
	@Id
	@Builder.Default
	private String id= UUID.randomUUID().toString();
	private String description,icon,name;
	private MilestoneState state;
	private Integer numberOfPendingTasks,numberOfTasks,progress;
	@OneToMany(targetEntity = Task.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="milestone_id",referencedColumnName = "id")
	private List<Task> tasks;
	
}
