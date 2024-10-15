package testngday3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WriteLogic {	
	WebDriver driver;
	WriteLogic(WebDriver driver)
	{
		this.driver = driver;
	}	
	@Test 
	void SearchProd()
	{
		WebElement we = driver.findElement(By.name("q"));
		we.sendKeys("Mobile");
		we.sendKeys(Keys.ENTER);
		
	}
}
