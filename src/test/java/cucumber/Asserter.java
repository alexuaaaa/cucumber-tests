package cucumber;

import org.openqa.selenium.WebElement;

import static cucumber.Base.*;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class Asserter {

    public static void asserterPages(String pageName) {
        assertThat(getCurrentPage()).isNotEmpty();
        assertThat(pageName).isEqualTo(getCurrentPage());
    }

    public static void asserterDisplayedHomeButtons() {
        assertThat(getElementType(getLocator(getCurrentPage(), "FindPatientRecord")).isDisplayed());
        assertThat(getElementType(getLocator(getCurrentPage(), "ActiveVisits")).isDisplayed());
        assertThat(getElementType(getLocator(getCurrentPage(), "AppointmentScheduling")).isDisplayed());
        assertThat(getElementType(getLocator(getCurrentPage(), "Reports")).isDisplayed());
        assertThat(getElementType(getLocator(getCurrentPage(), "DataManagement")).isDisplayed());
        assertThat(getElementType(getLocator(getCurrentPage(), "ConfigureMetadata")).isDisplayed());
        assertThat(getElementType(getLocator(getCurrentPage(), "SystemAdministration")).isDisplayed());
        assertThat(getElementType(getLocator(getCurrentPage(), "RegisterPatient")).isDisplayed());
    }

    public static void asserterVerifyFields(String field, String value) {
        WebElement element = getElementType(getLocator(getCurrentPage(), value));

        assertThat(element).isNotNull();
        assertThat(element.isDisplayed());
    }


}
