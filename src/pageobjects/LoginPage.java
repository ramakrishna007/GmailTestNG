package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	public WebElement Tbx_Username;
	
	@FindBy(id="next")
	public WebElement Btn_Next;
	
	@FindBy(id="Passwd")
	public WebElement Tbx_Password;
	
	@FindBy(id="signIn")
	public WebElement Btn_Signin;
	
	@FindBy(id="PersistentCookie")
	public WebElement Cbx_StaySignedin;
	
	@FindBy(id="account-chooser-link") 
	public WebElement Lnk_DifferentAccount;
	
	@FindBy(xpath=".//*[@id='view_container']//*[@role='button']")
	public WebElement Btn_Done;
	
	@FindBy(id="reauthEmail")
	public WebElement Txt_Email;
	
	@FindBy(xpath="//*[contains(@id,'choose-account')]")
	public WebElement WebEle_ChooseAccount;
	
	@FindBy(id="account-chooser-add-account")
	public WebElement Lnk_AddAccount;
	
	@FindBy(id="edit-account-list")
	public WebElement Lnk_Remove;
	
	@FindBy(id="rsi-card")
	public WebElement WebEle_RsiCard;
	
	@FindBy(id="signin_status")
	public WebElement Txt_SigninStatus;
	
	@FindBy(xpath="//*[contains(text(),'Sign In')]")
	public WebElement Lnk_Gmail;
}
