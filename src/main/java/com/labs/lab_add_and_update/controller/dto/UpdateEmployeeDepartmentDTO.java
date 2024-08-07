package com.labs.lab_add_and_update.controller.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;

@Getter
public class UpdateEmployeeDepartmentDTO {
    @NotEmpty
    private String department;
}
