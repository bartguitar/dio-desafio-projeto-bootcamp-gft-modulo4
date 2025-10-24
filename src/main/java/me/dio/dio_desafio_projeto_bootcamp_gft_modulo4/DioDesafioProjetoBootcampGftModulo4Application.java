package me.dio.dio_desafio_projeto_bootcamp_gft_modulo4;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class DioDesafioProjetoBootcampGftModulo4Application {

	public static void main(String[] args) {
		SpringApplication.run(DioDesafioProjetoBootcampGftModulo4Application.class, args);
	}

}
