package com.jspider.hospital_management_system_spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.hospital_management_system_spring_boot.dao.AdminDao;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDao dao;

	@Override
	public boolean authenticateAdmin(String identifier, String password) {
		try {
            int adminId = Integer.parseInt(identifier);
            return dao.getAdminByIdAndPassword(adminId, password);
        } catch (NumberFormatException e) {
            return dao.getAdminByEmailAndPassword(identifier, password);
        }
	}

}
