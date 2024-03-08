package com.metas.usuario.usuariometas.usuario.application.api;

import lombok.Value;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Value
public class UsuarioRequest {
    @Email
    private final String email;
    @Size(min = 6)
    private final String senha;
}
