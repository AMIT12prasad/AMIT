package DEMOPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computers {

	@FindBy(xpath="(//a[@href=\"/computers\"])[1]")
	private WebElement computers;
	
	@FindBy(xpath="(//a[@href=\"/notebooks\"])[4]")
	private WebElement notebooks;
	
	@FindBy(xpath="//input[@value=\"Add to cart\"]")
	private WebElement addtocart;
	
	
	public Computers(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void computerMethods()
	{
		computers.click();
		notebooks.click();
		addtocart.click();
	}
	
}
