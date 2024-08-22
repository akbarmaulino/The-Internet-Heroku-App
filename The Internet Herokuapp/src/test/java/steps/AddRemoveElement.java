package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AddRemoveElementPages;

public class AddRemoveElement {
    private WebDriver driver;
    private AddRemoveElementPages addremovepages;


    @Given("User Already in Pages")
    public void user_already_in_pages() {
        driver = hooks.getDriver();
        addremovepages = new AddRemoveElementPages(driver);
        addremovepages.addremovebuttonisdisplayed();
        addremovepages.clickaddremovebutton();
    }
    @When("User Click Add Element")
    public void user_click_add_element() {
        addremovepages.clickaddbutton();
    }
    @Then("Element Success To Add")
    public void element_success_to_add() {
        System.out.println("Add Button Success To Add");
    }

}
