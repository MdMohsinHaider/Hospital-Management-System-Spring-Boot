package com.jspider.hospital_management_system_spring_boot.service;

import java.util.List;
import java.util.Optional;

import com.jspider.hospital_management_system_spring_boot.entity.Patient;

public interface PatientsService {
	Patient savePatient(Patient patient);
	List<Patient> getAllPatient();
	Optional<Patient> getPatientById(int id);
	Patient findByContactNumber(String contactNumber);
	Patient findByEmail(String email);
	boolean existsByEmail(String email);
	boolean authenticatePatientCredentials(int patientId, String password);
}
