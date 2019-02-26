package cucumber;

import cucumber.runner.RunnerTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Method;

import static cucumber.Constants.GENERAL_ACTIONS_XPATH;

public class Base extends RunnerTests {

    public static String getLocator(String className, String elementName) {
        Class<?> cls = null;
        String locator = "";

        try {
            cls = Class.forName("cucumber.pageobjs." + className + "Objs");
            Method findLocator = cls.getMethod("findLocator", String.class);
            locator = (String) findLocator.invoke(cls.getDeclaredConstructor().newInstance(), elementName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return locator;
    }

    public static WebElement getElementType(String locator) {
        WebElement element;

        String pageSource = driver.getPageSource();

        if (pageSource.contains("id=\"" + locator + "\""))
            element = driver.findElement(By.id(locator));
        else if (pageSource.contains("name=\"" + locator + "\""))
            element = driver.findElement(By.name(locator));
        else if (pageSource.contains("html"))
            element = driver.findElement(By.xpath(locator));
        else if (locator.contains("@"))
            element = driver.findElement(By.xpath(locator));
        else
            element = driver.findElement(By.cssSelector(locator));

        return element;
    }

//    public static WebElement getElement(String string) {
//        By by = null;
//        String locator = getLocator(getCurrentPage(), GENERAL_ACTIONS_XPATH);
//
//        switch (string) {
//            case "class":
//                by = By.className(locator);
//                break;
//            case "id":
//                by = By.id(locator);
//                break;
//        }
//
//        return driver.findElement(by);
//    }


    public static String getCurrentPage() {
        String url = driver.getCurrentUrl();
        String page = "";

        if (url.contains("login.htm")) {
            page = "Login";
        } else if (url.contains("home.page")) {
            page = "HomePage";
        } else if (url.contains(("registerPatient"))) {
            page = "RegisterPatient";
        } else if (url.contains("patient.page")) {
            page = "PatientPage";
        } else if (url.contains("login.page")) {
            page = "Login";
        } else {
            page = "Not found";
        }

        return page;
    }


    public static void waitForElementToLocate(By locator) {
        WebElement element = getElementType(getLocator(getCurrentPage(), GENERAL_ACTIONS_XPATH));
        int timeout = 5;

        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void verifyFieldText(String field, String value) {
    }
}
