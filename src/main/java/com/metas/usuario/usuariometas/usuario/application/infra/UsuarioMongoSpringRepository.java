package com.metas.usuario.usuariometas.usuario.application.infra;

import com.metas.usuario.usuariometas.usuario.domain.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioMongoSpringRepository extends MongoRepository<Usuario, String> {
}
