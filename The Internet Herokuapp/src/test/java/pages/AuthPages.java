package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AuthPages {
    WebDriver driver;

    public AuthPages(WebDriver WebDrivers){
        driver = WebDrivers;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/div/p")
    private WebElement Successmessage;


    public void SuccessMessageIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(Successmessage));
        String messageText = Successmessage.getText();
        String Expected = "Congratulations! You must have the proper credentials.";
        if(messageText.equals(Expected)){
            System.out.println("Pesan Benar : " + messageText);
        }else{
            System.out.println("Pesan Salah : " + messageText );
        }
    }
}
