package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage 
{
	@FindBy(xpath="//*[local-name()='svg'][@class='PlayButton_module_playIcon__c50ea884']")
	private WebElement playbtn;
	
	//@FindBy(xpath="")
	//private WebElement pausebtn;
	
	@FindBy(xpath="(//i[@class='fa fa-twitter'])[2]")
	private WebElement twitter;
	

	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlist;
	
	public WishListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//public void playbutton()
	//{
		//playbtn.click();
	//}
	
	//public void pausebutton()
	//{
		//pausebtn.click();
	//}

	public void wishlistbtn()
	{
		wishlist.click();
	}
	
	public void twittericon()
	{
		twitter.click();
	}

	public WebElement getTwitter() 
	{
		return twitter;
	}
}
