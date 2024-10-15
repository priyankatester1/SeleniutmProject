package testpage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestWebForm {	
	//global : inside a class but outside a method body
	ChromeDriver driver;	
	@Test(priority = 1)
	void OpenWebPage() throws InterruptedException
	{
		driver  = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}	
	@Test(priority = 2)
	void EnterData()
	{
		driver.findElement(By.id("my-text-id")).sendKeys("SS");
		driver.findElement(By.name("my-password")).sendKeys("SS1234");
	}

}
