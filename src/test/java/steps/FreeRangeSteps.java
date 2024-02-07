package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;

public class FreeRangeSteps {

    MainPage landingPage = new MainPage();

    @Given("I navigate to Free Range Testers web page")
    public void iNavigateToFreeRangeTesters(){
        landingPage.navigateToFreeRangeTesters();
    }

    @When("I try to access the free sections through the navigation bar")
    public void iAccessToSectionThroughTheNavigationBar(){

    }

    @Then("I am redirected to the right page")
    public void iAmInTheRightPage(){

    }

}
