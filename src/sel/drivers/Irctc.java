package sel.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement from=driver.findElement(By.xpath("(//input [@autocomplete='off'])[1]"));
		from.sendKeys("Ramya");
		WebElement pass=driver.findElement(By.xpath("//input [@placeholder='To*']"));
		pass.sendKeys("Ramya");

	}

}
