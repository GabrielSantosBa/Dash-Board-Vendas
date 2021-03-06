package com.dsvendas.DashBoardVendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DashBoardVendasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DashBoardVendasApplication.class, args);
	}

}
