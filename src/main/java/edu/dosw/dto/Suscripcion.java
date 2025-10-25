package edu.dosw.dto;

import java.util.Date;
import jakarta.validation.constraints.NotBlank;

public record Suscripcion(
        @NotBlank(message="es obligatorio este campo") String idSuscrpcion,
        String idPlan,
        Date fechaCompra
) {}
