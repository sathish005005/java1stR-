package com.sathish.array;

public class array_demo {

public static void main(String[] args) {
		
		//syntax for Approach No - 1
		//Datatype[] variable_name = new Datatype[array_length];
		int[] arr = new int[6];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		
		
		//syntax for Approach No - 2
		//Datatype[] variable_name = new Datatype[]{value1,value2};
		int[] arr2 = new int[] {10,20,30,40,50};
		System.out.println(arr2[0]+" "+arr2[1]+" "+arr2[2]+" "+arr2[3]+" "+arr2[4]);
		
		//syntax for Approach No - 3
		//Datatype[] variable_name = {value1,value2};
		int[] arr3 = {10,20,30,40,50};
		System.out.println(arr3[0]+" "+arr3[1]+" "+arr3[2]+" "+arr3[3]+" "+arr3[4]);
		
		//Find the length of array		
		System.out.println(arr3.length);
		  
		//single line comment
		/*multi line comment
		 */
		
		String Java = "learning " + "java";
		
		System.out.println(Java.toUpperCase());
		
		System.out.println(Java.startsWith("l"));

 		System.out.println(Java.repeat(4)); 
		
		
		
		
		
		
	}

}
