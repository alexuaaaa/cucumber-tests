package cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import static cucumber.Asserter.asserterDisplayedHomeButtons;
import static cucumber.Asserter.asserterPages;
import static cucumber.Base.*;
import static cucumber.Constants.*;

public class LoginThenStepsDef {

    @Then("^\"(.*)\" button is pressed$")
    public static void userIsLoggedInWithSuccess(String logIn) {

        getElementType(getLocator(getCurrentPage(), logIn)).click();

        asserterPages(HOME_PAGE);
        asserterDisplayedHomeButtons();
    }

    @And("^\"(.*)\" button is pressed without verifying home page$")
    public static void logButtonIsPressedWithoutVerifyingHomePage(String logIn) {

        getElementType(getLocator(getCurrentPage(), logIn)).click();

        asserterPages(LOGIN_PAGE);
    }

    @And("^\"(.*)\" with logged In appears having \"(.*)\"$")
    public static void messageWithLoggedInAppears(String message, String locationOutput) {

        String expectedMessage = getElementType(getLocator(getCurrentPage(), message)).getText();

        Assert.assertTrue(expectedMessage.contains("Logged in as Super User () at " + locationOutput + "."), "The message from loggedIn is not equal");
    }

    @And("^Logout button will be clicked$")
    public static void logoutButtonWillBeClicked() {
        getElementType(LOGOUT_BUTTON).click();
    }

    @Then("^\"(.*)\" with invalid user/pass is returned$")
    public static void messageWithInvalidCredentialsIsReturned(String errorMessageLogin) {

        String expectedMessage = getElementType(getLocator(getCurrentPage(), errorMessageLogin)).getText();

        Assert.assertEquals(INVALID_MESSAGE_CREDENTIALS, expectedMessage, "Message is not equal in invalid is logged");
    }
}
