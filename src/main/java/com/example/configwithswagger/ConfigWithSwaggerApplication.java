package com.example.configwithswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableConfigServer
@EnableSwagger2
public class ConfigWithSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigWithSwaggerApplication.class, args);
	}
}
