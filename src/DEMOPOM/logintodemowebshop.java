package DEMOPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logintodemowebshop {
	
	@FindBy(xpath="//a[.='Register']")
	private WebElement register;
	
	@FindBy(xpath="//a[.='Log in']")
	private WebElement login;
	
	@FindBy(xpath="//span[.='Shopping cart']")
	private WebElement shoppingcart;
	
	@FindBy(xpath="//span[.='Wishlist']")
	private WebElement wishlist;
	
	public logintodemowebshop(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	public void loginMethod()
	{
	 register.click();
	}
	public void login()
	{login.click();
	}
	
	public void shoppingcart()
	{shoppingcart.click();}
	
	public void wishlist()
	{wishlist.click();
	}

}
