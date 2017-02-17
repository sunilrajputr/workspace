package com.sunil.java.dp.creational.Singleton;

public class singleton_MulticoreThreadSafe {

	public static void main(String[] args) {
	
		Singleton_trueThreadSafe multicoreTrueSafe = Singleton_trueThreadSafe.INSATANCE;

		System.out.println(" trueThreadsafe instance  " + multicoreTrueSafe );
		
	}

}
