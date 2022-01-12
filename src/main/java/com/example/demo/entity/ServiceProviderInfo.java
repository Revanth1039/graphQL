package com.example.demo.entity;

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
public class ServiceProviderInfo {

	@Id
	private String zipCode;
	
	private String place, address, email, phoneNumber;
}
