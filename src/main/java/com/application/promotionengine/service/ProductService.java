package com.application.promotionengine.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	SKUCalcualtionLogic sKUCalcualtionLogic;
	
	public void inputFromConsole() throws Exception {
		int totalPrice= 0;
		System.out.println("please enter the no of elemnet you want in cart");
		Scanner in = new Scanner(System.in);
		int numberOfElements = in.nextInt();
		System.out.println("number of elements are "+numberOfElements);
		System.out.println("please chose one prmotion no from the following ::// chose 1 for Promotion A // chose 2 Promotion B //  chose 3 Prmotion C & D ");
		int prmotionID = in.nextInt();
		System.out.println("please enter the list of SKU Ids in Capitals seprated by space");
		String[] skuIDList = new String[numberOfElements];
		for (int i = 0; i < numberOfElements; i++) {
			skuIDList[i] = in.next();
		}
		in.close();
		
		if(prmotionID==1||prmotionID==2||prmotionID==3) {
			totalPrice = priceClaculation(skuIDList,prmotionID);
			
		}
		else {
			System.out.println("wrong Promotion ID has been entered");
			throw new Exception();
		}

		
		System.out.println("Total Price for the transaction is : " +totalPrice );
	}
	
	public int priceClaculation(String[] skuIDList,int promotionID) throws Exception {
		int sumOfCalcualtion = 0; 
		Map<String,Integer> SkduqauntityMap = new HashMap<String,Integer>();
		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
		for (int i = 0; i < skuIDList.length; i++) {
			if (skuIDList[i].equals("A")) {
				countA+=1;
			}
			else if (skuIDList[i].equals("B")) {
				countB+= 1;
			} 
			else if(skuIDList[i].equals("C")) {
				countC+= 1;
			}
			else if(skuIDList[i].equals("D")) {
				countD+= 1;
			}
			else {
				System.out.println("\"data entered is not appropriate\"");
				throw new Exception("data entered is not appropriate");
			}
			
		}
		SkduqauntityMap.put("A", countA);
		SkduqauntityMap.put("B", countB);
		SkduqauntityMap.put("C", countC);
		SkduqauntityMap.put("D", countD);
		sumOfCalcualtion = sKUCalcualtionLogic.calculationLogicForSKU(SkduqauntityMap,promotionID);
		return sumOfCalcualtion;
	}

	
}
