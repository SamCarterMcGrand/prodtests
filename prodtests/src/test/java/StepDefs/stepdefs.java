package StepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class stepdefs {

    public WebDriver driver;

    @Given("^the user is on the homepage$")
    public void the_user_is_on_the_homepage() {

    }


    @Then("^the correct elements should be displayed$")
    public void the_correct_elements_should_be_displayed() {
        boolean aboutUsDisplayed = driver.findElement(By.xpath("//*[@id=\"primary-nav\"]/div/div/nav/ul[1]/li[1]/a/span")).isDisplayed();
        Assert.assertTrue(aboutUsDisplayed);
    }


    /*@BeforeMethod
    public void setUp() {
        driver.get("https://www.clearscore.com");
    }*/

}
