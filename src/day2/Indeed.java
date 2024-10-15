package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indeed {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.indeed.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		driver.findElement(By.id("text-input-what")).sendKeys("Selenium Testing");
		driver.findElement(By.id("text-input-where")).sendKeys("Noida");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
