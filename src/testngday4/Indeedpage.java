package testngday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Indeedpage {
	WebDriver driver;
	
	@Parameters("baseurl")
	@Test
	void A(String baseurl) throws InterruptedException
	{
		System.out.println(baseurl);		
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Parameters({"job" , "area"})
	@Test
	void B(String job , String area)
	{
		System.out.println(job);
		System.out.println(area);
		driver.findElement(By.id("text-input-what")).sendKeys(job);
		driver.findElement(By.id("text-input-where")).sendKeys(area);
	}
}
