package sel.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		System.out.println("KEYUP/DOWN AND COUBLE/CONTEXT CLICK");
		System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Actions act=new Actions(driver);
		WebElement email=driver.findElement(By.id("email"));
		//email.sendKeys("Ramya");
		act.keyDown(email, Keys.SHIFT).sendKeys("ramya").keyUp(email,Keys.SHIFT);
		WebElement pass=driver.findElement(By.id("pass"));
		act.moveToElement(pass).perform();
		act.doubleClick(email).perform();
		act.contextClick(email).perform();
		
		
	}

}
