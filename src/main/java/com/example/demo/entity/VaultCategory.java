package com.example.demo.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "vaultCategory_table")
public class VaultCategory {

	@Id
	@Builder.Default
	private String id = UUID.randomUUID().toString();

	private String name;

//	private List<VaultCategoryOption> vaultcategoryoption;

}