package com.metas.usuario.usuariometas.usuario.application.infra;

import com.metas.usuario.usuariometas.usuario.domain.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface UsuarioMongoSpringRepository extends MongoRepository<Usuario, UUID> {
}
