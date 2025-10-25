package edu.dosw.dto;

import java.util.Date;

public record Pago(
        String idPago,
        String idSuscripcion,
        Date fechaInicio,
        Date fechaFin,
        String estado // abierto, cerrado
) {}
