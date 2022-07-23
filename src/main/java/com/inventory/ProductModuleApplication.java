package com.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.inventory.repository.InventoryRepo;

/**
 * @author Vuntla Rekhasree
 *
 */
@SpringBootApplication()
@EnableFeignClients
public class ProductModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductModuleApplication.class, args);
	}

}
//exclude = {DataSourceAutoConfiguration.class }