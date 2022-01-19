package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LoginPage;


public class Steps {
    public WebDriver driver;
    public LoginPage loginPage;
    @Given("User launches Chrome browser")
    public void user_launches_chrome_browser() {
        System.setProperty("webdriver.chrome.driver",("/usr/local/bin/chromedriver"));
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }
    @When("user navigates to {string}")
    public void user_navigates_to(String url) {
        driver.get(url);

    }
    @When("user enters email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) throws InterruptedException {
                 
        loginPage.SetUserName(email);
        loginPage.SetUserpassWord(password);

    }
    @When("clicks on Login Button")
    public void clicks_on_login_button() {
        loginPage.submit();

    }
    @Then("page Title should be {string}")
    public void page_title_should_be(String title) {
        Assert.assertTrue(title,driver.getPageSource().contains(title));

    }
    @Then("browser is closed")
    public void browser_is_closed() {
        driver.quit();

    }




}
