package com.srivath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Sbms07ConfigServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sbms07ConfigServerAppApplication.class, args);
	}

}
