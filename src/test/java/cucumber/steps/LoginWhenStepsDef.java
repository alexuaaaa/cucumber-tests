package cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.tests.OpenMRSTests;
import org.openqa.selenium.By;

import static cucumber.Constants.*;

public class LoginWhenStepsDef {

    @When("^User is send the valid credentials$")
    public static void userIsSendTheValidCredentials() {
        OpenMRSTests.driver.findElement(By.xpath(USER_NAME)).sendKeys(USER_NAME_VALUE);
        OpenMRSTests.driver.findElement(By.xpath(PASSWORD)).sendKeys(PASSWORD_VALUE);
    }

    @And("^User is send one \"(.*)\"")
    public static void userIsSendOneLocation(String location) {
        OpenMRSTests.driver.findElement(By.xpath("//*[@id=\"" + location + "\"]")).click();
    }

    @When("^User is send the invalid \"(.*)\" and invalid \"(.*)\" credentials$")
    public static void userAndPasswordAreSendWithInvalidValues(String username, String password) {
        OpenMRSTests.driver.findElement(By.xpath(USER_NAME)).sendKeys(username);
        OpenMRSTests.driver.findElement(By.xpath(PASSWORD)).sendKeys(password);
    }
}
