package TestScenarios;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.Library;
import bsh.Parser;

public class ExtractPDF {
	
	WebDriver driver;
	
	@Test
	
	public void ExtractPDF() throws IOException
	{		
		
		Library help=new Library();
		
	Boolean verifytext=help.verifyPDFText("D://Swathi_WS//Ta3s_Automation_Fw//TestData//cover.pdf", "SAP Project Systems");
		
	Assert.assertTrue(verifytext, "The text is not there in pdf");
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
