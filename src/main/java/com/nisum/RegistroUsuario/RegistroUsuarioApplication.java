package com.nisum.RegistroUsuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nisum.RegistroUsuario")
public class RegistroUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistroUsuarioApplication.class, args);
	}

}
