package cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import static cucumber.Base.getElementType;
import static cucumber.Constants.*;

public class LoginWhenStepsDef {

    @When("^User is send the valid credentials$")
    public static void userIsSendTheValidCredentials() {
        getElementType(USER_NAME).sendKeys(USER_NAME_VALUE);
        getElementType(PASSWORD).sendKeys(PASSWORD_VALUE);
    }

    @And("^User is send one \"(.*)\"")
    public static void userIsSendOneLocation(String location) {
        getElementType("//*[@id=\"" + location + "\"]").click();
    }

    @When("^User is send the invalid \"(.*)\" and invalid \"(.*)\" credentials$")
    public static void userAndPasswordAreSendWithInvalidValues(String username, String password) {
        getElementType(USER_NAME).sendKeys(username);
        getElementType(PASSWORD).sendKeys(password);
    }
}
