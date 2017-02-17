package com.sunil.java.ds;

public class Product {
	
	String name , weight;
	
	public Product(String name , String weight){
		this.name = name;
		this.weight = weight;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Product [ "+ this.name + " , " + this.weight + " ] ";
	} 	
}
