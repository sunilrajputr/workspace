package com.sunil.java.dp.creational.Singleton;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DatabaseTest {

  @Test
  public void getInstance() {
	  
	  Database db = Database.getInstance();
	  Assert.assertNotNull(db);
	  
	  
  }
}
