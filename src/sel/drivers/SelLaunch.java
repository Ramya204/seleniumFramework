package sel.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelLaunch {



		public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement email= driver.findElement(By.id("email"));
	email.sendKeys("Ramya");
	
	WebElement pass=driver.findElement(By.id("pass"));
	pass.sendKeys("password");
	
	WebElement button=driver.findElement(By.id("loginbutton"));
	button.click();
	driver.quit();

		}

	

	}


