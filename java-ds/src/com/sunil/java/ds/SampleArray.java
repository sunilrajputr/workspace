package com.sunil.java.ds;

import java.util.Arrays;
import java.util.Random;

public class SampleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ages[] = {2,30,12,24,40,53}; // initialize
		boolean[] values = {true,false,false,true}; 
		String[] names = new String[] {"Bob", "Tom","Mike"};
		
		Random r = new Random();
		String[] randomArrayLength = new String[r.nextInt(100)];
		
		System.out.println(" ages " + ages.length + " Values " + Arrays.toString(ages));
		
		for( boolean b : values )
			System.out.println(" value " + b);
		System.out.println(" boolean values " + values.length + " Values " + Arrays.asList(names));
		
		System.out.println(" length is " + randomArrayLength.length);
			
		int Twodarray[][][] = new int[][][] {{},{{12},{321}}};
		System.out.println(" Multi dimesion array size is " + Twodarray.length);
		System.out.println(" Multi dimension array size is " + Arrays.deepToString(Twodarray));
		
		
	
	}

}
