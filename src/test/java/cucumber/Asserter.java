package cucumber;

import org.testng.Assert;

import static cucumber.Base.*;

public class Asserter {

    public static void asserterPages(String pageName) {
        Assert.assertTrue(getCurrentPage().contentEquals(pageName));
    }

    public static void asserterDisplayedHomeButtons() {
        Assert.assertTrue(getElementType(getLocator(getCurrentPage(), "FindPatientRecord")).isDisplayed(), "Button is not present");
        Assert.assertTrue(getElementType(getLocator(getCurrentPage(), "ActiveVisits")).isDisplayed(), "Button is not present");
        Assert.assertTrue(getElementType(getLocator(getCurrentPage(), "AppointmentScheduling")).isDisplayed(), "Button is not present");
        Assert.assertTrue(getElementType(getLocator(getCurrentPage(), "Reports")).isDisplayed(), "Button is not present");
        Assert.assertTrue(getElementType(getLocator(getCurrentPage(), "DataManagement")).isDisplayed(), "Button is not present");
        Assert.assertTrue(getElementType(getLocator(getCurrentPage(), "ConfigureMetadata")).isDisplayed(), "Button is not present");
        Assert.assertTrue(getElementType(getLocator(getCurrentPage(), "SystemAdministration")).isDisplayed(), "Button is not present");
        Assert.assertTrue(getElementType(getLocator(getCurrentPage(), "RegisterPatient")).isDisplayed(), "Button is not present");
    }
}
