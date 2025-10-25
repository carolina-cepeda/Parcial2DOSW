package edu.dosw.repository;

import edu.dosw.dto.UsuarioRequest;
import edu.dosw.dto.Suscripcion;
import edu.dosw.dto.Pago;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository {

    public void guardarUsuario(UsuarioRequest usuario) {
        System.out.println("Guardando usuario: " + usuario.nombreCliente());
    }

    public void guardarSuscripcion(Suscripcion suscripcion) {
        System.out.println("Guardando suscripción: " + suscripcion.idSuscrpcion());
    }

    public void guardarPago(Pago pago) {
        System.out.println("Guardando pago: " + pago.idPago());
    }
}
