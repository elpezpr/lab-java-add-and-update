package com.labs.lab_add_and_update.repository;

import com.labs.lab_add_and_update.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByDateOfBirthBetween(LocalDate startDate, LocalDate endDate);
    List<Patient> findByAdmittedByDepartment(String department);
    List<Patient> findByAdmittedByStatus(String status);
}