package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class HomePage {


    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(className = "nav-item--about")
    WebElement aboutUsBox;
    @FindBy(className = "nav-item--blog")
    WebElement blogBox;
    @FindBy(className = "nav-item--learn")
    WebElement learnBox;
    @FindBy(className = "nav-item--careers")
    WebElement careersBox;
    @FindBy(className = "nav-item--help")
    WebElement helpBox;
    @FindBy(id = "header-cta-btn--signup")
    WebElement signUpBox;
    @FindBy(id = "header-cta-btn--login")
    WebElement loginButton;




    public void allHomePageElementsAreDisplayedCheck() {
        Assert.assertTrue(aboutUsBox.isDisplayed());
        Assert.assertTrue(blogBox.isDisplayed());
        Assert.assertTrue(learnBox.isDisplayed());
        Assert.assertTrue(careersBox.isDisplayed());
        Assert.assertTrue(helpBox.isDisplayed());
        Assert.assertTrue(signUpBox.isDisplayed());
    }




    public void clickLogin() {
        loginButton.click();
    }




}
