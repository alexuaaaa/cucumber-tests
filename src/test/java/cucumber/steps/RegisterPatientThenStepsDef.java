package cucumber.steps;

import cucumber.api.java.AfterStep;
import cucumber.api.java8.En;
import cucumber.classobjs.PatientDetails;
import io.cucumber.datatable.DataTable;

import java.util.HashMap;
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

    @AfterStep
    public static void after() {
    }

    public RegisterPatientThenStepsDef() {

        And("^\"(.*)\" button is sent$", (String registerPatient) -> {
            sendElementActionClickToBrowser(registerPatient);

            asserterPages(REGISTER_PAGE);
        });

        And("^The PatientDetails with \"(.*)\" and \"(.*)\" and \"(.*)\" are set$", (String givenName, String middleName, String familyName, DataTable table) -> {
            final List<PatientDetails> patientDetails = table.asList(PatientDetails.class);
            final Map<String, String> map = new HashMap<>();

            patientDetails.forEach(detailsPatient -> {
                        map.put(givenName, detailsPatient.given);
                        map.put(middleName, detailsPatient.middle);
                        map.put(familyName, detailsPatient.familyName);
                        sendElementValueActionToBrowser(map);
                    }
            );

            asserterGetButtonDisplayed(givenName);
            asserterGetButtonDisplayed(middleName);
            asserterGetButtonDisplayed(familyName);
            asserterGetButtonDisplayed(GENDER_BUTTON);
            sendElementActionClickToBrowser(GENDER_BUTTON);
        });

        And("^The gender is provided$", (DataTable table) -> {
            final List<PatientDetails> patientDetailsList = table.asList(PatientDetails.class);
            final Map<String, String> map = new HashMap<>();

            patientDetailsList.forEach(patientDetails -> {
                getElementTypeByLocator(patientDetails.path);
            });

            assertTrue(getElementType(getLocator(getCurrentPage(), BIRTHDAY_ID)).isDisplayed());
            sendElementActionClickToBrowser(BIRTHDAY_ID);
        });

        And("^The birthday is set$", (DataTable table) -> {
            final List<PatientDetails> patientDetailsList = table.asList(PatientDetails.class);
            final Map<String, String> map = new HashMap<>();

            patientDetailsList.forEach(patientDetails -> {
                map.put(DAY_ID, patientDetails.day);
                map.put(YEAR_ID, patientDetails.year);
                sendElementValueActionToBrowser(map);
            });

            assertTrue(getElementType(getLocator(getCurrentPage(), YEAR_ID)).isDisplayed());
            sendElementActionClickToBrowser(MONTH_ID, JANUARY_PATH, ADDRESS_PATH);
        });

        And("^User will send the address \"(.*)\"$", (String address) -> {
            final Map<String, String> map = new HashMap<>();
            map.put(ADDRESS_PATIENT_ID, address);

            sendElementValueActionToBrowser(map);
            sendElementActionClickToBrowser(PHONE_PATH);
        });

        And("^User will provide the telephone \"(.*)\"$", (Integer telephone) -> {
            final Map<String, String> map = new HashMap<>();
            map.put(PHONE_NUMBER, String.valueOf(telephone));

            sendElementValueActionToBrowser(map);
            sendElementActionClickToBrowser(RELATIVE_PATH);
        });

        And("^User will send the patient related to$", (DataTable table) -> {
            final Map<String, String> map = new HashMap<>();
            final List<PatientDetails> patientDetailsList = table.asList(PatientDetails.class);

            sendElementActionClickToBrowser(PATIENT_TYPE_ID, PATIENT_DOCTOR);

            patientDetailsList.forEach(name -> {
                map.put(PERSONAL_NAME_PATH, name.lastName);
                map.put(PERSONAL_NAME_PATH, name.firstName);
                sendElementValueActionToBrowser(map);
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
            final List<Map<String, String>> content = data.asMaps(String.class, String.class);

            final String url = getDriver().getPageSource();

            for (Map<String, String> row : content) {
                String locator = getLocator(getCurrentPage(), row.get("Value"));
                assertThat(url.contains(locator)).isTrue();
            }
        });
    }
}
