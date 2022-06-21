package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddnewclientPage 
{
	WebDriver driver;
		public AddnewclientPage(WebDriver driver)
		{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

		@FindBy(xpath = "//a[.='Clients']")
		public WebElement Clients;
		
		@FindBy(xpath = "//a[@id='mySmallModalLabel']")
		public WebElement Addnewclientbutton;
		
		@FindBy(xpath = "//input[@id='fname']")
		public WebElement firstname;
		
		@FindBy(xpath = "//input[@id='lname']")
		public WebElement lastname;
		
		@FindBy(xpath = "//input[@id='chknoemail']")
		public WebElement EmailCheckbox;
		
		@FindBy(xpath = "//input[@id='email']")
		public WebElement email;
		
		@FindBy(xpath = "//span[@id='select2-referred_by_dd-container']")
		public WebElement Reffereddropdown;
		
		@FindBy(xpath = "(//span[.='No'])[4]")
		public WebElement portalaccessdropdown;
		
		@FindBy(xpath = "//li[.='Yes']")
		public WebElement yesbtn;

		@FindBy(xpath = "//input[@id='sub_button']")
		public WebElement Savebutton;
		
		@FindBy(xpath = "//a[@class='m-r-24 btn green-btn form-btn waves-effect waves-light no-shadow']")
		public WebElement Okbutton;

		@FindBy(xpath = "//div[@id='flash-message']")
		public WebElement Clientsucessfullmsg;
		
		@FindBy(xpath = "//a[@value= 'Close']")
		public WebElement Cancelbutton;
		
		@FindBy(xpath = "//a[.='Clients']")
		public WebElement assertclient;
		
}
