package com.senai.primeiropassos.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.senai.primeiropassos.model.Usuario;

@Repository
public class UsuarioView {

    public void save(Usuario usuario) {
        System.out.println("Salvar - Recebendo um novo usuário");
        System.out.println(usuario);
    }

    public List<Usuario> ListAll() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add((new Usuario("Luzia", "1234")));
        return usuarios;
    }

}
