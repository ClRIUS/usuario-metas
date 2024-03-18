package com.metas.usuario.usuariometas.usuario.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/usuario")
public interface UsuarioAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    UsuarioResponse novoUsuario(@RequestBody @Valid UsuarioRequest usuarioRequest);

    @GetMapping("/{idUsuario}")
    @ResponseStatus(code = HttpStatus.OK)
    UsuarioResponse buscaUsuario(@PathVariable String idUsuario);
}
