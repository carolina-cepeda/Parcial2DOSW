package edu.dosw.dto;

import jakarta.validation.constraints.NotBlank;

public record UsuarioRequest(
        @NotBlank(message="es obligatorio este campo") String nombreCliente,
        String tipoDocumento,
        String documentoCliente,
        String correoCliente,
        String Direccion,
        String contraseña,
        String plan,
        String metodoPago
) {}
