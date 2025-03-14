package com.jspider.hospital_management_system_spring_boot.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.hospital_management_system_spring_boot.dao.AppointmentsDao;
import com.jspider.hospital_management_system_spring_boot.dao.DoctorsDao;
import com.jspider.hospital_management_system_spring_boot.dao.PatientsDao;
import com.jspider.hospital_management_system_spring_boot.entity.Appointment;
import com.jspider.hospital_management_system_spring_boot.entity.Doctor;
import com.jspider.hospital_management_system_spring_boot.entity.Patient;

@Service
public class AppointmentService implements AppointmentsService {
	
	@Autowired
	private AppointmentsDao appointmentsDao;
	
	@Autowired
	private DoctorsDao doctorsDao;
	
	@Autowired
	private PatientsDao patientsDao;
	
	@Override
	public Appointment saveAppointment(Appointment appointment) {
		 // Fetch complete Doctor entity
		Optional<Doctor> optional = doctorsDao.getDoctorByIdDao(appointment.getDoctor().getDoctorId());
		if (!optional.isPresent()) return null;
		
		// Fetch complete Patient entity
		Optional<Patient> optional2 = patientsDao.getPatientByIdDao(appointment.getPatient().getPatientId());
		if (!optional2.isPresent()) return null;
		
		// Set the fetched entities in the appointment object
		
		appointment.setDoctor(optional.get());
		appointment.setPatient(optional2.get());
		
		return appointmentsDao.saveAppointmentDao(appointment);
	}

	@Override
	public List<Appointment> getAllAppointments() {
		return appointmentsDao.getAllAppointmentsDao();
	}

	@Override
	public List<Appointment> getAppointmentsByDoctor(Doctor doctor) {
		return appointmentsDao.getAppointmentsByDoctorDao(doctor);
	}

	@Override
	public List<Appointment> getAppointmentsByPatient(Patient patient) {
		return appointmentsDao.getAppointmentsByPatientDao(patient);
	}

	@Override
	public List<Appointment> getAppointmentsByDate(LocalDate date) {
		return appointmentsDao.getAppointmentsByDateDao(date);
	}

	@Override
	public boolean isDoctorBooked(Doctor doctor, LocalDate date) {
		return appointmentsDao.isDoctorBookedDao(doctor, date);
	}

	@Override
	public boolean isPatientBooked(Patient patient, LocalDate date) {
		return appointmentsDao.isPatientBookedDao(patient, date);
	}

	@Override
	public Appointment updateAppointment(int appointmentId, Appointment updatedAppointment) {
		return appointmentsDao.updateAppointmentDao(appointmentId, updatedAppointment);
	}

	@Override
	public List<Appointment> getAppointmentsByPatientId(int patientId) {
		return appointmentsDao.getAppointmentsByPatientIdDao(patientId);
	}
	
	
	

}
