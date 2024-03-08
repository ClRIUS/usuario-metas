package com.metas.usuario.usuariometas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class UsuarioMetasApplication {

	@GetMapping
	public String getHomeTeste(){
		return "Teste API";
	}

	public static void main(String[] args) {
		SpringApplication.run(UsuarioMetasApplication.class, args);
	}

}
