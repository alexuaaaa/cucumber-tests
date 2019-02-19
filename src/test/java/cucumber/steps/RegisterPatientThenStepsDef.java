package cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.classObjects.PatientDetails;
import cucumber.tests.OpenMRSTests;
import org.openqa.selenium.By;

import java.util.List;

import static cucumber.Constants.*;

public class RegisterPatientThenStepsDef {

    @And("^Register a patient button is sent$")
    public static void registerAPatientButtonIsSent() {
        OpenMRSTests.driver.findElement(By.xpath(REGISTER_A_PATIENT_BUTTON)).click();
    }

    @And("^The name of the patient is provided$")
    public static void theNameOfThePatientIsProvided(List<PatientDetails> patientDetails) {

        for (PatientDetails detailsPatient : patientDetails) {
            OpenMRSTests.driver.findElement(By.xpath(GIVEN_BUTTON)).sendKeys(detailsPatient.getGiven());
            OpenMRSTests.driver.findElement(By.xpath(MIDDLE_BUTTON)).sendKeys(detailsPatient.getMiddle());
            OpenMRSTests.driver.findElement(By.xpath(FAMILY_NAME_BUTTON)).sendKeys(detailsPatient.getFamilyName());
        }

    }
}
