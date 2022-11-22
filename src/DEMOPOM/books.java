package DEMOPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class books {

	@FindBy(xpath="(//a[@href=\"/books\"])[1]")
	private WebElement books;
	
	@FindBy(xpath="//img[@alt=\"Picture of Computing and Internet\"]")
	private WebElement  imgbooks;
	
	@FindBy(xpath="//input[@id=\"add-to-cart-button-13\"]")
	private WebElement addtocart;
	
	@FindBy(xpath="//span[.='Shopping cart']")
	private WebElement cart;
	
	
	public books(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	public void booksMethod()
	{
		books.click();
		imgbooks.click();
		addtocart.click();
		cart.click();
	}
}
