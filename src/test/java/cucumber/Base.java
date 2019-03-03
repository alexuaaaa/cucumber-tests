package cucumber;

import cucumber.runner.RunnerTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Method;

public class Base extends RunnerTest {

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
        else if (locator.contains("#"))
            element = driver.findElement(By.cssSelector(locator));
        else
            element = driver.findElement(By.className(locator));
        return element;
    }

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

    public static void waitForElementToLocate(String element) {
        int timeout = 1000;
        By by = null;

        WebDriverWait wait = new WebDriverWait(driver, timeout);

        if (element.contains("id=\"" + "\"")) {
            by = By.id(element);
        } else if (element.contains("name=\"" + "\"")) {
            by = By.name(element);
        } else if (element.contains("@")) {
            by = By.xpath(element);
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
