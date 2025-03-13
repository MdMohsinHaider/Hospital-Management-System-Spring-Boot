package com.jspider.hospital_management_system_spring_boot.reposetory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspider.hospital_management_system_spring_boot.entity.DoctorNote;
import com.jspider.hospital_management_system_spring_boot.entity.Patient;


public interface DoctorNoteRepository extends JpaRepository<DoctorNote, Long> {

    // Find all notes for a specific patient
    List<DoctorNote> findByPatient(Patient patient);
}
