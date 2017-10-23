package TestScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class FileUpload {
	
	@Test
	public void Fileupload() throws InterruptedException, FindFailed
	{
		
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
 
        driver.get("http://demo.automationtesting.in/Register.html");
        
        Screen SC=new Screen();  
        
        //driver.findElement(By.id("imagesrc")).click();    
        
        Thread.sleep(1000);   
        
        Pattern Browse = new Pattern("D:\\Swathi_WS\\Ta3s_Automation_Fw\\Images\\Browse.PNG");
        
        SC.click(Browse);
        
        Pattern fileNameInput = new Pattern("D:\\Swathi_WS\\Ta3s_Automation_Fw\\Images\\FilePath.PNG");
        
        Pattern ClickOK = new Pattern("D:\\Swathi_WS\\Ta3s_Automation_Fw\\Images\\Click.PNG");
         
        
        SC.type(fileNameInput,"C:\\Users\\Swathi\\Desktop\\ChegusStuff.txt");
        
        SC.click(ClickOK);
        
        
        
        
        
        
        
        
	}

}
