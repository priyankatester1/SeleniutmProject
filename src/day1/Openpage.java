package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Openpage {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.close();
	}

}
