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
	public Patient saveDao(Patient patient) {
		return reposetory.save(patient);
	}

	@Override
	public Optional<Patient> findByIdDao(int patientId) {
		return reposetory.findById(patientId);
	}

	@Override
	public List<Patient> findAllDao() {
		return reposetory.findAll();
	}

	@Override
	public void deleteByIdDao(int patientId) {
		reposetory.deleteById(patientId);
	}

	@Override
	public Optional<Patient> findByContactNumberDao(Long contactNumber) {
		return reposetory.findByContactNumber(contactNumber);
	}

	@Override
	public Optional<Patient> findByEmailDao(String email) {
		return reposetory.findByEmail(email);
	}

	@Override
	public Optional<Patient> authPatientDao(int patientId, String password) {
		return reposetory.findByPatientIdAndPassword(patientId, password);
	}
	
}
