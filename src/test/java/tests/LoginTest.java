package tests;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import data.data;
import pages.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest extends BaseTest  {
	LoginPage lp;
	data d;
	
  public LoginTest() throws IOException {
		super();
	}
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  openBrowser();
	  openEtsy();
	  d = new data();
		lp = new LoginPage();
		lp.signinButton.click();
  }
  
//@Test
  public void loginWithWrongPasswordTest() throws InterruptedException {
	lp.logIn(d.email, d.wrongpassword);
	Thread.sleep(5000);
	String passwordErr =  lp.PasswordErr.getText();
	System.out.println(passwordErr);
	Assert.assertEquals(d.wrongPasswordErr, passwordErr);
  }

@Test()
public void loginWithWithoutPasswordTest() throws InterruptedException {
	lp.logIn(d.email, "");
	Thread.sleep(5000);
	String passwordErr =  lp.PasswordErr.getText();
	System.out.println(passwordErr);
	Assert.assertEquals(d.noPasswordErr, passwordErr);
}

//@Test
public void loginTest() {
	lp.logIn(d.email, d.correctPassword);
	Assert.assertTrue(lp.profile.isDisplayed());
}

 

  @AfterMethod
  public void afterMethod() {
	  closeBrowser();
  }

}
