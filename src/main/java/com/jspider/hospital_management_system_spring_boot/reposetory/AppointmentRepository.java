package com.jspider.hospital_management_system_spring_boot.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspider.hospital_management_system_spring_boot.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}
