package com.stepDefination;

import com.pages.StorePageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StoreLoginStepDefination {
    WebDriver driver;
    StorePageFactory st=new StorePageFactory();
    @Given("^I am on the Asian Paints website$")
    public void i_am_on_the_asian_paints_website() {
        st.launchHomePage();
    }
    @When("^I navigate to the \"([^\\\"]*)\" page$")
    public void i_navigate_to_the_page(String store) {
        st.navigateToStore();
    }
    @When("^I enter the pincode as \"([^\\\"]*)\" in the search box And I click on the \"([^\\\"]*)\" button And I click on the \"([^\\\"]*)\" button$")
    public void i_enter_the_pincode_in_the_search_box_and_i_click_on_the_button_and_i_click_on_the_button( String pincode,String string, String string2) throws InterruptedException {
       st.enterPincode(pincode);
    }
    @Then("^I should see the details of the store$")
    public void i_should_see_the_details_of_the_store() {
        st.clickSeeAll();
    }

}
