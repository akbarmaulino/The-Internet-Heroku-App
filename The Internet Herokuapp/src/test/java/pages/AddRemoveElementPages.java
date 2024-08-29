package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class AddRemoveElementPages {
    WebDriver driver;
    private int number;
    private int initialElementRemove;

    public AddRemoveElementPages(WebDriver WebDrivers){
        driver = WebDrivers;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[2]/a")
    private WebElement addremovebutton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/button")
    private WebElement addbutton;

    @FindBy(xpath = "//*[@id='elements']/button")
    private List<WebElement> verifySuccess;



    public void clickaddremovebutton(){
        addremovebutton.click();
    }

    public void addremovebuttonisdisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(addremovebutton));
    }

    public void clickaddbutton(){
        Random random = new Random();
        number = random.nextInt(10) + 1;
        for (int i = 1; i <= number; i ++){
            addbutton.click();
        }
        System.out.println("Tombol Di Klik Sebanyak : " + number + " Kali");
    }

    public void SuccessAddButton(){
        System.out.println("Jumlah elemen yang ditemukan: " + verifySuccess.size());
        int jumlahadd = verifySuccess.size();
        if(number == jumlahadd){
            System.out.println("Jumlah Add Button Sesuai");
        }else {
            System.out.println("Jumlah Add Salah");
        }
    }

    public void clickDeleteButton() {
        Random random = new Random();
        int ElementRemove = random.nextInt(number);
        initialElementRemove = ElementRemove;

        while (!verifySuccess.isEmpty() && ElementRemove > 0) {
            int totalButtons = verifySuccess.size();

            if (totalButtons > 0) {
                int randomindex = random.nextInt(totalButtons);
                WebElement elementToRemove = verifySuccess.get(randomindex);
                elementToRemove.click();

                verifySuccess.remove(randomindex);

                ElementRemove--;
            }
        }
        System.out.println("Tombol Hapus Di Klik Sebanyak: " + initialElementRemove + " Kali");
    }

    public void successDeleteButton() {
        System.out.println("Jumlah elemen yang ditemukan: " + verifySuccess.size());
        int expectedRemainingButtons = verifySuccess.size() + initialElementRemove;
        if (number == expectedRemainingButtons) {
            System.out.println("Jumlah Button Sesuai");
        } else {
            System.out.println("Jumlah Button Salah");
        }
    }


}
