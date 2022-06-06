package com.sathish.condition;

import java.util.Scanner;

public class condition {

	public static void main(String[] args) {
     
		int shirt = 400;
		int pant = 600;
		int shoe = 350;
		int cost;
			 
		Scanner input = new Scanner(System.in);	
		
		
		System.out.println("enter the cost:");
		cost =input.nextInt();
		if (cost == 1000) {
			System.out.println("you can buy both shirt and pant " + "" + "and get free inner free");
		}	
		else if (cost >=1500) {
			System.out.println("you can buy all three"  +" " + "and get balance cost");
		}
		else  if (cost<350 ) {
			System.out.println("then go and fuck yourself");
		}
		
	}

}
