package com.application.promotionengine.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceIml implements ProductService {
	
	public void inputFromConsole() {
		System.out.println("please enter the no of elemnet you want in cart");
		Scanner in = new Scanner(System.in);
		int numberOfElements = in.nextInt();
		System.out.println("number of elements are "+numberOfElements);
		System.out.println("please chose one prmotion no from the following :://n 1. Promotion A //n 2. Promotion B //n 3. Prmotion C & D ");
		int prmotionID = in.nextInt();
		System.out.println("please enter the list of SKU Ids seprated by space");
		String[] skuIDList = new String[numberOfElements];
		for (int i = 0; i < numberOfElements; i++) {
			skuIDList[i] = in.next();
		}
		
		in.close();
		
		int totalPrice = priceClaculation(skuIDList,prmotionID);
		System.out.println("Total Price for the transaction is : " +totalPrice );
	}
	
	public int priceClaculation(String[] skuIDList,int PromotionID) {
		Map<String,Integer> SkduqauntityMap = new HashMap<String,Integer>();
		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
		for (int i = 0; i < skuIDList.length; i++) {
			if (skuIDList[i].contains("A")) {
				countA+=1;
			}
			else if (skuIDList[i].contains("B")) {
				countB+= 1;
			} 
			else if(skuIDList[i].contains("C")) {
				countC+= 1;
			}
			else if(skuIDList[i].contains("D")) {
				countD+= 1;
			}
			
		}
		SkduqauntityMap.put("A", countA);
		SkduqauntityMap.put("B", countB);
		SkduqauntityMap.put("C", countC);
		SkduqauntityMap.put("D", countD);
		return 0;
	}

	
}
