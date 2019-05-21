package sel.drivers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookJS {

	public FacebookJS() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement email= driver.findElement(By.id("email"));
	js.executeScript("arguments[0].setAttribute('value','ramya')", email);
	String s = js.executeScript("return arguments[0].getAttribute('value')", email).toString();
	System.out.println(s);
	WebElement pass=driver.findElement(By.id("pass"));
	js.executeScript("arguments[0].setAttribute('value','ramya')", pass);
	String s1 = js.executeScript("return arguments[0].getAttribute('value')", pass).toString();
	System.out.println(s1);
	WebElement button=driver.findElement(By.id("loginbutton"));
	js.executeScript("arguments[0].click()",button);

	//alert window generation using Js
		js.executeScript("alert('Welcome to fb');"); 
		
		//switching to alerts
		Alert alert= driver.switchTo().alert();
		// Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);		
        // Accepting alert		
        alert.accept();	
        
	//Fetching the Domain Name of the site. Tostring() change object to name.		
    String DomainName = js.executeScript("return document.domain;").toString();			
    System.out.println("Domain name of the site = "+DomainName);					
      		
    //Fetching the URL of the site. Tostring() change object to name		
    String url = js.executeScript("return document.URL;").toString();			
    System.out.println("URL of the site = "+url);					
      		
   //Method document.title fetch the Title name of the site. Tostring() change object to name		
   String TitleName = js.executeScript("return document.title;").toString();			
   System.out.println("Title of the page = "+TitleName);					

    		
  //Navigate to new Page i.e to generate access page. (launch new url)		
  js.executeScript("window.location = 'http://demo.guru99.com/'");
  
	
	driver.quit();
	}

}
