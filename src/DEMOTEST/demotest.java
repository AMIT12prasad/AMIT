package DEMOTEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DEMOPOM.Computers;
import DEMOPOM.books;
import DEMOPOM.logintodemowebshop;
import DEMOPOM.registerdemo;

public class demotest {
	
	@Test
	public void webtest() throws InterruptedException
 {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		
		Thread.sleep(3000);
		registerdemo  reg=new registerdemo(driver);
		reg.registerMethod();
		
		logintodemowebshop login=new logintodemowebshop(driver);
		login.loginMethod();
		
		Thread.sleep(3000);
		books book= new books(driver);
		book.booksMethod();
		
		Thread.sleep(3000);
		Computers comp= new Computers(driver);
		comp.computerMethods();
				

	}

}
