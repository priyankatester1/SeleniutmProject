package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	
	public static void main(String[] args) {		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		try {
				Thread.sleep(3000);
				driver.navigate().refresh();
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
									
	}
}
//.to()
//.back()
//.forward()
//.ref()