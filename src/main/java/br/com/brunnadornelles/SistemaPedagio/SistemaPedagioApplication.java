package br.com.brunnadornelles.SistemaPedagio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaPedagioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaPedagioApplication.class, args);
		System.out.println("API rodando...");
	}

}
