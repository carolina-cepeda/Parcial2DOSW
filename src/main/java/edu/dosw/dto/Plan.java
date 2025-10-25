package edu.dosw.dto;


public record Plan{
    @NotBlank(message="es obligatorio este campo") String idPlan;
    String nombrePlan;
    int precioPlan;
    int maxDispositivos;
}