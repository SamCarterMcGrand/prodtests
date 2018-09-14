package StepDefs;

import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;



public class stepdefs {

    String homePage = "https://www.clearscore.com";
    String browserChoice = "chrome";
    WebDriver driver;

    @Before
    public void setUp() {
        driver = Browser.DriverFactory.open(browserChoice);
        driver.get(homePage);
    }


    @Given("^the user is on the homepage$")
    public void the_user_is_on_the_homepage()  {

    }

    @Then("^the correct elements should be displayed$")
    public void the_correct_elements_should_be_displayed() {
        HomePage homepage = new HomePage(driver);
        homepage.aboutUsBoxIsDisplayed();
        homepage.blogBoxIsDisplayed();
        homepage.learnBoxIsDisplayed();
        homepage.careersBoxIsDisplayed();
        homepage.helpBoxIsDisplayed();

    }

    @And("^the user will be able to click login$")
    public void the_user_will_be_able_to_click_login() {
        HomePage homepage = new HomePage(driver);
        LoginPage loginThing = new LoginPage(driver);
        homepage.clickLogin();
        loginThing.loginBoxIsDisplayed();
    }



    @After
    public void tearDown() {
        driver.quit();
    }

}