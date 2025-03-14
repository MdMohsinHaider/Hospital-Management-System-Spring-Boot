package com.jspider.hospital_management_system_spring_boot.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.hospital_management_system_spring_boot.entity.Appointment;
import com.jspider.hospital_management_system_spring_boot.entity.Doctor;
import com.jspider.hospital_management_system_spring_boot.entity.Patient;
import com.jspider.hospital_management_system_spring_boot.reposetory.AppointmentRepository;

@Repository
public class AppointmentDao implements AppointmentsDao {

	@Autowired
	private AppointmentRepository repository;
	
	@Autowired
	private DoctorsDao doctorsDao;
	
	@Autowired
	private PatientsDao patientsDao;
	
	@Override
	public Appointment saveAppointmentDao(Appointment appointment) {
		return repository.save(appointment);
	}

	@Override
	public List<Appointment> getAllAppointmentsDao() {
		return repository.findAll();
	}

	@Override
	public List<Appointment> getAppointmentsByDoctorDao(Doctor doctor) {
		return repository.findByDoctor(doctor);
	}

	@Override
	public List<Appointment> getAppointmentsByPatientDao(Patient patient) {
		return repository.findByPatient(patient);
	}

	@Override
	public List<Appointment> getAppointmentsByDateDao(LocalDate date) {
		return repository.findByAppointmentDate(date);
	}

	@Override
	public boolean isDoctorBookedDao(Doctor doctor, LocalDate date) {
		return repository.existsByDoctorAndAppointmentDate(doctor, date);
	}

	@Override
	public boolean isPatientBookedDao(Patient patient, LocalDate date) {
		return repository.existsByPatientAndAppointmentDate(patient, date);
	}

	@Override
	public Appointment updateAppointmentDao(int appointmentId, Appointment updatedAppointment) {
		Optional<Appointment> optional = repository.findById(appointmentId);
		if (!optional.isPresent()) return null; 
		
		Appointment existingAppointment = optional.get();
		
		// Fetch full Doctor entity
		Optional<Doctor> optionalDr =doctorsDao.getDoctorByIdDao(updatedAppointment.getDoctor().getDoctorId());
		if(!optionalDr.isPresent()) return null;
		
		// Fetch full Patient entity
		Optional<Patient> optionalPa = patientsDao.getPatientByIdDao(updatedAppointment.getPatient().getPatientId());
		if(!optionalPa.isPresent()) return null;
		
		// Update fields
		existingAppointment.setAppointmentDate(updatedAppointment.getAppointmentDate());
		existingAppointment.setDoctor(optionalDr.get());
		existingAppointment.setPatient(optionalPa.get());
		
		// Save and return the updated appointment
		return repository.save(existingAppointment);
		
	}

	@Override
	public List<Appointment> getAppointmentsByPatientIdDao(int patientId) {
		Optional<Patient> optional = patientsDao.getPatientByIdDao(patientId);
		if (!optional.isPresent()) return null;
		
		Patient patient = optional.get();
		return repository.findByPatient(patient);
	}
	
	
	
	

}
