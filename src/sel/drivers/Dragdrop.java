package sel.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
		System.out.println("DRAG AND DROP");
		// http://demo.guru99.com/test/drag_drop.html 
		System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dest=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		act.dragAndDrop(src, dest).perform();
		

	}

}
