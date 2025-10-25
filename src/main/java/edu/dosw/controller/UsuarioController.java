package edu.dosw.controller;

import edu.dosw.dto.UsuarioRequest;
import edu.dosw.dto.Suscripcion;
import edu.dosw.dto.Pago;
import edu.dosw.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/suscribirse")
    public String suscribirUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        usuarioService.suscribirUsuario(usuarioRequest);
        return "Usuario suscrito correctamente";
    }
}
