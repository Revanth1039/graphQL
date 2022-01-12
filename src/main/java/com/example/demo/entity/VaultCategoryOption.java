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
	private String name;
	
	@OneToMany(targetEntity = Document.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="vault_id",referencedColumnName = "id")
	private List<Document> documents;

	@OneToMany(targetEntity = Form.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="vault_id",referencedColumnName = "id")
	private List<Form> forms;

	

}
