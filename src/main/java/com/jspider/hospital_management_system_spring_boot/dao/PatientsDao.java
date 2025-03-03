package com.jspider.hospital_management_system_spring_boot.dao;

import java.util.List;
import java.util.Optional;

import com.jspider.hospital_management_system_spring_boot.entity.Patient;

public interface PatientsDao {
	 /**
     * Saves a new patient or updates an existing patient in the database.
     *
     * @param patient The patient entity to be saved.
     * @return The saved patient entity.
     */
    Patient saveDao(Patient patient);

    /**
     * Retrieves a patient by their unique patient ID.
     *
     * @param patientId The ID of the patient to retrieve.
     * @return An Optional containing the patient if found, otherwise empty.
     */
    Optional<Patient> findByIdDao(int patientId);

    /**
     * Retrieves all patients from the database.
     *
     * @return A list of all patients.
     */
    List<Patient> findAllDao();

    /**
     * Deletes a patient by their unique patient ID.
     *
     * @param patientId The ID of the patient to delete.
     */
    void deleteByIdDao(int patientId);

    /**
     * Finds a patient by their contact number.
     *
     * @param contactNumber The contact number of the patient.
     * @return An Optional containing the patient if found, otherwise empty.
     */
    Optional<Patient> findByContactNumberDao(Long contactNumber);

    /**
     * Finds a patient by their email address.
     *
     * @param email The email address of the patient.
     * @return An Optional containing the patient if found, otherwise empty.
     */
    Optional<Patient> findByEmailDao(String email);
    
    
    /**
     * Finds a patient by their email address.
     *
     * @param patientId and password of the patient.
     * @return An Optional containing the patient if found, otherwise empty.
     */
    Optional<Patient> authPatientDao(int patientId, String password);
}
