package sel.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelWaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&followup=https%3A%2F%2Faccounts.google.com%2FManageAccount&flowName=GlifWebSignIn&flowEntry=AddSession");
		/*// IMPLICIT WAIT
		driver.findElement(By.id("identifierId")).sendKeys("****");
		driver.findElement(By.id("identifierNext")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys("****");
		driver.findElement(By.id("passwordNext")).click();*/
		
/*		//EXPLICIT WAIT
		driver.findElement(By.id("identifierId")).sendKeys("ramzfreeya");
		driver.findElement(By.id("identifierNext")).click();
		WebDriverWait wait=new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.name("password"))).sendKeys("2r2amyaa");
		driver.findElement(By.id("passwordNext")).click();*/
		
		//FLUENT WAIT
		driver.findElement(By.id("identifierId")).sendKeys("****");
		driver.findElement(By.id("identifierNext")).click();
		Wait wait=new FluentWait(driver).withTimeout(1000, TimeUnit.SECONDS)
				.pollingEvery(10, TimeUnit.MILLISECONDS).ignoring(Throwable.class);
		Object until = wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
		WebElement element=(WebElement)until;
		element.sendKeys("*****");
		driver.findElement(By.id("passwordNext")).click();

	}

}
