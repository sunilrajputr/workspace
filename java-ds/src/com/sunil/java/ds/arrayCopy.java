package com.sunil.java.ds;

import java.util.Arrays;

public class arrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ages[] = new int[] {1,21,32,22,12};
		int extendedages[] = new int[ages.length+1];
		
		System.arraycopy(ages, 0, extendedages, 0, ages.length);

		System.out.println(" array values are " + Arrays.toString(ages));
		
		ages = extendedages;
		System.out.println(" new array values before assign " + Arrays.toString(ages));
		
		ages[5] = 30;
		
		System.out.println(" new array values are " + Arrays.toString(ages));
		
	}

}
