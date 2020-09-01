package com.application.promotionengine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.application.promotionengine.service.ProductService;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

	 @Autowired
	 private ProductService myService;

	    @Override
	    public void run(String...args) throws Exception {
	       myService.inputFromConsole();

	    }
}
