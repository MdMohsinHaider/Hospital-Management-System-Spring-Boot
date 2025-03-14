package com.jspider.hospital_management_system_spring_boot.dao;

import java.time.LocalDate;
import java.util.List;

import com.jspider.hospital_management_system_spring_boot.entity.Appointment;
import com.jspider.hospital_management_system_spring_boot.entity.Doctor;
import com.jspider.hospital_management_system_spring_boot.entity.Patient;

public interface AppointmentsDao {
	
	// Save an appointment
	Appointment saveAppointmentDao(Appointment appointment);
	
	// Get all appointments
	List<Appointment> getAllAppointmentsDao();
	
	// Get appointments for a specific doctor
	List<Appointment> getAppointmentsByDoctorDao(Doctor doctor);
	
	// Get appointments for a specific patient
	List<Appointment> getAppointmentsByPatientDao(Patient patient);
	
	// Get appointments by date
	List<Appointment> getAppointmentsByDateDao(LocalDate date);
	
	// Check if an appointment already exists for a doctor
	boolean isDoctorBookedDao(Doctor doctor, LocalDate date);
	
	// Check if an appointment already exists for a patient
	boolean isPatientBookedDao(Patient patient, LocalDate date);
	
	Appointment updateAppointmentDao(int appointmentId, Appointment updatedAppointment);
	
	List<Appointment> getAppointmentsByPatientIdDao(int patientId);
	
}
