package tests;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import utilities.Declarations;
import utilities.DriverClass;
import utilities.ExcelDataRetriever;
import utilities.ExcelUtility;
import utilities.Log;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Tests {
	
	public static String username = "";
	public static String password = "";

	
  @Test(dataProvider="Sheet3")
  public void testing(String row, String user, String pass) throws Exception {
	  	System.out.println("Test Inner Class");
	   	Log.info("Test Start :");
	   	int rr = Integer.parseInt(row);
	   	System.out.println(row);
	   	username = user;
	   	password = pass;
	  	Declarations.testCases(rr);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method inner class");
	  DOMConfigurator.configure("log4j.xml");
	  Log.info("Chrome driver initialisation started");
	  FirefoxDriverManager.getInstance().setup();
	  new DriverClass(new FirefoxDriver());
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method Inner Class");
	  Log.endTestCase();
	  DriverClass.driver.close();
  }

  @DataProvider(name="Sheet3")
  public Object[][][] Sheet3() throws Exception{
	int row = 1,size = 4 , i =0;
	Object[][][] arrayObjects = new Object[8][size][3];
	ExcelDataRetriever.Sheet2();
	ExcelUtility.setExcelFile("C:\\Users\\Rishabh Patil\\eclipse-workspace\\Framework.WordPress\\src\\main\\java\\utilities\\ExcelFileAutomate.xlsx", "Sheet3");
	while(!ExcelUtility.getCellData(row, 2).equals("")){
		if((ExcelDataRetriever.list1.contains(ExcelUtility.getCellData(row, 1))) && (ExcelUtility.getCellData(row, 5).equals("Y"))){
			System.out.println(row);
			size++;
			arrayObjects[i][0][0] = row;
			arrayObjects[i][1][0] = ExcelUtility.getCellData(row, 2);
			arrayObjects[i][1][1]= ExcelUtility.getCellData(row, 3);
			i++;
		}
		row++;
	}
	return arrayObjects;
	}
}
