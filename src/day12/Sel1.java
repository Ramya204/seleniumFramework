package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel1 {

	public static void main(String[] args) {
//===========day 12 question1 ,2============
		
		/*System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		//--------font size and color----------
		WebElement text=driver.findElement(By.xpath("//h1[text()='No 1 Software Training Institutes in Chennai with Placements']"));
		String fontSize = text.getCssValue("font-size");
		System.out.println("font size"+fontSize);
		String color = text.getCssValue("color");
		System.out.println("color"+color);		
		//---------Scroll down--------------
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement down=driver.findElement(By.xpath("//h2[contains(text(),'Overall Reviews')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		//driver.quit();
		 
*/		
//============question 3============
		/*System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement down=driver.findElement(By.xpath("//div[@class='share-link-description']"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		WebElement up=driver.findElement(By.xpath("//img[@alt='TOOLSQA']"));
		js.executeScript("arguments[0].scrollIntoView(false)", up);*/
		
//==========question 4==========
		System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement down=driver.findElement(By.xpath("//h2[text()='Best Selenium training center in OMR']"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		js.executeScript("arguments[0].setAttribute('style','background:red')", down);
	
	}

}
