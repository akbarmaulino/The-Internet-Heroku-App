package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPages {
    WebDriver driver;

    public CheckboxPages(WebDriver WebDrivers){
        driver = WebDrivers;
        PageFactory.initElements(driver,this);
    }

    public WebElement Checkbox(int index){
        String xpath = "//*[@id=\"checkboxes\"]/input["+ index + "]";
        return driver.findElement(By.xpath(xpath));
    }

    public void CheckCheckbox(int index){
        WebElement button = Checkbox(index);
        button.click();
    }

    public void fillchekbox(){
        CheckCheckbox(1);
    }

    public void unfillchekbox(){
        CheckCheckbox(2);
    }

    public void SuccessFillcheckbox(){
        WebElement element = Checkbox(1);

        if (element.isSelected()) {
            System.out.println("Checkbox berhasil dicentang.");
        } else {
            System.out.println("Checkbox tidak dicentang, salah.");
        }
    }

    public void SuccessUnfillcheckbox(){
        WebElement element = Checkbox(2);

        if (!element.isSelected()) {
            System.out.println("Checkbox Tidak dicentang.");
        } else {
            System.out.println("Checkbox dicentang, salah.");
        }
    }


}
