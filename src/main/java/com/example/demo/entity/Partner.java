package com.example.demo.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Partner {

	@Id
	@Builder.Default
	private String id = UUID.randomUUID().toString();
	
	private String email, avatar, firstName, lastName;
	
	private Integer numberOfNotifications;
	
	private Integer numberOfOpenCases, numberOfPendingTasks;
	
//	@ManyToOne(optional=true)
//	private Case cases;
}
