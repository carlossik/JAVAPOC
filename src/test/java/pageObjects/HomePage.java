package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;


public class HomePage {
    public WebDriver Idriver;

    public HomePage(WebDriver rdriver) {
        Idriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    By WeatherLink = By.xpath(".//a[contains(@href,'https://www.bbc.co.uk/weather')]");
//    By EmailField = By.xpath("//input[@id='user-identified-input']");
//    By PasswordField = By.xpath("//input[@id='password-input']");
//    By SignInButtonSubmit = By.xpath("//button[@id='submit-button']");
//    //".//a[contains(@href,'https://www.bbc.co.uk/weather')]"
}
