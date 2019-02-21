package cucumber;

import cucumber.tests.OpenMRSTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Base extends OpenMRSTests {

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

    public String getCurrentPage() {
        String url = driver.getCurrentUrl();
        String page = "";

        if (url.contains("my-account"))
            page = "User";
        else if (url.contains("controller=contact"))
            page = "Contact";
        else
            page = "Home";

        return page;
    }

}
