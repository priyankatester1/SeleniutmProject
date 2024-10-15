package testngday3;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MasterPage implements I {	
	WebDriver driver;
	@Test
	void Open_Webpage() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}	
	@Test 
	void SearchProd()
	{
		WebElement we = driver.findElement(By.name("q"));
		we.sendKeys("Mobile");
		we.sendKeys(Keys.ENTER);		
	}
	
}
