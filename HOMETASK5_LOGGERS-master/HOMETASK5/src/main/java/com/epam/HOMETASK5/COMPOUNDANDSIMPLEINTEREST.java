package com.epam.HOMETASK5;

public class COMPOUNDANDSIMPLEINTEREST {
	double computesSimpleInterest(double principal, double rate, double time){
			
			return (principal * rate * time) / 100;
			
		}
		
		double computesCompoundInterest(double principal, double rate, double time){
			
			return principal * (Math.pow((1 + rate / 100), time)); 
			
		}
		

}
