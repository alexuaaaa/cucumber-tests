package cucumber.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.classObjects.PatientDetails;
import cucumber.tests.OpenMRSTests;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

import static cucumber.Base.getElementType;
import static cucumber.Base.verifyFieldText;
import static cucumber.Constants.*;
import static cucumber.classObjects.PatientDetails.waitForElementOrPageDisplay;

public class RegisterPatientThenStepsDef {

    @And("^Register a patient button is sent$")
    public static void registerAPatientButtonIsSent() {
        getElementType(REGISTER_A_PATIENT_BUTTON).click();
    }

    @And("^The PatientDetails are set$")
    public static void theNameOfThePatientIsProvidedAndNextSectionIsSet(DataTable table) {
        List<PatientDetails> patientDetails = table.asList(PatientDetails.class);

        for (PatientDetails detailsPatient : patientDetails) {
            getElementType(GIVEN_BUTTON).sendKeys(detailsPatient.given);
            getElementType(MIDDLE_BUTTON).sendKeys(detailsPatient.middle);
            getElementType(FAMILY_NAME_BUTTON).sendKeys(detailsPatient.familyName);
        }

        Assert.assertTrue(getElementType(GIVEN_BUTTON).isDisplayed());
        Assert.assertTrue(getElementType(MIDDLE_BUTTON).isDisplayed());
        Assert.assertTrue(getElementType((FAMILY_NAME_BUTTON)).isDisplayed());
        Assert.assertTrue(getElementType((GENDER_BUTTON)).isDisplayed());

        getElementType(GENDER_BUTTON).click();
    }

    @And("^The gender is provided$")
    public static void theGenderIsProvided(List<PatientDetails> patientDetailsList) {
        for (PatientDetails patientDetails : patientDetailsList) {
            getElementType(patientDetails.path).click();
        }

        Assert.assertTrue(getElementType((BIRTHDAY_ID)).isDisplayed());

        getElementType((BIRTHDAY_ID)).click();
    }

    @And("^The birthday is set$")
    public static void theBirthdayIsSet(DataTable table) {
        List<PatientDetails> patientDetailsList = table.asList(PatientDetails.class);

        for (PatientDetails patientDetails : patientDetailsList) {
            getElementType(DAY_ID).sendKeys(patientDetails.day);
            getElementType(YEAR_ID).sendKeys(patientDetails.year);
        }

        Assert.assertTrue(getElementType(MONTH_ID).isDisplayed());

        getElementType(MONTH_ID).click();
        getElementType(JANUARY_PATH).click();
        getElementType(ADDRESS_PATH).click();
    }

    @And("^User will send the address \"(.*)\"$")
    public static void userWillSendTheAddress(String address) {
        getElementType((ADDRESS_PATIENT_ID)).sendKeys(address);
        getElementType(PHONE_PATH).click();
    }

    @And("^User will provide the telephone \"(.*)\"$")
    public static void userWillProvideTheTelephone(Integer telephone) {
        getElementType(PHONE_NUMBER).sendKeys(String.valueOf(telephone));
        getElementType(RELATIVE_PATH).click();
    }

    @And("^User will send the patient related to$")
    public static void userWillSendThePatientRelatedTo(DataTable table) {
        List<PatientDetails> patientDetailsList = table.asList(PatientDetails.class);

        getElementType(PATIENT_TYPE_ID).click();
        getElementType(PATIENT_DOCTOR).click();

        for (PatientDetails patientDetails : patientDetailsList) {
            getElementType(PERSONAL_NAME_PATH).sendKeys(patientDetails.lastName);
            getElementType(PERSONAL_NAME_PATH).sendKeys(" " + patientDetails.firstName);
        }
        getElementType(CONFIRM_BUTTON_XPATH).click();
    }

    @And("^User will press confirm$")
    public void userWillPressConfirm() {
        getElementType(SUBMIT_BUTTON_ID).click();
    }

    @And("^Page With User Information will appear$")
    public void pageWithUserInformationWillAppear() {
        waitForElementOrPageDisplay(OpenMRSTests.driver, GENERAL_ACTIONS_XPATH, 5);
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
