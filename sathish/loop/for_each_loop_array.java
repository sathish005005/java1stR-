package com.sathish.loop;

public class for_each_loop_array {

	public static void main(String[] args) {

		//for each is used for array
		
		// we can use it with for loop condition also
		// we can both forward and backward only by normal foe loop
		 
	//normal for method for forward direction	
		String vegetables[] = { "carrot" ,"beans" ,"tomato"};
		/*for (int i = 0;i< vegetables.length; i++){
			System.out.println(vegetables[i]);
			*/
			
			for(int i = vegetables.length-1 ; i > 0 ; i--) {
				System.out.println(vegetables[i]);
		}
			
			
			
			//for each loop array
		
			for( String vegetable:vegetables) {
				System.out.println(vegetable);
			}
	}

}
