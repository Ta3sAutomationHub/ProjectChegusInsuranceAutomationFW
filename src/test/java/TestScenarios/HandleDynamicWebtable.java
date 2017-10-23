package TestScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandleDynamicWebtable {
	
	
	@Test
	public void HandleWebtable() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		
		
		driver.manage().window().maximize();		
		
		driver.get("http://demo.automationtesting.in/Register.html");		
		
		driver.findElement(By.linkText("WebTable")).click();		
		
		Thread.sleep(15000);		
		
		int NoofCustomers=driver.findElements(By.xpath("//div[@class='ui-grid-row ng-scope']")).size();		
				
		System.out.println(NoofCustomers);		
		
		int RowToVerify=NoofCustomers-1;
		
		
		
		String xpath1="//div[@id='1508232865816-"+RowToVerify+"-uiGrid-000";
		
		
		
		String xpath2="-cell']/div";
		
		
		String xpath1y = "//*[contains(@id,'-";
        String xpath2y = "-uiGrid-0005-cell')]";
		
		
		Thread.sleep(3000);
		
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='1508232865816-3-uiGrid-0008-cell']/div")).getText());
		
						
		for(int i=5;i<10;i++)
		{
			
			String rowvaluexpath=xpath1+i+xpath2;
			
			System.out.println(driver.findElement(By.xpath(rowvaluexpath)).getText());
			
			Thread.sleep(2000);
			
		}
		
		
		
		
				
				
				
				
				
		//div[@id='1508232865816-9-uiGrid-0005-cell']/div
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
