package cucumber.classObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PatientDetails {

    public String given;
    public String middle;
    public String familyName;
    public String gender;
    public String day;
    public String year;
    public String path;
    public String personName;

    public void PatientDetails(String given, String middle, String familyName, String gender, String day, String year, String path, String personName) {
        this.given = given;
        this.middle = middle;
        this.familyName = familyName;
        this.gender = gender;
        this.day = day;
        this.year = year;
        this.path = path;
        this.personName = personName;
    }

    public static void waitForElementOrPageDisplay(WebDriver driver, String locator, Integer timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
}
