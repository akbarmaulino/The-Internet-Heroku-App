package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPages {
    WebDriver driver;

    public MainPages(WebDriver WebDrivers){
        driver = WebDrivers;
        PageFactory.initElements(driver,this);
    }

    public WebElement MainListButton(int index) {
        String xpath = "//*[@id='content']/ul/li[" + index + "]/a";
        return driver.findElement(By.xpath(xpath));
    }

    public void ClickMainListButton(int index) {
        WebElement button = MainListButton(index);
        button.click();
    }

    public void MainListIsDisplayed(int index) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(MainListButton(index)));
    }

    public void clickaddremovebutton(){
        ClickMainListButton(2);
    }

    public void addremovebuttonisdisplayed(){
        MainListIsDisplayed(2);
    }

    public void clickcheckbox(){
        ClickMainListButton(6);
    }

    public void checkboxisplayed(){
        MainListIsDisplayed(6);
    }
}
