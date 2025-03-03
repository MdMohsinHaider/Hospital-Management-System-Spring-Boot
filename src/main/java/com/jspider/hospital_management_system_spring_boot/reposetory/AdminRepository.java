package com.jspider.hospital_management_system_spring_boot.reposetory;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jspider.hospital_management_system_spring_boot.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	boolean existsByIdAndPassword(int id, String password);

    boolean existsByEmailAndPassword(String email, String password);
}
