package com.jspider.hospital_management_system_spring_boot.dao;

import org.springframework.stereotype.Repository;

import com.jspider.hospital_management_system_spring_boot.reposetory.AdminRepository;

@Repository
public class AdminImpl implements AdminDao {
	
	private AdminRepository repository;
	
	/**
	 * @param repository
	 */
	public AdminImpl(AdminRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public boolean getAdminByIdAndPassword(int adminId, String password) {
		return repository.existsByIdAndPassword(adminId, password);
	}

	@Override
	public boolean getAdminByEmailAndPassword(String email, String password) {
		return repository.existsByEmailAndPassword(email, password);
	}
	
	
    

	
}
