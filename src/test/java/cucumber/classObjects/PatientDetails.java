package cucumber.classObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PatientDetails {

    private String given;
    private String middle;
    private String familyName;
    private String gender;
    private String day;
    private String year;
    private String path;
    private String personName;

    public String getPersonName() {
        return personName;
    }

    public String getDay() {
        return day;
    }

    public String getYear() {
        return year;
    }

    public String getPath() {
        return path;
    }

    public String getGiven() {
        return given;
    }

    public String getMiddle() {
        return middle;
    }

    public String getFamilyName() {
        return familyName;
    }

    public static void waitForElementOrPageDisplay(WebDriver driver, String locator, Integer timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
}
