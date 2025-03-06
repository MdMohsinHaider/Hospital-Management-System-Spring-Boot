package com.jspider.hospital_management_system_spring_boot.dao;

import java.util.List;
import java.util.Optional;

import com.jspider.hospital_management_system_spring_boot.entity.Patient;

public interface PatientsDao {

	Patient savePatientDao(Patient patient);
	List<Patient> getAllPatientDao();
	Optional<Patient> getPatientByIdDao(int id);
	Patient findByContactNumberDao(String contactNumber);
	Patient findByEmailDao(String email);
	boolean existsByEmailDao(String email);
	boolean isValidPatient(int patientId, String password);
}
