package StepDefs;

import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class stepdefs {

    private String homePage = "https://web.stg.gb.clearscore.io/";
    private String browserChoice = "chrome";
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = Browser.DriverFactory.open(browserChoice);
        driver.get(homePage);
    }


    @Given("^the user is on the homepage$")
    public void the_user_is_on_the_homepage()  {

    }

    @Then("^the correct homepage elements should be displayed$")
    public void the_correct_homepage_elements_should_be_displayed() {
        HomePage homepage = new HomePage(driver);
        homepage.allHomePageElementsAreDisplayedCheck();
    }


    @Given("^the user is on the login page$")
    @And("^the user will be able to click login$")
    public void the_user_will_be_able_to_click_login() {
        HomePage homepage = new HomePage(driver);
        LoginPage login = new LoginPage(driver);
        homepage.clickLogin();
        login.loginBoxIsDisplayed();
    }

    @When("^logs in with user name \"cs-everything@clrscr.uk\" and password \"Pa55word\"$")
    public void logs_in_with_username_and_password() {
        LoginPage login = new LoginPage(driver);
        login.enterUserAndPassword("test201@clrscr.uk","Pa55word");
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("^the user should be on the main page")
    public void the_user_should_be_on_the_main_page() {
        LoginPage login = new LoginPage(driver);
        login.checkMainPageUrl();
    }

    @And("^the correct main page elements should be displayed$")
    public void the_correct_main_page_elements_should_be_displayed() {
        LoginPage login = new LoginPage(driver);
        login.checkMainPageElements();
    }


    @After
    public void tearDown() {
        // driver.quit();
    }

}
