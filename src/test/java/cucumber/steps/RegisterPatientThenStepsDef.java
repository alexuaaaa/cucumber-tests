package cucumber.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.classobjs.PatientDetails;
import cucumber.runner.RunnerTests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static cucumber.Asserter.asserterPages;
import static cucumber.Base.*;
import static cucumber.Constants.*;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.testng.Assert.assertTrue;

public class RegisterPatientThenStepsDef {

    private static final String GENERAL_ACTION = "//*[@id=\"content\"]/div[9]/div/div[3]/div/ul/h3";

    @And("^\"(.*)\" button is sent$")
    public static void registerAPatientButtonIsSent(String registerPatient) {
        getElementType(getLocator(getCurrentPage(), registerPatient)).click();

        asserterPages(REGISTER_PAGE);
    }

    @And("^The PatientDetails with \"(.*)\" and \"(.*)\" and \"(.*)\" are set$")
    public static void theNameOfThePatientIsProvidedAndNextSectionIsSet(String givenName, String middleName, String familyName, DataTable table) {
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
    }

    @And("^The gender is provided$")
    public static void theGenderIsProvided(List<PatientDetails> patientDetailsList) {
        for (PatientDetails patientDetails : patientDetailsList) {
            getElementType(patientDetails.path).click();
        }

        assertTrue(getElementType(getLocator(getCurrentPage(), BIRTHDAY_ID)).isDisplayed());

        getElementType(getLocator(getCurrentPage(), BIRTHDAY_ID)).click();
    }

    @And("^The birthday is set$")
    public static void theBirthdayIsSet(DataTable table) {
        List<PatientDetails> patientDetailsList = table.asList(PatientDetails.class);
        for (PatientDetails patientDetails : patientDetailsList) {
            getElementType(getLocator(getCurrentPage(), DAY_ID)).sendKeys(patientDetails.day);
            getElementType(getLocator(getCurrentPage(), YEAR_ID)).sendKeys(patientDetails.year);
        }

        assertTrue(getElementType(getLocator(getCurrentPage(), YEAR_ID)).isDisplayed());

        getElementType(getLocator(getCurrentPage(), MONTH_ID)).click();
        getElementType(getLocator(getCurrentPage(), JANUARY_PATH)).click();
        getElementType(getLocator(getCurrentPage(), ADDRESS_PATH)).click();
    }

    @And("^User will send the address \"(.*)\"$")
    public static void userWillSendTheAddress(String address) {
        getElementType(getLocator(getCurrentPage(), ADDRESS_PATIENT_ID)).sendKeys(address);
        getElementType(getLocator(getCurrentPage(), PHONE_PATH)).click();
    }

    @And("^User will provide the telephone \"(.*)\"$")
    public static void userWillProvideTheTelephone(Integer telephone) {
        getElementType(getLocator(getCurrentPage(), PHONE_NUMBER)).sendKeys(String.valueOf(telephone));
        getElementType(getLocator(getCurrentPage(), RELATIVE_PATH)).click();
    }

    @And("^User will send the patient related to$")
    public static void userWillSendThePatientRelatedTo(DataTable table) {
        List<PatientDetails> patientDetailsList = table.asList(PatientDetails.class);
        getElementType(getLocator(getCurrentPage(), PATIENT_TYPE_ID)).click();
        getElementType(getLocator(getCurrentPage(), PATIENT_DOCTOR)).click();

        for (PatientDetails patientDetails : patientDetailsList) {
            getElementType(getLocator(getCurrentPage(), PERSONAL_NAME_PATH)).sendKeys(patientDetails.lastName);
            getElementType(getLocator(getCurrentPage(), PERSONAL_NAME_PATH)).sendKeys(" " + patientDetails.firstName);
        }

        getElementType(getLocator(getCurrentPage(), CONFIRM_BUTTON_XPATH)).click();
    }

    @And("^User will press confirm$")
    public void userWillPressConfirm() {
        getElementType(getLocator(getCurrentPage(), SUBMIT_BUTTON_ID)).click();
    }

    @And("^Page With User Information will appear$")
    public void pageWithUserInformationWillAppear() {
        waitForElementToLocate(GENERAL_ACTION);

        assertThat(getElementType(getLocator(getCurrentPage(), GENERAL_ACTIONS_XPATH)).isDisplayed());
    }

//    @And("^The page contains the following data:$")
//    public void pageContainsData(DataTable data) {
//        List<Map<String, String>> content = data.asMaps(String.class, String.class);
//
//        for (Map<String, String> row : content) {
//            verifyFieldText(row.get("Field"), row.get("Value"));
//        }
//    }
}
