package cucumber;

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
        assertThat(getElementType(getLocator(getCurrentPage(), "Reports")).isDisplayed());
        assertThat(getElementType(getLocator(getCurrentPage(), "DataManagement")).isDisplayed());
        assertThat(getElementType(getLocator(getCurrentPage(), "SystemAdministration")).isDisplayed());
        assertThat(getElementType(getLocator(getCurrentPage(), "RegisterPatient")).isDisplayed());
    }

    public static void asserterVerifyFields(String... value) {
        for (String i : value) {
            assertThat(getPageSource().contains(getLocator(getCurrentPage(), i))).isTrue();
        }
    }

    public static void asserterGetButtonDisplayed(String... element) {
        for (String i : element) {
            assertThat(getElementType(getLocator(getCurrentPage(), i)).isDisplayed()).isTrue().withFailMessage("button appear");
        }
    }
}
