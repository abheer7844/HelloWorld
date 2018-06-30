package utilities;

import action.WP_Login;

public class Declarations {

	public static String URL = "http://www.testdemoautomation.wordpress.com/wp-admin";

	public static void testCases(int rowNum) throws Exception{
		try{
			if(rowNum == 1){
				try {
					Log.startTestCase(ExcelDataRetriever.getTestCaseName(rowNum));
					WP_Login.positiveLogin(URL);
				} 
				catch (Exception e) {
					throw new Exception("Problem with Test Cases Row "+rowNum+":"+e);
				}
			}
			else if(rowNum == 2){
				try {
					Log.startTestCase(ExcelDataRetriever.getTestCaseName(rowNum));
					WP_Login.positiveLogin(URL);
				} 
				catch (Exception e) {
					throw new Exception("Problem with Test Cases Row "+rowNum+":"+e);
				}
			}

		}
		catch(Exception e){
			throw new Exception("Problem with Test Cases declaration if-else statements:"+e);
		}
	}
	
}
