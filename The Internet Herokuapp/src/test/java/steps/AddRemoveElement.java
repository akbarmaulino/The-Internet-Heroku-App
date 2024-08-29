package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AddRemoveElementPages;

public class AddRemoveElement {
    private AddRemoveElementPages addremovepages;


    @Given("User Already in Pages")
    public void user_already_in_pages() {
        WebDriver driver = hooks.getDriver();
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
        addremovepages.SuccessAddButton();
    }

    @And("User Click Delete Element")
    public void user_click_delete_element() {
        addremovepages.clickDeleteButton();
    }
    @Then("Element Success To Delete")
    public void element_success_to_delete() {
        addremovepages.successDeleteButton();
    }

}
