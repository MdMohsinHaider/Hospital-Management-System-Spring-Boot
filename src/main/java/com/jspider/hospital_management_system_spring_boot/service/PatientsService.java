package com.jspider.hospital_management_system_spring_boot.service;

import java.util.List;
import java.util.Optional;

import com.jspider.hospital_management_system_spring_boot.entity.Patient;

/**
 * Service interface for managing Patient entities.
 * Defines business logic methods related to patients.
 */
public interface PatientsService {

	 /**
     * Saves a new patient or updates an existing patient.
     *
     * @param patient The patient entity to be saved.
     * @return The saved patient entity.
     */
    Patient savePatient(Patient patient);

    /**
     * Retrieves a patient by their unique ID.
     *
     * @param patientId The ID of the patient to retrieve.
     * @return An Optional containing the patient if found, otherwise empty.
     */
    Optional<Patient> getPatientById(int patientId);

    /**
     * Retrieves all patients.
     *
     * @return A list of all patients.
     */
    List<Patient> getAllPatients();

    /**
     * Deletes a patient by their unique ID.
     *
     * @param patientId The ID of the patient to delete.
     */
    boolean deletePatientById(int patientId);

    /**
     * Finds a patient by their contact number.
     *
     * @param contactNumber The contact number of the patient.
     * @return An Optional containing the patient if found, otherwise empty.
     */
    Optional<Patient> getPatientByContactNumber(Long contactNumber);

    /**
     * Finds a patient by their email address.
     *
     * @param email The email address of the patient.
     * @return An Optional containing the patient if found, otherwise empty.
     */
    Optional<Patient> getPatientByEmail(String email);
    
    boolean patientAuth(int patientId, String password);
}
