package com.senai.primeiropassos.controller;

import com.senai.primeiropassos.model.Usuario;
import com.senai.primeiropassos.view.UsuarioView;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioView View;

    @GetMapping("/usuarios")
    public List<Usuario> getAll() {
        return view.ListAll();
    }
}
