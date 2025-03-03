package com.jspider.hospital_management_system_spring_boot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.hospital_management_system_spring_boot.entity.Patient;
import com.jspider.hospital_management_system_spring_boot.reposetory.PatientReposetory;

@Repository
public class PatientDao implements PatientsDao {

	@Autowired
	private PatientReposetory reposetory;

	@Override
	public Patient save(Patient patient) {
		return reposetory.save(patient);
	}

	@Override
	public Optional<Patient> findById(int patientId) {
		return reposetory.findById(patientId);
	}

	@Override
	public List<Patient> findAll() {
		return reposetory.findAll();
	}

	@Override
	public void deleteById(int patientId) {
		reposetory.deleteById(patientId);
	}

	@Override
	public Optional<Patient> findByContactNumber(Long contactNumber) {
		return reposetory.findByContactNumber(contactNumber);
	}

	@Override
	public Optional<Patient> findByEmail(String email) {
		return reposetory.findByEmail(email);
	}
	
	
}
