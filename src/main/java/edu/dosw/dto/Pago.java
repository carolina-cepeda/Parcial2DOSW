package edu.dosw.dto;


public record Pago{
  String idPago;
  String idSuscripcion;
  Date fechaInicio;
  Date fechaFin;
  String estado; // abierto, cerrado

}