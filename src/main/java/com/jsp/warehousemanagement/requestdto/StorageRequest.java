package com.jsp.warehousemanagement.requestdto;

import java.util.List;

import com.jsp.warehousemanagement.enums.MaterialType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StorageRequest {
	@NotNull(message = "Blockname cannot be null")
	@NotBlank(message = "Blockname cannot be blank")
	private String blockName;
	
	@NotNull(message = "Section cannot be null")
	@NotBlank(message = "Section"
			+ " cannot be blank")
	private String section;
	private double lengthInMetres;
	private double breadthInMetres;
	private double heightInMetres;
	private double capacityInkg;
	private List<MaterialType> materialTypes;

	

}
