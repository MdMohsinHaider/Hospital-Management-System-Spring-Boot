package com.jspider.hospital_management_system_spring_boot.dao;


public interface AdminDao {

	boolean getAdminByIdAndPassword(int adminId, String password);

    boolean getAdminByEmailAndPassword(String email, String password);
}
