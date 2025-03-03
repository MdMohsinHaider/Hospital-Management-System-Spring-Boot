package com.jspider.hospital_management_system_spring_boot.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "patients") 
public class Patient {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;

	@Column(nullable = false, unique = true)
    private Long contactNumber;
	
	@Column(nullable = false, unique = true)
    private String password;
	
	@Column(unique = true)
    private String email;
	
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @Column(nullable = false)
    private int gender;
    
    @Column(nullable = false)
    private String address;

    private Long emergencyContact;

    private String bloodType;
    
}
