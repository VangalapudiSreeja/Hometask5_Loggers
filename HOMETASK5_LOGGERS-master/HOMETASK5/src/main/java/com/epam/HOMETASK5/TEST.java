package com.epam.HOMETASK5;

import java.util.Scanner;
import org.apache.logging.log4j.*;

import org.apache.logging.log4j.LogManager;

public class TEST {
	 
	private static Logger LOGGER= LogManager.getLogger(TEST.class);

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		COMPOUNDANDSIMPLEINTEREST calculate = new COMPOUNDANDSIMPLEINTEREST();
		
		CONSTRUCTON budget = new CONSTRUCTON();
		
		
		LOGGER.info("Enter 1 for Simple Interest  or 2 for Compound Interest");
		int option = input.nextInt();
		LOGGER.info("You entered " + " " + option);
		LOGGER.info("Enter amount , rate , time");
		double amount = input.nextDouble();
		double rate = input.nextDouble();
		double time = input.nextDouble();
		LOGGER.info("Entered values are " + "amount = " + amount + " rate = " + rate + " time = " + time);
		switch(option){
		case 1:
			LOGGER.info("Simple Interest calculated" + calculate.computesSimpleInterest(amount, rate, time));
			break;
		case 2:
			LOGGER.info("Compound Interest calculated" + calculate.computesCompoundInterest(amount, rate, time));
			break;
		default:
			LOGGER.info("Invalid option entered");
		}
		
		
		LOGGER.info("Enter Standard of the house");
		LOGGER.info("Enter 1 for normal 2 for medium 3 for high");
		int standard = input.nextInt();
		LOGGER.info("Entered standard is " + standard);
		int fullyAutomated;
		if( standard == 3){
			LOGGER.info("Enter 1 for fully automated house else enter 0");
			fullyAutomated = input.nextInt();
			LOGGER.info("Entered value is " + fullyAutomated);
		}else{
			fullyAutomated = 0;
			
		}
		LOGGER.info("Enter the area ");
		double area = input.nextDouble();
		LOGGER.info("Budget calculated is " + budget.calculatesConstructionCost(area, standard, fullyAutomated));
		
		
		

	}

}
