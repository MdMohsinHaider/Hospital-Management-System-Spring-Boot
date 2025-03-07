package com.jspider.hospital_management_system_spring_boot.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.hospital_management_system_spring_boot.entity.Appointment;
import com.jspider.hospital_management_system_spring_boot.service.AppointmentsService;

@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentsService service;
	
	@PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
		
		if (service.isDoctorBooked(appointment.getDoctor(), appointment.getAppointmentDate())) {
			throw new RuntimeException("Doctor is already booked on this date.");
		}
		if (service.isPatientBooked(appointment.getPatient(), appointment.getAppointmentDate())) {
			throw new RuntimeException("Patient already has an appointment on this date.");
		}
		return service.saveAppointment(appointment);
	}
	
	@GetMapping
    public List<Appointment> getAllAppointments() {
		return service.getAllAppointments();
	}
	
	
	// Get appointments by date
    @GetMapping("/date")
    public List<Appointment> getAppointmentsByDate(@RequestParam String date) {
    	return service.getAppointmentsByDate(LocalDate.parse(date));
    }
    
	
	
	
	
	
	
	
	

}
