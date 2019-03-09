package cucumber.steps;

import cucumber.api.DataTable;
import cucumber.api.java8.En;
import cucumber.classobjs.PatientDetails;

import java.util.List;
import java.util.Map;

import static cucumber.Asserter.asserterPages;
import static cucumber.Base.*;
import static cucumber.Constants.*;
import static cucumber.pageobjs.PatientPageObjs.GENERAL_ACTION;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.testng.Assert.assertTrue;

public class RegisterPatientThenStepsDef implements En {

    public RegisterPatientThenStepsDef() {

        And("^\"(.*)\" button is sent$", (String registerPatient) -> {
            getElementType(getLocator(getCurrentPage(), registerPatient)).click();

            asserterPages(REGISTER_PAGE);
        });

        And("^The PatientDetails with \"(.*)\" and \"(.*)\" and \"(.*)\" are set$", (String givenName, String middleName, String familyName, DataTable table) -> {
            List<PatientDetails> patientDetails = table.asList(PatientDetails.class);

            for (PatientDetails detailsPatient : patientDetails) {
                getElementType(getLocator(getCurrentPage(), givenName)).sendKeys(detailsPatient.given);
                getElementType(getLocator(getCurrentPage(), middleName)).sendKeys(detailsPatient.middle);
                getElementType(getLocator(getCurrentPage(), familyName)).sendKeys(detailsPatient.familyName);
            }

            assertTrue(getElementType(getLocator(getCurrentPage(), givenName)).isDisplayed());
            assertTrue(getElementType(getLocator(getCurrentPage(), middleName)).isDisplayed());
            assertTrue(getElementType(getLocator(getCurrentPage(), familyName)).isDisplayed());
            assertTrue(getElementType(getLocator(getCurrentPage(), GENDER_BUTTON)).isDisplayed());
            getElementType(getLocator(getCurrentPage(), GENDER_BUTTON)).click();
        });

        And("^The gender is provided$", (DataTable table) -> {
            List<PatientDetails> patientDetailsList =  table.asList(PatientDetails.class);

            for (PatientDetails patientDetails : patientDetailsList) {
                getElementType(patientDetails.path).click();
            }

            assertTrue(getElementType(getLocator(getCurrentPage(), BIRTHDAY_ID)).isDisplayed());
            getElementType(getLocator(getCurrentPage(), BIRTHDAY_ID)).click();
        });

        And("^The birthday is set$", (DataTable table) -> {
            List<PatientDetails> patientDetailsList = table.asList(PatientDetails.class);
            for (PatientDetails patientDetails : patientDetailsList) {
                getElementType(getLocator(getCurrentPage(), DAY_ID)).sendKeys(patientDetails.day);
                getElementType(getLocator(getCurrentPage(), YEAR_ID)).sendKeys(patientDetails.year);
            }

            assertTrue(getElementType(getLocator(getCurrentPage(), YEAR_ID)).isDisplayed());

            getElementType(getLocator(getCurrentPage(), MONTH_ID)).click();
            getElementType(getLocator(getCurrentPage(), JANUARY_PATH)).click();
            getElementType(getLocator(getCurrentPage(), ADDRESS_PATH)).click();
        });

        And("^User will send the address \"(.*)\"$", (String address) -> {
            getElementType(getLocator(getCurrentPage(), ADDRESS_PATIENT_ID)).sendKeys(address);
            getElementType(getLocator(getCurrentPage(), PHONE_PATH)).click();
        });

        And("^User will provide the telephone \"(.*)\"$", (Integer telephone) -> {
            getElementType(getLocator(getCurrentPage(), PHONE_NUMBER)).sendKeys(String.valueOf(telephone));
            getElementType(getLocator(getCurrentPage(), RELATIVE_PATH)).click();
        });

        And("^User will send the patient related to$", (DataTable table) -> {
            List<PatientDetails> patientDetailsList = table.asList(PatientDetails.class);
            getElementType(getLocator(getCurrentPage(), PATIENT_TYPE_ID)).click();
            getElementType(getLocator(getCurrentPage(), PATIENT_DOCTOR)).click();

            for (PatientDetails patientDetails : patientDetailsList) {
                getElementType(getLocator(getCurrentPage(), PERSONAL_NAME_PATH)).sendKeys(patientDetails.lastName);
                getElementType(getLocator(getCurrentPage(), PERSONAL_NAME_PATH)).sendKeys(" " + patientDetails.firstName);
            }
            getElementType(getLocator(getCurrentPage(), CONFIRM_BUTTON_XPATH)).click();
        });

        And("^User will press confirm$", () -> {
            getElementType(getLocator(getCurrentPage(), SUBMIT_BUTTON_ID)).click();
        });

        And("^Page With User Information will appear$", () -> {
            waitForElementToLocate(GENERAL_ACTION);

            assertThat(getElementType(getLocator(getCurrentPage(), GENERAL_ACTIONS_XPATH)).isDisplayed());
        });

        And("^The page contains the following data$", (DataTable data) -> {
            List<Map<String, String>> content = data.asMaps(String.class, String.class);

            final String url = getDriver().getPageSource();
            for (Map<String, String> row : content) {
                String locator = getLocator(getCurrentPage(), row.get("Value"));

                assertThat(url.contains(locator)).isTrue();
            }
        });
    }
}
