package br.com.sada.sistema.cadastro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SistemaCadastroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaCadastroApplication.class, args);
	}

}
