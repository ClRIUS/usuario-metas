package com.metas.usuario.usuariometas.usuario.application.infra;

import com.metas.usuario.usuariometas.usuario.application.repository.UsuarioRepository;
import com.metas.usuario.usuariometas.usuario.domain.Usuario;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
public class UsuarioMongoRepository implements UsuarioRepository {
    @Override
    public Usuario salva(Usuario usuario) {
        log.info("[inicia] UsuarioMongoRepository - salva");
        log.info("[finaliza] UsuarioMongoRepository - salva");
        return null;
    }
}
