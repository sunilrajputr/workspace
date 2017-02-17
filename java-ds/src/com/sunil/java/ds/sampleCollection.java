package com.sunil.java.ds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class sampleCollection {

	public static void main( String... strings){
		
		Product p1 = new Product(" Table ", "5");
		Product p2 = new Product (" chair ","10");
		Product p3 = new Product (" sofa ","30");
		
		Product[] products = { p1,p2,p3 };
		
		Collection<Product> productCollection = new ArrayList<Product>();
		
		productCollection.add(p1);
		productCollection.add(p2);
		productCollection.add(p3);
		productCollection.add(p3);

		for( Product p : productCollection){
			
			System.out.println( " Stored as ArrayList " + p );
		}

		// store only unique records
		Collection<Product> productCollection_unique = new HashSet<Product>();
		productCollection_unique.addAll(productCollection);
		
		for( Product p : productCollection_unique){
			
			System.out.println( " Stored as HashSet ( unique ) " +  p );
		}
		
		//System.out.println(" Products "  + products  );
		
	}
	
}
