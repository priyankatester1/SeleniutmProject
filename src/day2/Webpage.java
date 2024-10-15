package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webpage {
	public static void main(String[] args) {		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();
		try {
				Thread.sleep(2000);			
				driver.findElement(By.id("my-text-id")).sendKeys("Kapil");
			    driver.findElement(By.name("my-password")).sendKeys("Kapil123");			    
			    driver.findElement(By.linkText("Return to index")).click();
			    Thread.sleep(2000);	
			    driver.navigate().back();			    
			    //drop down
			    Select select = new Select(driver.findElement(By.name("my-select"))); 
			    select.selectByVisibleText("One");			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
