package com.application.promotionengine.service;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class SKUCalcualtionLogic {
	
	public int calculationLogicForSKU(Map<String,Integer> SkduqauntityMap,int promotionID) {
		int calcualtionSum = 0;
		
		switch(promotionID){  
	    case 1: 
	    	calcualtionSum =   prmotionA(SkduqauntityMap.get("A"))+(SkduqauntityMap.get("B")*30)+(SkduqauntityMap.get("C")*20)+(SkduqauntityMap.get("D")*15);
	    break;  
	    case 2: 
	    	calcualtionSum =   prmotionB(SkduqauntityMap.get("B"))+(SkduqauntityMap.get("A")*50)+(SkduqauntityMap.get("C")*20)+(SkduqauntityMap.get("D")*15); 
	    break;  
	    case 3: 
	    	calcualtionSum =   prmotionCandD(SkduqauntityMap.get("C"),SkduqauntityMap.get("D"))+(SkduqauntityMap.get("A")*50)+(SkduqauntityMap.get("B")*30); 
	    break;  
	
	    default:System.out.println("wrong promotion has been selected");  
	    }  
		
		return calcualtionSum;
	}
	
	public int prmotionA(int a) {
		int sumA = 0;
		if(a!=0) {
			if(a%3==0) {
				sumA = ((a/3)*130);
			}
			else {
				sumA = ((a/3)*130)+((a-((a/3)*3))*50);
			}
		}
		
		return sumA;
		
	}
	
	public int prmotionB(int b) {
		int sumB = 0;
		if(b!=0) {
			if(b%2==0) {
				sumB = ((b/2)*45)+((b-((b/2)*2))*30);
			}
			else {
				sumB = ((b/2)*45);
			}
		}
		return sumB;
	}
	
	public int prmotionCandD(int c , int d) {
		int sum=0;
		if(c>d) {
			sum = ((c-d)*30)+((c-(c-d))*20);
		}
		else if(d>c){
			sum = ((d-c)*30)+((d-(d-c))*15);
		}
		else {
			sum = c*30;
		}
		return sum;
		
	}
	
	
	

}
