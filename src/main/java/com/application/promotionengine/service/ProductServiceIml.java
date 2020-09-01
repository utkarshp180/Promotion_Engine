package com.application.promotionengine.service;

import java.util.Scanner;

public class ProductServiceIml implements ProductService {
	
	public void inputFromConsole() {
		System.out.println("please enter the no of elemnet you want in cart");
		Scanner in = new Scanner(System.in);
		int numberOfElements = in.nextInt();
		System.out.println("number of elements are "+numberOfElements);
		System.out.println("please enter the list of SKU Ids seprated by space");
		String[] skuIDList = new String[numberOfElements];
		for (int i = 0; i < numberOfElements; i++) {
			skuIDList[i] = in.next();
		}
		in.close();
	}
	
	public int priceClaculation(String[] skuIDList) {
		return 0;
	}
	
}
