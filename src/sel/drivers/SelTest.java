package sel.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
String url=driver.getCurrentUrl();
System.out.println(url);
WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
email.sendKeys("Ramya");

WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
pass.sendKeys("password");

String title=driver.getTitle();

WebElement btn=driver.findElement(By.xpath("//input[@type='submit']"));
String button=btn.getAttribute("value");
System.out.println(button);
System.out.println(title);
driver.quit();

	}

}
