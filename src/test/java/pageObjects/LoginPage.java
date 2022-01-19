package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    public WebDriver Idriver;

    public LoginPage(WebDriver rdriver){
        Idriver = rdriver;
        PageFactory.initElements(rdriver,this);

    }
//    @FindBy(xpath = "//span[contains(text(),'Sign in')")
//    WebElement SignInButton;
   // By SignInButton = By.xpath("//span[contains(text(),'Sign in')");
    @FindBy(id = "user-identify-input")
    WebElement EmailField;

    //By EmailField = By.xpath("//input[@id='user-identified-input']");
    @FindBy(id = "password-input")
    WebElement PasswordField;
    //By PasswordField = By.xpath("//input[@id='password-input']");
    @FindBy(id = "submit-button")
    WebElement SignInButtonSubmit;
    //By SignInButtonSubmit = By.xpath("//button[@id='submit-button']");

   public void SetUserName(String email) {
       EmailField.clear();
       EmailField.sendKeys(email);
   }
    public void SetUserpassWord(String pwd) {
        PasswordField.clear();
        PasswordField.sendKeys(pwd);
    }

    public void submit(){
       SignInButtonSubmit.click();
    }

}
