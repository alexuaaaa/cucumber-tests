package cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.tests.OpenMRSTests;
import org.openqa.selenium.By;
import org.testng.Assert;

import static cucumber.Constants.*;

public class LoginThenStepsDef {

    @Then("^Login button is pressed$")
    public static void userIsLoggedInWithSuccess() {
        OpenMRSTests.driver.findElement(By.xpath(LOGIN_BUTTON)).click();

    }

    @And("^Message with logged In appears having \"(.*)\"$")
    public static void messageWithLoggedInAppears(String locationOutput) {
        String expectedMessage = OpenMRSTests.driver.findElement(By.xpath(LOGGED_IN_WARD_LOCATION)).getText();

        Assert.assertEquals("Logged in as Super User () at " + locationOutput + ".", expectedMessage, "The message from loggedIn is not equal");
    }

    @And("^Logout button will be clicked$")
    public static void logoutButtonWillBeClicked() {
        OpenMRSTests.driver.findElement(By.xpath(LOGOUT_BUTTON)).click();
    }

    @Then("^Invalid message with invalid user/pass is returned$")
    public static void messageWithInvalidCredentialsIsReturned() {
        String expectedMessage = OpenMRSTests.driver.findElement(By.xpath(INVALID_MESSAGE_CREDENTIALS_PATH)).getText();

        Assert.assertEquals(INVALID_MESSAGE_CREDENTIALS, expectedMessage, "Message is not equal in invalid is logged");
    }
}