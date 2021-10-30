package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import comman.BaseSelenium;
import page.LoginPage;

public class AddUserTest extends BaseSelenium{

	@Test(dataProvider="LoginCSVData")
	public void verifyAdminUserGettingAddedSuccessful(String userName,String password) {
		
		new LoginPage()
		.login(userName, password)
		.isPageLoaded()
		.verifyWelcomeTextVisible()
		.navigetToadminPage()
		 .isPageLoaded()
		    .navigetToAddUserPage()
	       .addUserInfo();
		
	}
	
	  @DataProvider(name="LoginCSVData")
	    public String[][] getAddUserCSVData() throws IOException
	      {
		      String addUser[][]= new String[3][2];
	     	  File file=new File("C:\\Users\\SHUBHAM\\eclipse-workspace\\profound-selenium-java-automation6\\src\\Test\\LoginData.csv");
	     	 FileReader fr= new FileReader(file);
	     	 BufferedReader br=new BufferedReader(fr);
	     	 
	     	 String line;
	     	 int a=0;
	     	 
	     	 while((line=br.readLine())!=null)
	     	 {
	     		 addUser[a]=line.split(",");
	     		 a++;
	     	 }
	     	 return addUser;
		
	      }
}
