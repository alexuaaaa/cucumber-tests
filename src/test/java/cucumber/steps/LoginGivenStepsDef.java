package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.runner.RunnerTest;

import java.util.concurrent.TimeUnit;

import static cucumber.Asserter.asserterPages;
import static cucumber.Constants.LOGIN_PAGE;

import static cucumber.runner.RunnerTest.getDriver;
import static utils.PropertiesLoader.getURLApplication;

public class LoginGivenStepsDef {

    @Given("^The URL application is accessed with success$")
    public static void theURLApplicationIsAccessedWithSuccess() {
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        getDriver().get(getURLApplication());
        getDriver().manage().window().maximize();

        asserterPages(LOGIN_PAGE);
    }
}
