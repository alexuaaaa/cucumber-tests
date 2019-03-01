package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.runner.RunnerTest;

import static cucumber.Asserter.asserterPages;
import static cucumber.Constants.APPLICATION_URL;
import static cucumber.Constants.LOGIN_PAGE;

public class LoginGivenStepsDef {

    @Given("^The URL application is accessed with success$")
    public static void theURLApplicationIsAccessedWithSuccess() {

        RunnerTest.driver.get(APPLICATION_URL);

        asserterPages(LOGIN_PAGE);
    }
}
