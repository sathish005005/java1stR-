package com.sathish.switch_identifier;

import java.util.Scanner;

public class switch_statement {

	public static void main(String[] args) {

		 String name = "sathish";
		 
		 System.out.println("enter the name:");
		 
		 Scanner input = new Scanner(System.in);
		 name =input.nextLine();
		 
		 switch (name) {
		 
		 case "kamalesh":
			 System.out.println("hi," + 123);
			 break;
			 
		 case "sathish":
			 System.out.println("hi," + 234);
			 break;
			 
		 case "saravana":
			 System.out.println("hi," + 345);
			 break;
			 
		default:
			System.out.println("your name is not valid");
		 
		 }
		 
	}

}
