package com.labs.lab_add_and_update.controller.dto;

import com.labs.lab_add_and_update.model.Employee;
import lombok.Getter;
import java.time.LocalDate;
@Getter
public class UpdatePatientDTO {
    private String name;
    private LocalDate dateOfBirth;
    private Employee admittedBy;
}
