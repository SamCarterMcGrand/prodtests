package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage {

    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"primary-nav\"]/div/div/nav/ul[1]/li[1]/a")
    WebElement aboutUsBox;
    @FindBy(xpath = "//*[@id=\"primary-nav\"]/div/div/nav/ul[1]/li[2]/a")
    WebElement blogBox;
    @FindBy(xpath = "//*[@id=\"primary-nav\"]/div/div/nav/ul[1]/li[3]/a")
    WebElement learnBox;
    @FindBy(xpath = "//*[@id=\"primary-nav\"]/div/div/nav/ul[1]/li[4]/a")
    WebElement careersBox;
    @FindBy(xpath = "//*[@id=\"primary-nav\"]/div/div/nav/ul[1]/li[5]/a")
    WebElement helpBox;


    public void aboutUsBoxIsDisplayed() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertTrue(aboutUsBox.isDisplayed());
    }
    public void blogBoxIsDisplayed() {
        Assert.assertTrue(blogBox.isDisplayed());
    }
    public void learnBoxIsDisplayed() {
        Assert.assertTrue(learnBox.isDisplayed());
    }
    public void careersBoxIsDisplayed() {
        Assert.assertTrue(careersBox.isDisplayed());
    }
    public void helpBoxIsDisplayed() {
        Assert.assertTrue(helpBox.isDisplayed());
    }

    public void clickLogin() {

    }


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}
