package br.com.pattern.pteurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PtEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PtEurekaServerApplication.class, args);
	}

}
