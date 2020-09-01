package com.application.promotionengine;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PromotionEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(PromotionEngineApplication.class, args);
		System.out.println("please enter the no of elemnet you want in cart");
		Scanner in = new Scanner(System.in);
		int numberOfElements = in.nextInt();
		System.out.println("number of elements are "+numberOfElements);
	}

}
