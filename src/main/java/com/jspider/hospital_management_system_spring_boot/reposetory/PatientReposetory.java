package com.jspider.hospital_management_system_spring_boot.reposetory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspider.hospital_management_system_spring_boot.entity.Patient;

/**
 * Repository interface for Patient entity.
 * Extends JpaRepository to provide CRUD operations.
 */
public interface PatientReposetory extends JpaRepository<Patient, Integer> {

	/**
     * Finds a patient by their contact number.
     *
     * @param contactNumber The contact number of the patient.
     * @return An Optional containing the patient if found, otherwise empty.
     */
    Optional<Patient> findByContactNumber(Long contactNumber);

    /**
     * Finds a patient by their email address.
     *
     * @param email The email address of the patient.
     * @return An Optional containing the patient if found, otherwise empty.
     */
    Optional<Patient> findByEmail(String email);
    
    /**
     * Finds a patient by their patient ID and password.
     *
     * @param patientId The unique patient ID.
     * @param password The password of the patient.
     * @return An Optional containing the patient if found, otherwise empty.
     */
    Optional<Patient> findByPatientIdAndPassword(int patientId, String password);
}
