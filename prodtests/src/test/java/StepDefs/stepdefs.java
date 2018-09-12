package StepDefs;

import Pages.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Scanner;



public class stepdefs {

//     public static void main(String[] args) {
//
//        java.lang.System.out.println("Please choose a browser");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        if (input.equalsIgnoreCase("chrome")) {
//            browserChoice = "chrome";
//        } else if (input.equalsIgnoreCase("firefox")) {
//            browserChoice = "firefox";
//        }
//    }

    String homePage = "https://www.clearscore.com";
    String browserChoice = "chrome";
    WebDriver driver;
    HomePage homepage = new HomePage(driver);




    @Given("^the user is on the homepage$")
    public void the_user_is_on_the_homepage()  {
        System.out.println("This is the first step");
    }


    @Then("^the correct elements should be displayed$")
    public void the_correct_elements_should_be_displayed() {
        //Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"primary-nav\"]/div/div/nav/ul[1]/li[1]/a")).isDisplayed());

        homepage.aboutUsBoxIsDisplayed();
        // homepage.blog();
    }

    @And("^the user will be able to click login$")
    public void the_user_will_be_able_to_click_login() {

    }


    @Before
    public void setUp() {
        driver = Browser.DriverFactory.open(browserChoice);
        driver.get(homePage);
    }

}
