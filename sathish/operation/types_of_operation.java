package com.sathish.operation;

public class types_of_operation {

	public static void main(String[] args) {
		
		byte number1 = 10;
		byte number2 = 20;
		System.out.println(number1+number2);//arthematic operation= +,*,-,/
		
		//relational operation= <,>,<=,>=,==,!=,can get value true or false
		//eg
		
		System.out.println(number1<number2);
        System.out.println(number1==number2);
        System.out.println(number1!=number2);
        
        
        int number3 =30;
        number3 = number3 + 20;
         System.out.println(number3);
         
         //or shortcut //we can use +=,-=,*=,/=,%=, but use first amsd
         
         number3 *= 20;
         System.out.println(number3);
         
         
         //BODMAS   order
         /*
          b=bracket ,o = power ,D= division, m= multiplication,a=addition,s= subraction
          */
         
         int number4 = (5 + 5) - 10 * 5 * 6 / 9/ 8 % 5;
          System.out.println(number4);
          
          
          // logical operator  &,|,!
           
          int ageofperson = 21;
          boolean indiancitizen = true;
          
          System.out.println(ageofperson == 21 && indiancitizen == true);
          System.out.println(ageofperson == 18 || indiancitizen == true);// if one true all true
          System.out.println(!indiancitizen == false);
          
          // terinary operator
          
                       // condition        true          flase
          String name = ageofperson >=21? "eligible" :" not eligile"  ;
           System.out.println(name);
           System.out.println(ageofperson >=21? "eligible" :" not eligile" );
          
          //increament operator ,decreament operator
           
           int number6 = 10;
           number6++;  //-- but put after
           System.out.println(number6);
           //or
           ++number6;
           System.out.println(number6);
           //or if you want to ++ in sys then you have to place it first
           System.out.println(++number6);
           
           int number7 =20;
           int number8 = ++number7;
           System.out.println(number7);
           System.out.println(number8);
          
          
	}

}
