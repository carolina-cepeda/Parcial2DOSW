package edu.dosw.service;

import edu.dosw.dto.UsuarioRequest;
import edu.dosw.dto.Suscripcion;
import edu.dosw.dto.Pago;
import edu.dosw.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void suscribirUsuario(UsuarioRequest request) {
        usuarioRepository.guardarUsuario(request);

        String idSuscripcion = UUID.randomUUID().toString();
        Date fechaInicio = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaInicio);
        calendar.add(Calendar.MONTH, 1);
        Date fechaFin = calendar.getTime();

        Suscripcion suscripcion = new Suscripcion(
                idSuscripcion,
                request.plan(),
                fechaInicio
        );

        Pago pago = new Pago(
                UUID.randomUUID().toString(),
                idSuscripcion,
                fechaInicio,
                fechaFin,
                "abierto"
        );
        usuarioRepository.guardarSuscripcion(suscripcion);
        usuarioRepository.guardarPago(pago);
    }
}
