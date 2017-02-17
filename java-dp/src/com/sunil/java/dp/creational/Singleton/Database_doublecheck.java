package com.sunil.java.dp.creational.Singleton;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Database_doublecheck {

	private static Database_doublecheck instance = null;
	private static Object key = new Object();
	
	private Database_doublecheck() {}

	public static Database_doublecheck getInstance() {
		
		if( instance != null ){
			return instance;
		}
		
		synchronized (key) {
		
			if( instance == null ){
				instance = new Database_doublecheck();
			}
			return instance;
		}	
	}	
}
