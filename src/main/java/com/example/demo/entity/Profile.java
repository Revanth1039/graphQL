package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "profile_table")
public class Profile {

	private String avatar;

	private String email;

	private String firstName;

	@Id
	private String id;

	private String lastName;



	private Integer numberOfNotifications;

	private Integer numberOfOpenCases;

	private Integer numberOFPendingTasks;

	
//	private List<Profile> partners;
	@OneToMany(targetEntity = Task.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="profile_id",referencedColumnName = "id")
	private List<Task> tasks;
	
	@OneToMany(targetEntity = Case.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="profile_id",referencedColumnName = "id")
	private List<Case> cases;
	
	@ManyToMany(targetEntity = Profile.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="partners",referencedColumnName = "id")
	private List<Profile> partners;
	
	
/*
 * Vault,notification attributes pending
 */
	
//	private List<Vault> vault;
//	private Notification notifications;
	

}
