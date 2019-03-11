package cucumber.steps;

import cucumber.api.java8.En;

import static cucumber.Base.getElementTypeByLocator;
import static cucumber.Base.sendElementValueActionToBrowser;
import static cucumber.Constants.PASSWORD_VALUE;
import static cucumber.Constants.USER_NAME_VALUE;

public class LoginWhenStepsDef implements En {

    public LoginWhenStepsDef() {

        When("^User is send the valid \"(.*)\" and \"(.*)\"$", (String elementUser, String elementPassword) -> {
            sendElementValueActionToBrowser(elementUser, USER_NAME_VALUE);
            sendElementValueActionToBrowser(elementPassword, PASSWORD_VALUE);
        });

        And("^User is send one \"(.*)\"", (String location) -> {
            getElementTypeByLocator(location);
        });

        When("^User is send the \"(.*)\" invalid value \"(.*)\" and \"(.*)\" with invalid \"(.*)\" credentials$", (String elementUser, String username, String elementPassword, String password) -> {
            sendElementValueActionToBrowser(elementUser, username);
            sendElementValueActionToBrowser(elementPassword, password);
        });
    }
}
