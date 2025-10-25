package edu.dosw.dto;


public record Suscripcion{
    @NotBlank(message="es obligatorio este campo") String idSuscrpcion;
   String idPlan;
   Date fechaCompra;

}