package cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import static cucumber.Base.*;
import static cucumber.Constants.*;

public class LoginWhenStepsDef {

    @When("^User is send the valid \"(.*)\" and \"(.*)\"$")
    public static void userIsSendTheValidCredentials(String elementUser, String elementPassword) {

        getElementType(getLocator(getCurrentPage(), elementUser)).sendKeys(USER_NAME_VALUE);
        getElementType(getLocator(getCurrentPage(), elementPassword)).sendKeys(PASSWORD_VALUE);
    }

    @And("^User is send one \"(.*)\"")
    public static void userIsSendOneLocation(String location) {
        getElementType(location).click();
    }

    @When("^User is send the \"(.*)\" invalid value \"(.*)\" and \"(.*)\" with invalid \"(.*)\" credentials$")
    public static void userAndPasswordAreSendWithInvalidValues(String elementUser, String username, String elementPassword, String password) {

        getElementType(getLocator(getCurrentPage(), elementUser)).sendKeys(username);
        getElementType(getLocator(getCurrentPage(), elementPassword)).sendKeys(password);
    }
}
