package br.edu.atitus.atitusound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtitusoundApplication {
	public String PORT = System.getenv("PORT");

	public static void main(String[] args) {
		SpringApplication.run(AtitusoundApplication.class, args);
		System.out.println("Aplicação está no AR!!!");
	}

}
