package com.example.medicare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedicareApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicareApplication.class, args);
	}

//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurerAdapter() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/api/login").allowedOrigins("http://localhost:3000");
//				registry.addMapping("/api/user/**").allowedOrigins("http://localhost:3000");
//				registry.addMapping("/api/inventoryItem/**").allowedOrigins("http://localhost:3000");
//				registry.addMapping("/api/dispatch/**").allowedOrigins("http://localhost:3000");
//				registry.addMapping("/api/inventory/**").allowedOrigins("http://localhost:3000");
//				registry.addMapping("/api/inventorySection/**").allowedOrigins("http://localhost:3000");
//				registry.addMapping("/api/materialRequest/**").allowedOrigins("http://localhost:3000");
//				registry.addMapping("/api/orderProduct/**").allowedOrigins("http://localhost:3000");
//				registry.addMapping("/api/purchaseInvoice/**").allowedOrigins("http://localhost:3000");
//				registry.addMapping("/api/purchaseOrder/**").allowedOrigins("http://localhost:3000");
//				registry.addMapping("/api/site/**").allowedOrigins("http://localhost:3000");
//				registry.addMapping("/api/siteInventory/**").allowedOrigins("http://localhost:3000");
//				registry.addMapping("/api/supplier/**").allowedOrigins("http://localhost:3000");
//				registry.addMapping("/api/supplierItem/**").allowedOrigins("http://localhost:3000");
//				registry.addMapping("/api/supplier/**").allowedOrigins("http://localhost:3000");
//			}
//		};
//	}
//
//	@Bean
//	PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}

}
