package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
        Assert.assertTrue(aboutUsBox.isDisplayed());
    }
    public void blogBoxIsDisplayed() {
        org.testng.Assert.assertTrue(blogBox.isDisplayed());
    }
    public void learnBoxIsDisplayed() {
        org.testng.Assert.assertTrue(learnBox.isDisplayed());
    }
    public void careersBoxIsDisplayed() {
        org.testng.Assert.assertTrue(careersBox.isDisplayed());
    }
    public void helpBoxIsDisplayed() {
        org.testng.Assert.assertTrue(helpBox.isDisplayed());
    }

    public void clickLogin() {

    }


    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

}
