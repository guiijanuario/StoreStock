package com.catalisa.FullStackStock;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Store Stock API", version = "1", description = "API desenvolvida para gerenciar Stock de um Super Mercado"))
public class FullStackStockApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullStackStockApplication.class, args);
	}

}
