package co.uk.mailtravel.stepdefs;

import co.uk.mailtravel.pages.BookingDetails;
import co.uk.mailtravel.pages.BookingPage;
import co.uk.mailtravel.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
/**
 * They can also be used to hide implementation details by calling several reusable
 * helper methods from one step definition.
 * This helps in a number of ways:
 *
 * Increased maintainability.
 * Increased scalability with reusable steps.
 * More understandable tests.
 */
public class HolidayBookingStepdefs {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I enter \"([^\"]*)\" in the search box$")
    public void iEnterInTheSearchBox(String str) throws InterruptedException {
        new HomePage().enterYourDestination("India");

    }

    @And("^I click on Accept Cookie Button$")
    public void iClickOnAcceptCookieButton()  {
        new HomePage().clickOnAcceptCookies();

    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() {
        new HomePage().clickOnSearchButton();
    }

    @And("^I click on More Info button$")
    public void iClickOnMoreInfoButton() {
        new BookingPage().clickOnMoreInfoBtn();
    }
    @Then("^I should see and able to verify \"([^\"]*)\"\"([^\"]*)\" and \"([^\"]*)\"$")
    public void iShouldSeeAndAbleToVerifyAnd(String price, String days, String phonenum)  {
        new BookingPage().userShouldSeeDaysPriceTelephoneNumberDisplayed();
           }



    @When("^I click Book Online button$")
    public void iClickBookOnlineButton() {
        new BookingPage().clickOnBookOnlineButton();
    }


    @Then("^I should be able to book and verify first available \"([^\"]*)\"$")
    public void iShouldBeAbleToBookAndVerifyFirstAvailable(String date) {
        Assert.assertTrue(date,new BookingDetails().verifyItIsSelectingFirstAvailableDate().contains("18"));
    }
    @And("^I click on Continue button$")
    public void iClickOnContinueButton() {
        new BookingDetails().clickOnContinueBtn();
    }

    @And("^I select standard room and select \"([^\"]*)\" from dropdown$")
    public void iSelectStandardRoomAndSelectFromDropdown(String numberone) {
        new BookingDetails().selectRoomFromDropDown("1");
    }

    @And("^I click on Select your Room and Continue$")
    public void iClickOnSelectYourRoomAndContinue() {
        new BookingDetails().clickOnSelectRoomAndContinue();
    }

    @And("^I click on continue without extras button$")
    public void iClickOnContinueWithoutExtrasButton() throws InterruptedException {
        new BookingDetails().clickOnContinueWithoutExtrasBtn();
    }

    @When("^I select \"([^\"]*)\" from dropdown for Adult one$")
    public void iSelectFromDropdownForAdultOne(String title)  {
        new BookingDetails().selectTitleFromDropDownForAdultOne("Mr");

    }

    @And("^I enter \"([^\"]*)\" and \"([^\"]*)\" for Adult one$")
    public void iEnterAndForAdultOne(String firstName, String lastName) throws InterruptedException {
        new BookingDetails().enterFirstNameLastName("Bob","Black");

    }

    @And("^I select \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" from dropdown for Adult one$")
    public void iSelectFromDropdownForAdultOne(String date, String month, String year)  {
        new BookingDetails().selectDateMonthYearForAdultOne("1","January","1979");

    }

    @When("^I select \"([^\"]*)\" from dropdown for Adult two$")
    public void iSelectFromDropdownForAdultTwo(String title)  {
        new BookingDetails().selectTitleFromDropDownForAdultTwo("Mrs");

    }

    @And("^I enter \"([^\"]*)\" and \"([^\"]*)\" for Adult two$")
    public void iEnterAndForAdultTwo(String firstname, String lastname )  {
        new BookingDetails().enterFirstNameLastNameForAdultTwo("Alicia","Chapman");

    }

    @And("^I select \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" from dropdown for Adult$")
    public void iSelectFromDropdownForAdultTwo(String day1, String month1, String year1)  {
        new BookingDetails().selectDateMonthYearForAdultTwo("5","April","1985");

    }

    @Then("^I should verify payment amount as per accomodation selected$")
    public void iShouldVerifyPaymentAmountAsPerAccomodationSelected() {
        Assert.assertEquals("£9,396",new BookingDetails().verifyPaymentAmountAsPerAccomodationSelected());
    }



}


