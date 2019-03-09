package cucumber.steps;

import cucumber.api.java8.En;

import static cucumber.Asserter.asserterDisplayedHomeButtons;
import static cucumber.Asserter.asserterPages;
import static cucumber.Base.*;
import static cucumber.Constants.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginThenStepsDef implements En {

    public LoginThenStepsDef() {

        Then("^\"(.*)\" button is pressed$", (String logIn) -> {
            getElementType(getLocator(getCurrentPage(), logIn)).click();

            asserterPages(HOME_PAGE);
            asserterDisplayedHomeButtons();
        });

        And("^\"(.*)\" button is pressed without verifying home page$", (String logIn) -> {
            getElementType(getLocator(getCurrentPage(), logIn)).click();

            asserterPages(LOGIN_PAGE);
        });

        And("^\"(.*)\" with logged In appears having \"(.*)\"$", (String message, String locationOutput) -> {
            String expectedMessage = getElementType(getLocator(getCurrentPage(), message)).getText();

            assertTrue(expectedMessage.contains("Logged in as Super User () at " + locationOutput + "."), "The message from loggedIn is not equal");
        });

        And("^Logout button will be clicked$", () -> {
            getElementType(LOGOUT_BUTTON).click();
        });

        Then("^\"(.*)\" with invalid user/pass is returned$", (String errorMessageLogin) -> {
            String expectedMessage = getElementType(getLocator(getCurrentPage(), errorMessageLogin)).getText();

            assertEquals(INVALID_MESSAGE_CREDENTIALS, expectedMessage, "Message is not equal in invalid is logged");
        });
    }
}
