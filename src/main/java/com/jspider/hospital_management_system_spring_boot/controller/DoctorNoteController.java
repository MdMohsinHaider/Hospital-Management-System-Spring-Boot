package com.jspider.hospital_management_system_spring_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jspider.hospital_management_system_spring_boot.entity.DoctorNote;
import com.jspider.hospital_management_system_spring_boot.service.DoctorNoteService;

@RestController
@RequestMapping("/api/doctor-notes")
@CrossOrigin(value = "http://localhost:5173")
public class DoctorNoteController {

    @Autowired
    private DoctorNoteService doctorNoteService;

    // Add a new note
    @PostMapping
    public ResponseEntity<?> addDoctorNote(@RequestBody DoctorNote doctorNote) {
        try {
            DoctorNote savedNote = doctorNoteService.saveDoctorNote(doctorNote);
            return ResponseEntity.ok(savedNote);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    

    // Get all notes by patient ID
    @GetMapping("/patient/{patientId}")
    public List<DoctorNote> getDoctorNotesByPatient(@PathVariable Integer patientId) {
        return doctorNoteService.getNotesByPatientId(patientId);
    }
}
