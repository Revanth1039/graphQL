package com.example.demo.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InvitationNotification {
	@Id
	String title;
	String date,description;
	boolean isRead;
	@OneToOne(targetEntity = ServiceProvider.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="provider_id",referencedColumnName = "id")
	ServiceProvider sendBy;
}
