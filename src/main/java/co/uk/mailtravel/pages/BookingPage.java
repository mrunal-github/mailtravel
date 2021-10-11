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
public class BookingPage extends Utility {

    private static final Logger log = LogManager.getLogger(BookingPage.class.getName());

    @FindBy(xpath = "//button[@id ='iterator_1_product_custom_more-info-button']")//more info button
    WebElement moreInfoButton;

//    @FindBy(xpath = "//div[@id='price-pin_pin-wrapper']")//div[@id = 'price-pin_pin-container']")
//    WebElement daysAndPricesIcon;

    @FindBy(xpath = "//span[@id = 'price-pin_days-num-01']")//verify text
    WebElement nineDays;

    @FindBy(xpath = "//span[text()='£1,193']")//verify price
    WebElement holPrice;


    @FindBy(xpath = "//a[@id = 'supplier-phone']")//verify phone number
    WebElement phoneno;

    @FindBy(xpath ="//button[@name='enterbookingflow']//div[contains(@class,'nbf_fancyimg_pms_add_button nbf_fg_pms_button_text nbf_bg_pms_button nbf_fg_pms_button_text')][normalize-space()='Book Online']")
    WebElement bookOnlineTab;// book online tab

    public void clickOnMoreInfoBtn(){// more info button
        clickOnElement(moreInfoButton);
        log.info("CLicking on more info button" + moreInfoButton.toString());
    }
    public void userShouldSeeDaysPriceTelephoneNumberDisplayed(){
       verifyThatElementIsDisplayed(nineDays);
       verifyThatElementIsDisplayed(holPrice);
       verifyThatElementIsDisplayed(phoneno);
    }


    public void clickOnBookOnlineButton(){
        clickOnElement(bookOnlineTab);
        log.info("Clicking on Book Online Button" + bookOnlineTab.toString());
    }

}
