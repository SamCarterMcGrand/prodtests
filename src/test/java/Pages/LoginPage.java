package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[3]/h1")
    WebElement loginConfirmBox;
    @FindBy(id = "field-email")
    WebElement emailField;
    @FindBy(id = "field-password")
    WebElement passwordField;
    @FindBy(className = "button")
    WebElement loginButton;
    @FindBy(className = "order-1")
    WebElement dashboardButton;
    @FindBy(id = "ui-menu-report")
    WebElement reportButton;
    @FindBy(id = "ui-menu-offers")
    WebElement offersButton;
    @FindBy(id = "ui-menu-timeline")
    WebElement timelineButton;
    @FindBy(id = "ui-menu-coaching")
    WebElement coachingButton;

    public void loginBoxIsDisplayed() {
        Assert.assertTrue(loginConfirmBox.isDisplayed());
        Assert.assertEquals("Login", loginConfirmBox.getText());
    }

    public void enterUserAndPassword(String username,String password) {
        emailField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public void checkMainPageUrl() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String URL = driver.getCurrentUrl();
        boolean urlContainsCorrectUrl = URL.contains("/account");
        System.out.println(URL);
        Assert.assertTrue(urlContainsCorrectUrl);
    }

    public void checkMainPageElements() {
        Assert.assertTrue(dashboardButton.isDisplayed());
        Assert.assertTrue(reportButton.isDisplayed());
        Assert.assertTrue(offersButton.isDisplayed());
        Assert.assertTrue(timelineButton.isDisplayed());
        Assert.assertTrue(coachingButton.isDisplayed());
    }


}
