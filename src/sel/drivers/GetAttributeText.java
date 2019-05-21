package sel.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement text =driver.findElement(By.xpath("//p[text()=' Learn ']"));
		String value=text.getText();
		System.out.println(value);
		System.out.println("WITH CONTAINS()");
		String cont=driver.findElement(By.xpath("//*[contains(text(),' Learn ')]")).getText();
		System.out.println(cont);

		

	}

}
