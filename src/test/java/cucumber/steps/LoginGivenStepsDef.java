package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.tests.OpenMRSTests;

import static cucumber.Constants.APPLICATION_URL;

public class LoginGivenStepsDef {

    @Given("^The URL application is accessed with success$")
    public static void theURLApplicationIsAccessedWithSuccess() {
        OpenMRSTests.driver.get(APPLICATION_URL);
    }
}
