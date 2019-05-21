package sel.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelFox {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.ie.driver", "/Selenium/SeleniumTest/driver/IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement email= driver.findElement(By.id("email"));
	email.sendKeys("Ramya");
	System.out.println(email);
	WebElement pass=driver.findElement(By.id("pass"));
	pass.sendKeys("password");
	
	WebElement button=driver.findElement(By.id("loginbutton"));
	button.click();
	
	driver.quit();

		}

	}
