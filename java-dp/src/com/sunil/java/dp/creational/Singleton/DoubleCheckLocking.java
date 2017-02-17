package com.sunil.java.dp.creational.Singleton;

public class DoubleCheckLocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Database_doublecheck db_locking = Database_doublecheck.getInstance();
		
		System.out.println(" db_locking " + db_locking);
	}

}
