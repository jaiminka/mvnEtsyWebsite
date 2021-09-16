package data;

import utils.Xls_Reader;

public class data {
	Xls_Reader data = new Xls_Reader(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data2.xlsx");
	
	public String email = data.getCellData("data", 0, 2);
	public String correctPassword = data.getCellData("data", 1, 2);
	public String wrongpassword = data.getCellData("data", 2, 2);
	public String noPasswordErr = data.getCellData("data", 3, 2);
	public String wrongPasswordErr = data.getCellData("data", 4, 2);
	

}
