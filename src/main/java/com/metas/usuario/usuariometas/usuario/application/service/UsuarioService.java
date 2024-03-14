package com.metas.usuario.usuariometas.usuario.application.service;

import com.metas.usuario.usuariometas.usuario.application.api.UsuarioRequest;
import com.metas.usuario.usuariometas.usuario.application.api.UsuarioResponse;

public interface UsuarioService {
    UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest);
}
