package com.sathish.variable;

public class types_of_variable {//class
	int a=10;//instance
	static int c=30;//static variable
	public static void main(String[] args) {//method
//three types of variable local,instance,class or static
		
	
        int b=20;//local
       System.out.println(b);
        
       types_of_variable object= new types_of_variable();// object creation
            
          System.out.println(object.a);
           
           System.out.println(c);//static
	}
	

}
