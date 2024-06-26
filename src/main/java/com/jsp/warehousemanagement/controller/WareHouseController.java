package com.jsp.warehousemanagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.warehousemanagement.request.WareHouseRequest;
import com.jsp.warehousemanagement.utility.ResponseStructure;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/v2")
public class WareHouseController {
	

	@PostMapping("/warehouse")
	public String createWareHouse(@RequestBody @Valid  WareHouseRequest wareHouseRequest){
		return "warehouse created";
	}
	
	

}
