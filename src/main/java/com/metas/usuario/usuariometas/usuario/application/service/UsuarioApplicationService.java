package com.metas.usuario.usuariometas.usuario.application.service;

import com.metas.usuario.usuariometas.usuario.application.api.UsuarioRequest;
import com.metas.usuario.usuariometas.usuario.application.api.UsuarioResponse;
import com.metas.usuario.usuariometas.usuario.application.repository.UsuarioRepository;
import com.metas.usuario.usuariometas.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Log4j2
@Service
@RequiredArgsConstructor
public class UsuarioApplicationService implements UsuarioService{

    private final UsuarioRepository usuarioRepository;

    @Override
    public UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest) {
        log.info("[inicia] UsuarioApplicationService - criaUsuario");
        var usuario = new Usuario(usuarioRequest);
        usuarioRepository.salva(usuario);
        log.info("[finaliza] UsuarioApplicationService - criaUsuario");
        return new UsuarioResponse(usuario);
    }

    @Override
    public UsuarioResponse buscaUsuarioId(String idUsuario) {
        log.info("[inicia] UsuarioApplicationService - buscaUsuarioId");
        Usuario buscaUsuarioId = usuarioRepository.buscaUsuarioId(idUsuario);
        log.info("[finaliza] UsuarioApplicationService - buscaUsuarioId");
        return new UsuarioResponse(buscaUsuarioId);
    }

    @Override
    public void editaUsuario(String idUsuario) {
        log.info("[inicia] UsuarioApplicationService - editaUsuarioId");
        log.info("[finaliza] UsuarioApplicationService - editaUsuarioId");
    }
}
