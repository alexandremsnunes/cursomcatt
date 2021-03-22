package com.alexandrenunes.cursomcatt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alexandrenunes.cursomcatt.services.S3Service;

@SpringBootApplication
public class CursomcattApplication implements CommandLineRunner {

	@Autowired
	private S3Service s3Service;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcattApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
		s3Service.uploadFile("C:\\Users\\ALEXANDRE\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\listesteaa.jpg");
	}	
}
