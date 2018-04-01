package co.simplon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Classe de lancement et de configuration automatique de l'application Spring Boot
@SpringBootApplication
public class Application {

	// méthode de lancement de l'application Spring Boot
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
