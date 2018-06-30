package utilities;

import java.util.ArrayList;

public class ExcelDataRetriever {

	public static ArrayList<String> list1 = new ArrayList<String>();
	public static ArrayList<Integer> list2 = new ArrayList<Integer>();
	
	public static String getTestCaseName(int row)throws Exception{
		String testcase = "";
		ExcelUtility.setExcelFile("ExcelFileAutomate.xlsx", "Sheet2");
		testcase = ExcelUtility.getCellData(row, 2);		
		return testcase;
	}
	
	public static void Sheet1() throws Exception {
		int rowNum = 1, colNum = 2;
		ExcelUtility.setExcelFile("C:\\Users\\Rishabh Patil\\eclipse-workspace\\Framework.WordPress\\src\\main\\java\\utilities\\ExcelFileAutomate.xlsx", "Sheet1");
		while(!ExcelUtility.getCellData(rowNum, colNum).equals("")){
			if(ExcelUtility.getCellData(rowNum, colNum).equals("Y")){
				String testModule = ExcelUtility.getCellData(rowNum, 1);
				System.out.println(testModule);
				list1.add(testModule);
			}
			rowNum++;
		}
	}
	
	public static void Sheet2() throws Exception {
		int rowNum = 1, colNum = 2;
		ExcelUtility.setExcelFile("C:\\Users\\Rishabh Patil\\eclipse-workspace\\Framework.WordPress\\src\\main\\java\\utilities\\ExcelFileAutomate.xlsx", "Sheet2");
		Sheet1();
		while(!ExcelUtility.getCellData(rowNum, colNum).equals("")){
			if((list1.contains(ExcelUtility.getCellData(rowNum, 1))) && (ExcelUtility.getCellData(rowNum, 3).equals("y"))){
				System.out.println(rowNum);
				list2.add(rowNum);
			}
			rowNum++;
		}
	}
	
}
