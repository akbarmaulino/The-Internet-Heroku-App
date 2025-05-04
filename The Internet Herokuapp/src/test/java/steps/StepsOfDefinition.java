package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AddRemoveElementPages;
import pages.AuthPages;
import pages.CheckboxPages;
import pages.MainPages;

public class StepsOfDefinition {
    private AddRemoveElementPages addremovepages;
    private AuthPages basicauthpages;
    private  MainPages mainpages;
    private CheckboxPages checkboxpages;


    @Given("User Already in Pages")
    public void user_already_in_pages() {
        WebDriver driver = hooks.getDriver();
        addremovepages = new AddRemoveElementPages(driver);
        basicauthpages = new AuthPages(driver);
        mainpages = new MainPages(driver);
        checkboxpages = new CheckboxPages(driver);
    }
    @When("User Click Add Element")
    public void user_click_add_element() {
        mainpages.addremovebuttonisdisplayed();
        mainpages.clickaddremovebutton();
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

    @Then("User Get Success Message")
    public void user_get_success_message(){
        basicauthpages.SuccessMessageIsDisplayed();
    }

    @When("User Click Blank Checkbox")
    public void user_click_blank_checkbox() {
        mainpages.checkboxisplayed();
        mainpages.clickcheckbox();
        checkboxpages.fillchekbox();
    }
    @Then("Checkbox Success To Check")
    public void checkbox_success_to_check() {
        checkboxpages.SuccessFillcheckbox();
    }

    @When("User Click Fill Checkbox")
    public void user_click_fill_checkbox() {
        mainpages.checkboxisplayed();
        mainpages.clickcheckbox();
        checkboxpages.unfillchekbox();
    }
    @Then("Checkbox Success To Uncheck")
    public void checkbox_success_to_uncheck() {
        checkboxpages.SuccessUnfillcheckbox();
    }



}
