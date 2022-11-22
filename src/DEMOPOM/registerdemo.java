package DEMOPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerdemo {

	@FindBy(xpath="(//div[@class=\"gender\"])[1]")
	private WebElement maleradiobutton;
	
	@FindBy(xpath="(//label[@class=\"forcheckbox\"])[2]")
	private WebElement femaleradiobutton;
	
	@FindBy(id="FirstName")
	private WebElement firstname;
	
	@FindBy(id="LastName")
	private WebElement lastname;
	
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpassword;
	
	@FindBy(id="register-button")
	private WebElement registerbutton;
	
	
	public  registerdemo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void registerMethod()
	{
		maleradiobutton.click();
		firstname.sendKeys("amit");
		lastname.sendKeys("kumar");
		email.sendKeys("akdk@gmail.com");
		password.sendKeys("Amit@123");
		confirmpassword.sendKeys("Amit@123");
		registerbutton.click();
	}
	
}
