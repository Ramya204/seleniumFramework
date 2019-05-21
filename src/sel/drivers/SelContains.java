package sel.drivers;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelContains {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*[contains(text(),'Sekhar C')]
		System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("greens velmurugan");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		driver.findElement(By.xpath("(//a[@href='http://www.greenstechnologys.com/'])[1]")).click();
		
		

	}

}
