package cucumber;

import org.testng.Assert;

import static cucumber.Base.getCurrentPage;
import static cucumber.Base.getElementType;
import static cucumber.Constants.*;

public class Asserter {

    public static void asserterPages(String pageName) {
        Assert.assertTrue(getCurrentPage().contentEquals(pageName));
    }

    public static void asserterDisplayedHomeButtons() {
        Assert.assertTrue(getElementType(FIND_PATIENT_RECORD).isDisplayed(), "Button is not present");
        Assert.assertTrue(getElementType(ACTIVE_VISITS).isDisplayed(), "Button is not present");
        Assert.assertTrue(getElementType(REGISTER_A_PATIENT).isDisplayed(), "Button is not present");
        Assert.assertTrue(getElementType(CAPTURE_VITALS).isDisplayed(), "Button is not present");
        Assert.assertTrue(getElementType(APPOINTMENT_SCHEDULE).isDisplayed(), "Button is not present");
        Assert.assertTrue(getElementType(REPORTS).isDisplayed(), "Button is not present");
        Assert.assertTrue(getElementType(DATA_MANAGEMENT).isDisplayed(), "Button is not present");
        Assert.assertTrue(getElementType(CONFIGURE_METADATA).isDisplayed(), "Button is not present");
        Assert.assertTrue(getElementType(SYSTEM_ADMIN).isDisplayed(), "Button is not present");
    }
}
