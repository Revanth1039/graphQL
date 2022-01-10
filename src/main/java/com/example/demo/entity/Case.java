package com.example.demo.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

enum CaseState {
	PENDING, FINISHED
}

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "case_table")
public class Case {
	@Id
	@Builder.Default
	private String id = UUID.randomUUID().toString();

	private String description, endImage, name;

	private Integer numberOfMileStones, numberOfFinishedMilestones, numberOfPartners, numberOfTasks,
			numberOfServiceProviders, numberOfPendingTasks;

	private CaseState state;

	@OneToMany(targetEntity = Milestone.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "case_id", referencedColumnName = "id")
	private List<Milestone> milestones;

	@OneToMany(targetEntity = Profile.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "case_id", referencedColumnName = "id")
	private List<Profile> partners;

	@OneToMany(targetEntity = ServiceProvider.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "case_id", referencedColumnName = "id")
	private List<ServiceProvider> serviceProviders;
}
