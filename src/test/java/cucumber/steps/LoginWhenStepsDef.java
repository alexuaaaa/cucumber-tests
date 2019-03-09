package cucumber.steps;

import cucumber.api.java8.En;

import static cucumber.Base.*;
import static cucumber.Constants.PASSWORD_VALUE;
import static cucumber.Constants.USER_NAME_VALUE;

public class LoginWhenStepsDef implements En {

    public LoginWhenStepsDef() {

        When("^User is send the valid \"(.*)\" and \"(.*)\"$", (String elementUser, String elementPassword) -> {
            getElementType(getLocator(getCurrentPage(), elementUser)).sendKeys(USER_NAME_VALUE);
            getElementType(getLocator(getCurrentPage(), elementPassword)).sendKeys(PASSWORD_VALUE);
        });

        And("^User is send one \"(.*)\"", (String location) -> {
            getElementType(location).click();
        });

        When("^User is send the \"(.*)\" invalid value \"(.*)\" and \"(.*)\" with invalid \"(.*)\" credentials$", (String elementUser, String username, String elementPassword, String password) -> {
            getElementType(getLocator(getCurrentPage(), elementUser)).sendKeys(username);
            getElementType(getLocator(getCurrentPage(), elementPassword)).sendKeys(password);
        });
    }
}
