package com.metas.usuario.usuariometas.usuario.application.service;

import com.metas.usuario.usuariometas.usuario.application.api.UsuarioRequest;
import com.metas.usuario.usuariometas.usuario.application.api.UsuarioResponse;
import com.metas.usuario.usuariometas.usuario.domain.Usuario;

public interface UsuarioService {
    UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest);

    UsuarioResponse buscaUsuarioId(String idUsuario);

    Usuario editaUsuario(String idUsuario);
}
