package com.sunil.java.dp.creational.Singleton;

public class sampleSingleton {

	public static void main(String[] args) {
		
		Database db = Database.getInstance();
		System.out.println(" db " + db);
	}

}
