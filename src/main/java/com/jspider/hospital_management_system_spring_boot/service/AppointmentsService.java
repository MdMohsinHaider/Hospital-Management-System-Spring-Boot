package com.jspider.hospital_management_system_spring_boot.service;

import java.time.LocalDate;
import java.util.List;

import com.jspider.hospital_management_system_spring_boot.entity.Appointment;
import com.jspider.hospital_management_system_spring_boot.entity.Doctor;
import com.jspider.hospital_management_system_spring_boot.entity.Patient;

public interface AppointmentsService {

	// Save an appointment
	Appointment saveAppointment(Appointment appointment);
		
	// Get all appointments
	List<Appointment> getAllAppointments();
		
	// Get appointments for a specific doctor
	List<Appointment> getAppointmentsByDoctor(Doctor doctor);
		
	// Get appointments for a specific patient
	List<Appointment> getAppointmentsByPatient(Patient patient);
		
	// Get appointments by date
	List<Appointment> getAppointmentsByDate(LocalDate date);
		
	// Check if an appointment already exists for a doctor
	boolean isDoctorBooked(Doctor doctor, LocalDate date);
		
	// Check if an appointment already exists for a patient
	boolean isPatientBooked(Patient patient, LocalDate date);
	
	// Update an existing appointment
	Appointment updateAppointment(int appointmentId, Appointment updatedAppointment);
	
	// get Appointment of patient 
	List<Appointment> getAppointmentsByPatientId(int patientId);
}
