package cucumber.hooks;

import cucumber.api.java.Before;

import static cucumber.runner.RunnerTest.getDriver;

public class Hooks {

    @Before
    public void beforeScenario() {
        getDriver().manage().deleteAllCookies();
    }
}
