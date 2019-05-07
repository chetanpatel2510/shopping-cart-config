package com.shoppingcart.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * This class enables application as configuration server.
 * 
 * @author Chetan
 *
 */
@EnableConfigServer
@SpringBootApplication
public class ShoppingCartConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartConfigApplication.class, args);
	}

}
