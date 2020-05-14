package com.springboot.storedprocedure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main implementation class which serves two purpose in a spring boot application: Configuration and bootstrapping.
 * This is the entry point of springboot application.
 * Here the application will search for the class path dependincies and configure accordingly by autoconfiguration facility given 
 * by springboot.
 * @author Jogindrar 

 */
@SpringBootApplication
public class Myapplication {

	public static void main(String[] args) {
		SpringApplication.run(Myapplication.class, args);
	}
}