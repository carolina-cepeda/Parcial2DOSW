package edu.dosw.dto;

import jakarta.validation.constraints.NotBlank;

public record Plan(
        @NotBlank(message="es obligatorio este campo") String idPlan,
        String nombrePlan,
        int precioPlan,
        int maxDispositivos
) {}
