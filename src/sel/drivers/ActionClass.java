package sel.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		
		System.out.println("MOVE TO ELEMENT");
		System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		Actions act=new Actions(driver);
		WebElement cou=driver.findElement(By.xpath("//a[text()='COURSES']"));
		act.moveToElement(cou).perform();
		
		WebElement jav=driver.findElement(By.xpath("//span[text()='Java Training ']"));
		act.moveToElement(jav).perform();
		//act.clickAndHold(jav).perform();
		
		driver.findElement(By.xpath("//span[text()='Core Java Training']")).click();
		
		

	}

}
