package com.application.promotionengine.service;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class SKUCalcualtionLogic {
	
	public int calculationLogicForSKU(Map<String,Integer> SkduqauntityMap) {
		
		
		return 0;
	}
	
	public int PrmotionA(int a) {
		int sumA = 0;
		if(a!=0) {
			sumA = ((a/3)*130)+((a-(a/3))*50);
		}
		
		return sumA;
		
	}
	
	public int PrmotionB(int b) {
		int sumB = 0;
		if(b!=0) {
			sumB = ((b/3)*130)+((b-(b/3))*50);
		}
		return sumB;
	}
	
	public int PrmotionCandD(int c , int d) {
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
