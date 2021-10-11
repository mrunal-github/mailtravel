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
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//input[@id = 'searchtext_freetext_search_form']")//searchbox
    WebElement searchBox;
    @FindBy(xpath = "//div[@id='freetext_search_form']/child::form/child::button[@class='nbf_button nbf_tpl_quicksearch_button']")
    WebElement searchButton;//searchbutton
    @FindBy(xpath = "//button[@class = 'optanon-allow-all accept-cookies-button']")
    WebElement cookieBtn;//cookie button because browser was opened new by the webdriver

    public void enterYourDestination(String str) throws InterruptedException {
        sendTextToElement(searchBox,str);
        log.info("Sending text in Search Box" + searchBox.toString());
        Thread.sleep(3000);
    }
    public void clickOnSearchButton(){
        clickOnElement(searchButton);
        log.info("Clicking on Search Button" + searchButton.toString());
    }
    public void clickOnAcceptCookies(){
        clickOnElement(cookieBtn);
        log.info("Clicking on Accept Cookies" + cookieBtn.toString());
    }

}

