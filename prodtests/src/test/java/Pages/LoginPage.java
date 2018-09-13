package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[3]/h1")
    WebElement loginConfirmBox;

    public void loginBoxIsDisplayed() {
        Assert.assertTrue(loginConfirmBox.isDisplayed());
        Assert.assertEquals("Login", loginConfirmBox.getText());
    }


}
