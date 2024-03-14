package com.metas.usuario.usuariometas.usuario.application.service;

import com.metas.usuario.usuariometas.usuario.application.api.UsuarioRequest;
import com.metas.usuario.usuariometas.usuario.application.api.UsuarioResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class UsuarioApplicationService implements UsuarioService{
    @Override
    public UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest) {
        log.info("[inicia] UsuarioApplicationService - criaUsuario");
        log.info("[finaliza] UsuarioApplicationService - criaUsuario");
        return null;
    }
}
