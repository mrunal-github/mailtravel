package co.uk.mailtravel.pages;

import co.uk.mailtravel.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * Abstraction (Oops concept of JAVA)
 * In Page Object Model design pattern, we write locators (such as id, name, xpath etc.,)
 * in a Page Class. We utilize these locators in tests but we can’t see these locators in the tests.
 * Literally we hide the locators from the tests.
 *
 * Abstraction is the methodology of hiding the implementation of internal details and showing the functionality
 * to the users.
 */
public class BookingDetails extends Utility {

    private static final Logger log = LogManager.getLogger(BookingDetails.class.getName());

    @FindBy(xpath = "//div[@class = 'nbf_tpl_pms_calendar_day_available nbf_tpl_pms_calendar_box nbf_pms_tpl_calendar_selecteddate']")
    WebElement bookingDate;// booking date

    @FindBy(xpath = "//div[normalize-space()='18']")
    WebElement verifydate;//verify date

    @FindBy(xpath = "//div[@class = 'nbf_button nbf_tpl_pms_button']")
    WebElement continueBtn;//continue button

    @FindBy(xpath = "//select[@id = 'room-0-numselect']")
    WebElement roomSelect;//room select

    @FindBy(xpath = "//div[@class = 'nbf_fancy_nbf_tpl_pms_book_room nbf_fg_pms_button_text ']")
    WebElement clickOnSelectRoom;//room slection

    @FindBy(xpath = "//div[@id ='extrasButton']")
    WebElement continuewthoutextrasBtn;//continue without extras

    @FindBy(xpath = "//select[@id = 'pax-a-title-1']")
    WebElement titleAdultOne;//title mr

    @FindBy(xpath = "//input[@id = 'pax-a-first-1']")
    WebElement firstNameAdultOne;//name

    @FindBy(xpath = "//input[@id = 'pax-a-last-1']")
    WebElement lastNameAdultOne;//last name

    @FindBy(xpath = "//select[@id = 'pax-a-dobd-1']")
    WebElement dateAdultOne;//day

    @FindBy(xpath = "//select[@id='pax-a-dobm-1']")
    WebElement monthAdultOne;//month

    @FindBy(xpath = "//select[@id='pax-a-doby-1']")
    WebElement yearAdultOne;//year

    @FindBy(xpath = "//select[@id = 'pax-a-title-2']")
    WebElement titleAdultTwo;//title adult 2

    @FindBy(xpath = "//input[@id = 'pax-a-first-2']")
    WebElement firstNameAdultTwo;//firstname adult 2

    @FindBy(xpath = "//input[@id = 'pax-a-last-2']")
    WebElement lastNameAdultTwo;// last name adult2

    @FindBy(xpath = "//select[@id = 'pax-a-dobd-1']")
    WebElement dateAdultTwo;// date adult 2

    @FindBy(xpath = "//select[@id='pax-a-dobm-1']")
    WebElement monthAdultTwo;// month adult 2

    @FindBy(xpath = "//select[@id='pax-a-doby-1']")
    WebElement yearAdultTwo;//year adult 2

    @FindBy(xpath = "//span[text() = '£9,396']")
    WebElement paymentAmount;//verify amount

    public String verifyItIsSelectingFirstAvailableDate(){
        log.info("Verify its booking first available date" + verifydate.toString());
        return getTextFromElement(verifydate);
    }
    public void clickOnContinueBtn(){
        log.info("Clicking on Continue Button" + continueBtn.toString());
        clickOnElement(continueBtn);
    }
    public void selectRoomFromDropDown(String numberone){
        selectByValueFromDropDown(roomSelect,numberone);
        log.info("Selecting room from dropdown" + roomSelect.toString());
    }
    public void clickOnSelectRoomAndContinue(){
        log.info("Selecting room and continue" + clickOnSelectRoom.toString());
        clickOnElement(clickOnSelectRoom);
    }
    public void clickOnContinueWithoutExtrasBtn() throws InterruptedException {
        log.info("Continue to the next stage" + continuewthoutextrasBtn.toString());
        clickOnElement(continuewthoutextrasBtn);
        Thread.sleep(3000);
    }
    public void selectTitleFromDropDownForAdultOne(String title){
        log.info("Selecting title for Adult One" + titleAdultOne.toString());
        selectByValueFromDropDown(titleAdultOne,title);
    }
    public void enterFirstNameLastName(String firstName, String lastName) throws InterruptedException {
        log.info("Entering FirstName" + firstNameAdultOne.toString());
        log.info("Entering lastName" + lastNameAdultOne.toString());
        sendTextToElement(firstNameAdultOne,firstName);
        sendTextToElement(lastNameAdultOne,lastName);
        Thread.sleep(3000);
    }
    public void selectDateMonthYearForAdultOne(String date, String month, String year){
        selectByValueFromDropDown(dateAdultOne,date);
        selectByVisibleTextFromDropDown(monthAdultOne,month);
        selectByVisibleTextFromDropDown(yearAdultOne,year);
    }
    public void selectTitleFromDropDownForAdultTwo(String title){
        log.info("Selecting title for Adult Two" + titleAdultTwo.toString());
        selectByValueFromDropDown(titleAdultTwo,title);
    }
    public void enterFirstNameLastNameForAdultTwo(String firstName, String lastName){
        log.info("Entering FirstName" + firstNameAdultTwo.toString());
        log.info("Entering lastName" + lastNameAdultTwo.toString());
        sendTextToElement(firstNameAdultTwo,firstName);
        sendTextToElement(lastNameAdultTwo,lastName);
    }
    public void selectDateMonthYearForAdultTwo(String date1, String month1, String year1){
        selectByValueFromDropDown(dateAdultTwo,date1);
        selectByVisibleTextFromDropDown(monthAdultTwo,month1);
        selectByVisibleTextFromDropDown(yearAdultTwo,year1);
    }
    public String verifyPaymentAmountAsPerAccomodationSelected(){
        log.info("Verifying Payment Amount" +paymentAmount.toString());
        return getTextFromElement(paymentAmount);
    }
}



