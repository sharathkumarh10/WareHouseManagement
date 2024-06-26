package com.jsp.warehousemanagement.service;

import org.springframework.http.ResponseEntity;

import com.jsp.warehousemanagement.request.AdminRequest;
import com.jsp.warehousemanagement.responsedto.AdminResponse;
import com.jsp.warehousemanagement.utility.ResponseStructure;

public interface AdminService {

	public ResponseEntity<ResponseStructure<AdminResponse>> createSuperAdmin(
			AdminRequest adminRequest);
}
