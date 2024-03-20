package com.metas.usuario.usuariometas.usuario.application.api;

import com.metas.usuario.usuariometas.usuario.application.service.UsuarioService;
import com.metas.usuario.usuariometas.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
public class UsuarioController implements UsuarioAPI{

    private final UsuarioService usuarioService;

    @Override
    public UsuarioResponse novoUsuario(UsuarioRequest usuarioRequest) {
        log.info("[inicia] UsuarioController - novoUsuario");
        UsuarioResponse usuarioCriado = usuarioService.criaUsuario(usuarioRequest);
        log.info("[finaliza] UsuarioController - novoUsuario");
        return usuarioCriado;
    }

    @Override
    public UsuarioResponse buscaUsuario(String idUsuario) {
        log.info("[inicia] UsuarioController - buscaUsuario");
        log.info("[inicia] {}", idUsuario);
        UsuarioResponse buscaUsuario = usuarioService.buscaUsuarioId(idUsuario);
        log.info("[finaliza] UsuarioController - buscaUsuario");
        return buscaUsuario;
    }

    @Override
    public void editaUsuario(String idUsuario) {
        log.info("[inicia] UsuarioController - editaUsuario");
        log.info("[finaliza] UsuarioController - editaUsuario");
    }

}
