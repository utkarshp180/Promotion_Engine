package com.application.promotionengine;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.application.promotionengine.service.ProductService;
import com.application.promotionengine.service.ProductServiceIml;

@SpringBootApplication
public class PromotionEngineApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(PromotionEngineApplication.class, args);
		
	}

}
