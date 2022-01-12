package com.example.demo.entity;

import java.util.List;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "vault_table")

public class Vault {
	private List<VaultCategory> categories;
}