package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddRemoveElementPages {
    WebDriver driver;
    WebDriverWait wait;

    public AddRemoveElementPages(WebDriver WebDrivers){
        driver = WebDrivers;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[2]/a")
    private WebElement addremovebutton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/button")
    private WebElement addbutton;

    public void clickaddremovebutton(){
        addremovebutton.click();
    }

    public void addremovebuttonisdisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(addremovebutton));
    }

    public void clickaddbutton(){
        addbutton.click();
    }
}
