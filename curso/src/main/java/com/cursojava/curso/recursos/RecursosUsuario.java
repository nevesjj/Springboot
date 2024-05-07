package com.cursojava.curso.recursos;

import com.cursojava.curso.entidades.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class RecursosUsuario {

    @GetMapping
    public ResponseEntity<Usuario> encontrar() {
        Usuario u = new Usuario(1L, "Maria", "maria@gmail.com", "532529632", "12345");
        return ResponseEntity.ok().body(u);
    }
}
