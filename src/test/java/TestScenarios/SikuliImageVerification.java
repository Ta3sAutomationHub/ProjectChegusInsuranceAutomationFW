package TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliImageVerification {
	
	@Test
	
	public void GmailVerification() throws FindFailed
	{
		
		Screen SC=new Screen();
		
		Pattern UN=new Pattern("./Images/Username.jpg");
		
		Pattern PWD=new Pattern("./Images/Password.jpg");
		
		Pattern Login=new Pattern("./Images/Signin.jpg");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.vtiger.com/");
		
		
		SC.wait(UN,10);
		
		//SC.click(UN);
		
		
		
	
	
		
		/*SC.type(PWD, "admin");
		
		SC.click(Login);*/
		
	}

}
