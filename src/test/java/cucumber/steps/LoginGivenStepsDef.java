package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.runner.RunnerTest;

import static cucumber.Asserter.asserterPages;
import static cucumber.Constants.LOGIN_PAGE;
import static utils.PropertiesLoader.getURLApplication;

public class LoginGivenStepsDef {

    @Given("^The URL application is accessed with success$")
    public static void theURLApplicationIsAccessedWithSuccess() {
        RunnerTest.driver.get(getURLApplication());
        RunnerTest.driver.manage().window().maximize();

        asserterPages(LOGIN_PAGE);
    }
}
