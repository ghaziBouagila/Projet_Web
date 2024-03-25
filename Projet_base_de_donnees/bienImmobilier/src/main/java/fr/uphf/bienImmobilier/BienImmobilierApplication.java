package fr.uphf.bienImmobilier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BienImmobilierApplication {

	public static void main(String[] args) {
		SpringApplication.run(BienImmobilierApplication.class, args);
	} 
	public void run(String... args) throws Exception {
		System.out.println("Hello, World!");
	}


}
