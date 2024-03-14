package com.metas.usuario.usuariometas.usuario.application.api;

import com.metas.usuario.usuariometas.usuario.domain.Usuario;
import lombok.Value;

import java.util.UUID;
@Value
public class UsuarioResponse {
    private final String idUsuario;
    private final String nome;
    private final String email;
    private final String senha;

    public UsuarioResponse(Usuario usuario) {
        this.idUsuario = usuario.getIdUsuario();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.senha = usuario.getSenha();
    }
}
