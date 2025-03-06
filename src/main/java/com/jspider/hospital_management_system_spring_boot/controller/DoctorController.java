package com.jspider.hospital_management_system_spring_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.hospital_management_system_spring_boot.entity.Doctor;
import com.jspider.hospital_management_system_spring_boot.service.DoctorsService;

@RestController
@RequestMapping(value = "/api/doctor")
public class DoctorController {

	@Autowired
	private DoctorsService service;
	
	@PostMapping
	public Doctor saveDoctorController(@RequestBody Doctor doctor) {
		if (service.existsByEmail(doctor.getEmail()) || service.existsByContactNumber(doctor.getContactNumber())) {
			return null;
		}
		return service.saveDoctor(doctor);
	}
	
	@GetMapping
	public List<Doctor> getAllDoctorController() {
		return service.getAllDoctor();
	}
}
