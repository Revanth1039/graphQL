package com.example.demo.entity;

import java.util.List;
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
@Table(name = "vaultCategoryOption_table")
public class VaultCategoryOption {

	@Id
	@Builder.Default
	private String id = UUID.randomUUID().toString();

//	private List<Document> document;
//
//	private List<Form> form;

	private String name;

}

