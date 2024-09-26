package com.automation.steps;

import com.automation.pages.BusHomePage;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BusHomeSteps {

    BusHomePage busHomePage = new BusHomePage();

    @Given("user opens the website")
    public void userOpensTheWebsite() {
        busHomePage.openWebsite();
    }

    @Then("verify user is on home page")
    public void verifyUserIsOnHomePage() {
        assertThat(busHomePage.getHomeSearchBtn()).isVisible();

    }

    @When("the user clicks on Bus from the navigation bar")
    public void the_user_clicks_on_bus_from_the_navigation_bar() {
        busHomePage.clickOnBusFromNavBar();

    }

    @Then("verify the user is on the bus home page")
    public void verify_the_user_is_on_the_bus_home_page() {
        assertThat(busHomePage.getBusTicketText()).hasText("Online Bus Tickets");

    }

    @When("user enter the source city {string}")
    public void user_enter_the_source_city(String sourceCity) {
        busHomePage.enterTheSourceCity(sourceCity);

    }

    @When("user enter the destination city {string}")
    public void user_enter_the_destination_city(String destinationCity) {
        busHomePage.enterTheDestinationCity(destinationCity);

    }

    @When("user select departure date as {string}")
    public void user_select_departure_date_as(String date) {
        busHomePage.selectDepartureDate(date);

    }

    @When("user click on search button on the bus page")
    public void user_click_on_search_button_on_the_bus_page() {
        busHomePage.clickOnSearchBtnOnBusPage();

    }
}
