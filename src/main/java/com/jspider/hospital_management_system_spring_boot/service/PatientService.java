package com.jspider.hospital_management_system_spring_boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.hospital_management_system_spring_boot.dao.PatientsDao;
import com.jspider.hospital_management_system_spring_boot.entity.Patient;

@Service
public class PatientService implements PatientsService{
	
	@Autowired
	private PatientsDao dao;

	@Override
	public Patient savePatient(Patient patient) {
		return dao.save(patient);
	}

	@Override
	public Optional<Patient> getPatientById(int patientId) {
		return dao.findById(patientId);
	}

	@Override
	public List<Patient> getAllPatients() {
		return dao.findAll();
	}

	@Override
	public boolean deletePatientById(int patientId) {
		 if (patientId < 0) return false;
		 return true;
	}

	@Override
	public Optional<Patient> getPatientByContactNumber(Long contactNumber) {
		if (contactNumber == null || !String.valueOf(contactNumber).matches("\\d{10}")) {
			return Optional.empty();
		}
		return dao.findByContactNumber(contactNumber);
	}

	@Override
	public Optional<Patient> getPatientByEmail(String email) {
		return dao.findByEmail(email);
	}

}
