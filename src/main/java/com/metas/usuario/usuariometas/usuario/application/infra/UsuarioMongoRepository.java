package com.metas.usuario.usuariometas.usuario.application.infra;

import com.metas.usuario.usuariometas.usuario.application.repository.UsuarioRepository;
import com.metas.usuario.usuariometas.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class UsuarioMongoRepository implements UsuarioRepository {

    private final UsuarioMongoSpringRepository usuarioMongoRepository;

    @Override
    public Usuario salva(Usuario usuario) {
        log.info("[inicia] UsuarioMongoRepository - salva");
        Usuario novoUsuario = usuarioMongoRepository.save(usuario);
        log.info("[finaliza] UsuarioMongoRepository - salva");
        return novoUsuario;
    }

    @Override
    public Usuario buscaUsuarioId(String idUsuario) {
        log.info("[inicia] UsuarioMongoRepository - buscaUsuarioId");
        Usuario buscaUsuarioId = usuarioMongoRepository.findById(idUsuario)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado!"));
        log.info("[finaliza] UsuarioMongoRepository - buscaUsuarioId");
        return null;
    }
}
