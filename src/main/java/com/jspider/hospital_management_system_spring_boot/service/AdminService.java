package com.jspider.hospital_management_system_spring_boot.service;


public interface AdminService {
	boolean authenticateAdmin(String identifier, String password);
}
