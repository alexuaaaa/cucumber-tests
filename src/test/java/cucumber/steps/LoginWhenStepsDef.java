package cucumber.steps;

import cucumber.api.java8.En;

import java.util.HashMap;
import java.util.Map;

import static cucumber.Base.getElementTypeByLocator;
import static cucumber.Base.sendElementValueActionToBrowser;
import static cucumber.Constants.PASSWORD_VALUE;
import static cucumber.Constants.USER_NAME_VALUE;

public class LoginWhenStepsDef implements En {

    public LoginWhenStepsDef() {

        When("^User is send the valid \"(.*)\" and \"(.*)\"$", (String elementUser, String elementPassword) -> {
            final Map<String, String> map = new HashMap<>();

            map.put(elementUser, USER_NAME_VALUE);
            map.put(elementPassword, PASSWORD_VALUE);

            sendElementValueActionToBrowser(map);
        });

        And("^User is send one \"(.*)\"", (String location) -> {
            getElementTypeByLocator(location);
        });

        When("^User is send the \"(.*)\" invalid value \"(.*)\" and \"(.*)\" with invalid \"(.*)\" credentials$", (String elementUser, String username, String elementPassword, String password) -> {
            final Map<String, String> map = new HashMap<>();

            map.put(elementUser, username);
            map.put(elementPassword, password);

            sendElementValueActionToBrowser(map);
        });
    }
}
