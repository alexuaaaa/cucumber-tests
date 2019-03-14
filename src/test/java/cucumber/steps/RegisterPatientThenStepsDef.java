package cucumber.steps;

import cucumber.api.java.AfterStep;
import cucumber.api.java8.En;
import cucumber.classobjs.PatientDetails;
import cucumber.classobjs.PatientGender;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import static cucumber.Asserter.*;
import static cucumber.Base.*;
import static cucumber.Constants.*;
import static cucumber.pageobjs.PatientPageObjs.GENERAL_ACTION;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.testng.Assert.assertTrue;

public class RegisterPatientThenStepsDef implements En {

    private ConcurrentHashMap<String, String> mapFromDataTables;
    public static final String GENERAL_ACTIONS = "General_Action";

    @AfterStep("@RegisterPatient_Test1")
    public void after() {
        mapFromDataTables = new ConcurrentHashMap<>();
    }

    public RegisterPatientThenStepsDef() {

        And("^\"(.*)\" button is sent$", (String registerPatient) -> {
            sendElementActionClickToBrowser(registerPatient);

            asserterPages(REGISTER_PAGE);
        });

        And("^The PatientDetails with \"(.*)\" and \"(.*)\" and \"(.*)\" are set$", (String givenName, String middleName, String familyName, DataTable table) -> {
            CopyOnWriteArrayList<PatientDetails> list1 = new CopyOnWriteArrayList<>();
            final List<PatientDetails> patientDetails = table.asList(PatientDetails.class);
            list1.addAllAbsent(patientDetails);

            list1.forEach(detailsPatient -> {
                        mapFromDataTables.put(givenName, detailsPatient.given);
                        mapFromDataTables.put(middleName, detailsPatient.middle);
                        mapFromDataTables.put(familyName, detailsPatient.familyName);
                        sendElementValueActionToBrowser(mapFromDataTables);
                    }
            );

            asserterGetButtonDisplayed(givenName, middleName, familyName, GENDER_BUTTON);
            sendElementActionClickToBrowser(GENDER_BUTTON);
        });

        And("^The gender is provided$", (DataTable table) -> {
            CopyOnWriteArrayList<PatientGender> list1 = new CopyOnWriteArrayList<>();
            final List<PatientGender> patientDetails = table.asList(PatientGender.class);
            list1.addAllAbsent(patientDetails);

            list1.forEach(patientGender -> {
                getElementTypeByLocator(patientGender.path);
            });

            assertTrue(getElementType(getLocator(getCurrentPage(), BIRTHDAY_ID)).isDisplayed());
            sendElementActionClickToBrowser(BIRTHDAY_ID);
        });

        And("^The birthday is set$", (DataTable table) -> {
            CopyOnWriteArrayList<PatientDetails> list1 = new CopyOnWriteArrayList<>();
            final List<PatientDetails> patientDetails = table.asList(PatientDetails.class);
            list1.addAllAbsent(patientDetails);

            list1.forEach(patient -> {
                mapFromDataTables.put(DAY_ID, patient.day);
                mapFromDataTables.put(YEAR_ID, patient.year);
                sendElementValueActionToBrowser(mapFromDataTables);
            });

            assertTrue(getElementType(getLocator(getCurrentPage(), YEAR_ID)).isDisplayed());
            sendElementActionClickToBrowser(MONTH_ID, JANUARY_PATH, ADDRESS_PATH);
        });

        And("^User will send the address \"(.*)\"$", (String address) -> {
            mapFromDataTables.put(ADDRESS_PATIENT_ID, address);

            sendElementValueActionToBrowser(mapFromDataTables);
            sendElementActionClickToBrowser(PHONE_PATH);
        });

        And("^User will provide the telephone \"(.*)\"$", (String telephone) -> {
            mapFromDataTables.put(PHONE_NUMBER, telephone);

            sendElementValueActionToBrowser(mapFromDataTables);
            sendElementActionClickToBrowser(RELATIVE_PATH);
        });

        And("^User will send the patient related to$", (DataTable table) -> {
            CopyOnWriteArrayList<PatientDetails> list1 = new CopyOnWriteArrayList<>();
            final List<PatientDetails> patientDetails = table.asList(PatientDetails.class);
            list1.addAllAbsent(patientDetails);

            sendElementActionClickToBrowser(PATIENT_TYPE_ID, PATIENT_DOCTOR);

            list1.forEach(name -> {
                mapFromDataTables.put(PERSONAL_NAME_PATH, name.lastName);
                mapFromDataTables.put(PERSONAL_NAME_PATH, name.firstName);
                sendElementValueActionToBrowser(mapFromDataTables);
            });
            sendElementActionClickToBrowser(CONFIRM_BUTTON_XPATH);
        });

        And("^User will press confirm$", () -> {
            sendElementActionClickToBrowser(SUBMIT_BUTTON_ID);
        });

        And("^Page With User Information will appear$", () -> {
            waitForElementToLocate(GENERAL_ACTION);

            assertThat(getElementType(getLocator(getCurrentPage(), GENERAL_ACTIONS_INFO)).isDisplayed());
            asserterVerifyFields(GENERAL_ACTIONS_INFO, GENERAL_ACTIONS);
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
