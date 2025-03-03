package com.jspider.hospital_management_system_spring_boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.hospital_management_system_spring_boot.entity.Patient;
import com.jspider.hospital_management_system_spring_boot.service.PatientsService;

@RestController
@RequestMapping(value = "/api/patient")
public class PatientController {
	
	@Autowired
	private PatientsService service;
	
	@PostMapping
	public Patient savePatient(@RequestBody Patient patient) {
		return service.savePatient(patient);
	}
	
	@GetMapping(value = "/{id}")
	Optional<Patient> getPatientByIdController(@PathVariable int id) {
		return service.getPatientById(id);
	}
	
	@GetMapping
	public List<Patient> getAllPatientController(){
		return service.getAllPatients();
	}
	
	@DeleteMapping(value = "/{id}")
	public boolean deletePatientById(@PathVariable int id) {
		return service.deletePatientById(id);
	}
	
	
	@GetMapping(value = "/contactNumber/{contactNumber}")
	public Optional<Patient> getPatientByContactNumberController(@PathVariable Long contactNumber){
		return service.getPatientByContactNumber(contactNumber);
	}
	
	@GetMapping(value = "/email/{email}")
	public Optional<Patient> getPatientByEmailController(@PathVariable String email){
		return service.getPatientByEmail(email);
	}
	
	@PostMapping(value = "/auth/patientId/{patientId}/password/{password}")
	public boolean patientAuthController(@PathVariable int patientId, @PathVariable String password) {
		return service.patientAuth(patientId, password);
	}
}
