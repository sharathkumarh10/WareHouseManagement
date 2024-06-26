package com.jsp.warehousemanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class WareHouse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int warehouseId;
	private String name;

}
