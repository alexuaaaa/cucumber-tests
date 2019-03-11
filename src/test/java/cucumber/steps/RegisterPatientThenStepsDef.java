package cucumber.steps;

import cucumber.api.DataTable;
import cucumber.api.java8.En;
import cucumber.classobjs.PatientDetails;

import java.util.List;
import java.util.Map;

import static cucumber.Asserter.asserterGetButtonDisplayed;
import static cucumber.Asserter.asserterPages;
import static cucumber.Base.*;
import static cucumber.Constants.*;
import static cucumber.pageobjs.PatientPageObjs.GENERAL_ACTION;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.testng.Assert.assertTrue;

public class RegisterPatientThenStepsDef implements En {

    public RegisterPatientThenStepsDef() {

        And("^\"(.*)\" button is sent$", (String registerPatient) -> {
            sendElementActionClickToBrowser(registerPatient);

            asserterPages(REGISTER_PAGE);
        });

        And("^The PatientDetails with \"(.*)\" and \"(.*)\" and \"(.*)\" are set$", (String givenName, String middleName, String familyName, DataTable table) -> {
            List<PatientDetails> patientDetails = table.asList(PatientDetails.class);
            for (PatientDetails detailsPatient : patientDetails) {
                sendElementValueActionToBrowser(givenName, detailsPatient.given);
                sendElementValueActionToBrowser(middleName, detailsPatient.middle);
                sendElementValueActionToBrowser(familyName, detailsPatient.familyName);
            }

            asserterGetButtonDisplayed(givenName);
            asserterGetButtonDisplayed(middleName);
            asserterGetButtonDisplayed(familyName);
            asserterGetButtonDisplayed(GENDER_BUTTON);

            sendElementActionClickToBrowser(GENDER_BUTTON);
        });

        And("^The gender is provided$", (DataTable table) -> {
            List<PatientDetails> patientDetailsList = table.asList(PatientDetails.class);

            for (PatientDetails patientDetails : patientDetailsList) {
                getElementTypeByLocator(patientDetails.path);
            }

            assertTrue(getElementType(getLocator(getCurrentPage(), BIRTHDAY_ID)).isDisplayed());
            sendElementActionClickToBrowser(BIRTHDAY_ID);
        });

        And("^The birthday is set$", (DataTable table) -> {
            List<PatientDetails> patientDetailsList = table.asList(PatientDetails.class);
            for (PatientDetails patientDetails : patientDetailsList) {
                sendElementValueActionToBrowser(DAY_ID, patientDetails.day);
                sendElementValueActionToBrowser(YEAR_ID, patientDetails.year);
            }

            assertTrue(getElementType(getLocator(getCurrentPage(), YEAR_ID)).isDisplayed());

            sendElementActionClickToBrowser(MONTH_ID);
            sendElementActionClickToBrowser(JANUARY_PATH);
            sendElementActionClickToBrowser(ADDRESS_PATH);
        });

        And("^User will send the address \"(.*)\"$", (String address) -> {
            sendElementValueActionToBrowser(ADDRESS_PATIENT_ID, address);
            sendElementActionClickToBrowser(PHONE_PATH);
        });

        And("^User will provide the telephone \"(.*)\"$", (Integer telephone) -> {
            sendElementValueActionToBrowser(PHONE_NUMBER, String.valueOf(telephone));
            sendElementActionClickToBrowser(RELATIVE_PATH);
        });

        And("^User will send the patient related to$", (DataTable table) -> {
            List<PatientDetails> patientDetailsList = table.asList(PatientDetails.class);

            sendElementActionClickToBrowser(PATIENT_TYPE_ID);
            sendElementActionClickToBrowser(PATIENT_DOCTOR);

            patientDetailsList.forEach(name -> {
                sendElementValueActionToBrowser(PERSONAL_NAME_PATH, name.lastName);
                sendElementValueActionToBrowser(PERSONAL_NAME_PATH, name.firstName);
            });
            sendElementActionClickToBrowser(CONFIRM_BUTTON_XPATH);
        });

        And("^User will press confirm$", () -> {
            sendElementActionClickToBrowser(SUBMIT_BUTTON_ID);
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
