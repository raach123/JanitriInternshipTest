package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	  WebDriver driver;

	  
	  
	  @FindBy(xpath="//input[@id='formEmail']")
	  public WebElement userIdInput;
	  
	  @FindBy(xpath = "//input[@id='formPassword']")
	public WebElement passwordInput;
	  
	  @FindBy(xpath = "//img[@class=\"passowrd-visible\"]")
	  public WebElement passwordVisibilityToggle;
	  
	  @FindBy(xpath = "//button[@class='login-button']")
	  public WebElement loginBtn;
	  
     @FindBy(xpath = "//p[@class='normal-text']")
    public WebElement errorMessage;
     
    
     public boolean loginBtnEnabled;
     
	  
	  public  LoginPage(WebDriver driver) {
			PageFactory.initElements( driver,this);
		}

		public WebElement getuserIDInput(String uId) {
			return userIdInput;
		}

		public WebElement getPasswordInput(String pass) {
			return passwordInput;
		}
		
		public WebElement getpasswordVisibilityToggle() {
			return  passwordVisibilityToggle;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}
		
		 public boolean isLoginButtonEnabled() {
		   
				return loginBtnEnabled;
		    }

		    public WebElement getErrorMessage() {
		        return errorMessage;
		    }
	
		public void LoginOperation(String uId, String pass , String vTogle,String errorMsg) {
			userIdInput.sendKeys(uId);
			passwordInput.sendKeys(pass);
			passwordVisibilityToggle.click();
			errorMessage.getText();
			loginBtn.isEnabled();
			loginBtn.click();
			
		}
		
	}
