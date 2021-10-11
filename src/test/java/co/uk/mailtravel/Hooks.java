package co.uk.mailtravel;

import co.uk.mailtravel.basepage.BasePage;
import co.uk.mailtravel.propertyreader.PropertyReader;
import co.uk.mailtravel.utility.Utility;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
//Cucumber hook facilitates us to handle the code workflow better
// and also helps us to reduce code redundancy.
public class Hooks extends BasePage {

    @Before
    public void openBrowser(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Mrunal","Cucumber Report");
    }
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver,scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }

}
