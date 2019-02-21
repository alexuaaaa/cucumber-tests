package cucumber;

import cucumber.runner.OpenMRSTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Base extends OpenMRSTests {


//    public String getLocator(String className, String elementName) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException {
//        Class<?> cls = Class.forName("com.pb.cucumberdemo.pageobjs." + className + "_Objs");
//        Method findLocator = cls.getMethod("findLocator", String.class);
//
//        String locator = (String) findLocator.invoke(cls.getDeclaredConstructor().newInstance(), elementName);
//
//        return locator;
//    }

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

    public static void verifyFieldText(String field, String value) {
    }

    static String getCurrentPage() {
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

    public static void waitForElementOrPageDisplay(WebDriver driver, String locator, Integer timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
}
