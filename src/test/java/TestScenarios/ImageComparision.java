package TestScenarios;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class ImageComparision {
	
	@Test
	public void ImageComparision() throws InterruptedException, IOException
	{
		
		   WebDriver driver=new FirefoxDriver();		
		
		   driver.get("http://demo.automationtesting.in/Register.html");
		   
	       Thread.sleep(2000);
	 
	       WebElement LogoImage = driver.findElement(By.cssSelector("#imagetrgt"));
	 
	       BufferedImage ExpectedImage=ImageIO.read(new File(System.getProperty("user.dir") +"\\Images\\Screenshot.png"));
	       
	       Screenshot screenshot = new AShot().takeScreenshot(driver,LogoImage);
	       
	      // BufferedImage ActualImage=screenshot.getImage();
	       
	       BufferedImage ActualImage= ImageIO.read(new File(System.getProperty("user.dir") +"\\Images\\Screenshot-N.png"));
	       
	       ImageDiffer ID=new ImageDiffer();
	       
	       ImageDiff diff=ID.makeDiff(ExpectedImage, ActualImage);
	       
	       System.out.println(diff.hasDiff());
	       
	       Assert.assertFalse(diff.hasDiff(), "Images are same");
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	 
	       Thread.sleep(2000);
	       driver.quit();
	   }
		
		
		
	}


