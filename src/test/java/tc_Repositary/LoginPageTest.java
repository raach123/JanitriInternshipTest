package tc_Repositary;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseTest;
import objectRepositary.LoginPage;

public class LoginPageTest extends BaseTest {

	    @Test
	    public void testLoginButtonDisabledWhenFieldsAreEmpty() {
	        LoginPage loginPage = new LoginPage(driver);
	        Assert.assertFalse(loginPage.isLoginButtonEnabled());
	    }

	    @Test
	    public void testPasswordMaskedButton() {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.getPasswordInput("somepassword");
	        // Check password input type is 'password'
	       // Assert.assertEquals(driver.findElement((By) loginPage.passwordInput).getAttribute("type"), "password");
	        loginPage.getpasswordVisibilityToggle();
	       // Assert.assertEquals(driver.findElement((By) loginPage.passwordInput).getAttribute("type"), "text");
	    }

	    @Test
	    public void testInvalidLoginShowErrorMsg() {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.getuserIDInput("invalidUser");
	        loginPage.getPasswordInput("invalidPass");
	        loginPage.getLoginBtn();
	        loginPage.getErrorMessage();
	    }

}
