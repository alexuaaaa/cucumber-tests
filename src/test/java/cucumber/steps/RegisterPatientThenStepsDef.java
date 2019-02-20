package cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.classObjects.PatientDetails;
import cucumber.tests.OpenMRSTests;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

import static cucumber.Constants.*;
import static cucumber.classObjects.PatientDetails.waitForElementOrPageDisplay;

public class RegisterPatientThenStepsDef {

    @And("^Register a patient button is sent$")
    public static void registerAPatientButtonIsSent() {
        OpenMRSTests.driver.findElement(By.xpath(REGISTER_A_PATIENT_BUTTON)).click();
    }

    @And("^The PatientDetails are set$")
    public static void theNameOfThePatientIsProvidedAndNextSectionIsSet(List<PatientDetails> patientDetails) {
        for (PatientDetails detailsPatient : patientDetails) {
            OpenMRSTests.driver.findElement(By.name(GIVEN_BUTTON)).sendKeys(detailsPatient.getGiven());
            OpenMRSTests.driver.findElement(By.name(MIDDLE_BUTTON)).sendKeys(detailsPatient.getMiddle());
            OpenMRSTests.driver.findElement(By.name(FAMILY_NAME_BUTTON)).sendKeys(detailsPatient.getFamilyName());
        }

        Assert.assertTrue(OpenMRSTests.driver.findElement(By.name(GIVEN_BUTTON)).isDisplayed());
        Assert.assertTrue(OpenMRSTests.driver.findElement(By.name(MIDDLE_BUTTON)).isDisplayed());
        Assert.assertTrue(OpenMRSTests.driver.findElement(By.name(FAMILY_NAME_BUTTON)).isDisplayed());
        Assert.assertTrue(OpenMRSTests.driver.findElement(By.xpath(GENDER_BUTTON)).isDisplayed());

        OpenMRSTests.driver.findElement(By.xpath(GENDER_BUTTON)).click();
    }

    @And("^The gender is provided$")
    public static void theGenderIsProvided(List<PatientDetails> patientDetailsList) {
        for(PatientDetails patientDetails : patientDetailsList) {
            OpenMRSTests.driver.findElement(By.xpath(patientDetails.getPath())).click();
        }

        Assert.assertTrue(OpenMRSTests.driver.findElement(By.id(BIRTHDAY_ID)).isDisplayed());

        OpenMRSTests.driver.findElement(By.id(BIRTHDAY_ID)).click();
    }

    @And("^The birthday is set$")
    public static void theBirthdayIsSet(List<PatientDetails> patientDetailsList) {
        for(PatientDetails patientDetails : patientDetailsList) {
            OpenMRSTests.driver.findElement(By.id(DAY_ID)).sendKeys(patientDetails.getDay());
            OpenMRSTests.driver.findElement(By.id(YEAR_ID)).sendKeys(patientDetails.getYear());
        }

        Assert.assertTrue(OpenMRSTests.driver.findElement(By.id(MONTH_ID)).isDisplayed());

        OpenMRSTests.driver.findElement(By.id(MONTH_ID)).click();
        OpenMRSTests.driver.findElement(By.xpath(JANUARY_PATH)).click();
        OpenMRSTests.driver.findElement(By.xpath(ADDRESS_PATH)).click();
    }

    @And("^User will send the address \"(.*)\"$")
    public static void userWillSendTheAddress(String address) {
        OpenMRSTests.driver.findElement(By.id(ADDRESS_PATIENT_ID)).sendKeys(address);
        OpenMRSTests.driver.findElement(By.xpath(PHONE_PATH)).click();
    }

    @And("^User will provide the telephone \"(.*)\"$")
    public static void userWillProvideTheTelephone(Integer telephone) {
        OpenMRSTests.driver.findElement(By.name(PHONE_NUMBER)).sendKeys(String.valueOf(telephone));
        OpenMRSTests.driver.findElement(By.xpath(RELATIVE_PATH)).click();
    }

    @And("^User will send the patient related to$")
    public static void userWillSendThePatientRelatedTo(List<PatientDetails> patientDetailsList) {
        OpenMRSTests.driver.findElement(By.id(PATIENT_TYPE_ID)).click();
        OpenMRSTests.driver.findElement(By.xpath(PATIENT_DOCTOR)).click();

        for(PatientDetails patientDetails : patientDetailsList) {
            OpenMRSTests.driver.findElement(By.xpath(PERSONAL_NAME_PATH)).sendKeys(patientDetails.getPersonName());
        }
        OpenMRSTests.driver.findElement(By.xpath(CONFIRM_BUTTON_XPATH)).click();
    }

    @And("^User will press confirm$")
    public void userWillPressConfirm() {
        OpenMRSTests.driver.findElement(By.id(SUBMIT_BUTTON_ID)).click();
    }

    @And("^Page With User Information will appear$")
    public void pageWithUserInformationWillAppear() {
        waitForElementOrPageDisplay(OpenMRSTests.driver, GENERAL_ACTIONS_XPATH, 5);
    }
}
