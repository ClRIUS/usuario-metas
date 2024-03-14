package com.metas.usuario.usuariometas.usuario.domain;

import com.metas.usuario.usuariometas.usuario.application.api.UsuarioRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;
@Getter
@Log4j2
@Document(collection = "usuario")
public class Usuario {
    @Id
    private UUID idUsuario;
    private String nome;
    private String email;
    private String senha;

    public Usuario(UsuarioRequest usuarioRequest) {
        this.nome = usuarioRequest.getEmail();
        this.senha = usuarioRequest.getSenha();
    }
}
