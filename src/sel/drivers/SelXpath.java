package sel.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/login");
		WebElement email=driver.findElement(By.xpath("(//input [@name='session[username_or_email]'])[2]"));
		email.sendKeys("Ramya");
		WebElement pass=driver.findElement(By.xpath("(//input [@name='session[password]'])[2]"));
		pass.sendKeys("Ramya");
		WebElement btn=driver.findElement(By.xpath("//button[@type='submit']"));
		String button=btn.getAttribute("type");
		System.out.println(button);
		
		WebElement txt=driver.findElement(By.xpath("//h1[text()='Log in to Twitter']"));
		String text=txt.getText();
		System.out.println(text);
		
		WebElement contain =driver.findElement(By.xpath("//*[contains(text(),' Already using ')]"));
		//WebElement contain =driver.findElement(By.xpath("//h1[contains(text(),'Log')]"));
		String cont=contain.getText();
		System.out.println(cont);
		//h1[contains(text(),'Log')]  //*[contains(text(),' Already using ')]
		btn.click();
	}

}
