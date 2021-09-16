package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseTest.BaseTest;

public class LoginPage extends BaseTest{
	
	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	public static WebElement signinButton;
	@FindBy(name = "email")
	public static WebElement email;
	@FindBy(name = "password")
	public static WebElement password;
	@FindBy(name = "submit_attempt")
	public static WebElement signIn;
	@FindBy(id = "aria-join_neu_password_field-error")
	public static WebElement PasswordErr;
	@FindBy(xpath = "//span[@class='wt-hide-xs wt-show-lg'][contains(text(),'You')]")
	public static WebElement profile;
	
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	public void sendEmail(String a) {
		
	}
	public void sendPassword(String b) {
		
	}
	public void logIn(String a, String b) {
		email.sendKeys(a);
		password.sendKeys(b);
		signIn.click();
	}
	

}
