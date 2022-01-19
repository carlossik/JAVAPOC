package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WeatherPage {


    public WebDriver Idriver;

    public WeatherPage(WebDriver rdriver) {
        Idriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    By SearchInput = By.xpath("//input[@id='ls-c-search__input-label']");
    By SearchSubmit = By.xpath("//body/div[@id='orb-modules']/div[@id='site-container']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1] submit \n");


}
