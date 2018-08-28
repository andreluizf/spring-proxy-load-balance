package com.springApisNetlix.produto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringApisNetflixProdutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApisNetflixProdutoApplication.class, args);
	}
}
