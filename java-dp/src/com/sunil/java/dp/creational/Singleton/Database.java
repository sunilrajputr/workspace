package com.sunil.java.dp.creational.Singleton;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Database {

	private static Database instance = null;
	private static Object key = new Object();
	
	private Database() {}

	public static Database getInstance() {
		
		if ( instance == null ){
			
			synchronized (key) {
			
				if( instance == null ){
					instance = new Database();
				}
			}
		}
		return instance;		
	}
	
}
