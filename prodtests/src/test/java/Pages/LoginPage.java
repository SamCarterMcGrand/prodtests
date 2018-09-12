package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    WebDriver driver;
    @FindBy(className = "overlay__heading")
    WebElement loginConfirmBox;

    public void aboutUsBoxIsDisplayed() {
        Assert.assertTrue(loginConfirmBox.isDisplayed());
        Assert.assertTrue(loginConfirmBox.getText().equals("Login"));
    }

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
