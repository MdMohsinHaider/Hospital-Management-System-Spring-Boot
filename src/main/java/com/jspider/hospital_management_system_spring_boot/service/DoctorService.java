package com.jspider.hospital_management_system_spring_boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.hospital_management_system_spring_boot.dao.DoctorsDao;
import com.jspider.hospital_management_system_spring_boot.entity.Doctor;

@Service
public class DoctorService implements DoctorsService {
	
	@Autowired
	private DoctorsDao dao;

	@Override
	public Doctor saveDoctor(Doctor doctor) {
		return dao.saveDoctorDao(doctor);
	}

	@Override
	public List<Doctor> getAllDoctor() {
		return dao.getAllDoctorDao();
	}

	@Override
	public Optional<Doctor> getDoctorById(long id) {
		return dao.getDoctorByIdDao(id);
	}

	@Override
	public Doctor findByEmail(String email) {
		return dao.findByContactNumberDao(email);
	}

	@Override
	public Doctor findByContactNumber(String contactNumber) {
		return dao.findByContactNumberDao(contactNumber);
	}

	@Override
	public List<Doctor> findBySpecialization(String specialization) {
		return dao.findBySpecializationDao(specialization);
	}

	@Override
	public boolean existsByEmail(String email) {
		return dao.existsByEmailDao(email);
	}

	@Override
	public boolean existsByContactNumber(String contactNumber) {
		return dao.existsByContactNumberDao(contactNumber);
	}
	

}
