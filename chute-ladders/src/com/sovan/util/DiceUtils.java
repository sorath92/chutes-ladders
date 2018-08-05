package com.sovan.util;

import java.util.Random;

/**
 * Util class to generate the random step. 
 * 
 * This step can be possible using a dice or by using a Pointer as stated in the Description of the Chutes and Ladders Game
 *
 *	
 */



public class DiceUtils {

	
	public static int rollDice() {
		
		
		  Random  rand = new Random();
		  int roll = rand.nextInt(7);
		
		  while(roll< 1) {
			  
			  roll = rand.nextInt(7);
			  
		  }
		
		 return roll;
		
		
	}
	
}

