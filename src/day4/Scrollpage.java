package day4;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Scrollpage {

	public static void main(String[] args) throws InterruptedException, IOException  {		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");		
		driver.manage().window().maximize();
		Thread.sleep(3000);		
		//js  ; classes | interface 				
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1500)");	
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("E:\\Workspace\\Selenium3_30Sep\\src\\day4\\image1.png"));

				
	}

}
