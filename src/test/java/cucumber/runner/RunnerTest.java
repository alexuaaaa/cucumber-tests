package cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import utils.PropertiesLoader;

import java.net.MalformedURLException;
import java.net.URL;

@CucumberOptions(
        features = "src/test/resources/features",/*location of the features provided*/
        glue = {"cucumber.steps"},/*means the package where step definitions are set*/
        tags = {"@RegisterPatient"},/*tags means that specific feature is tested, or scenario*/
        /*dryRun = true to check if mapping is valid between feature file and step definition*/
        /*monochrome = true displays the output in a readable format*/
        format = // generate format report
                {"pretty",// in the console to generate steps in a readable format
                        "html:target/cucumber-reports/cucumber-pretty",
                        "json:target/cucumber-reports/CucumberTestReport.json",
                        "rerun:target/cucumber-reports/re-run.txt",
                        "junit:target/cucumber-reports/Cucumber.xml"}
)
public class RunnerTest {

    public static RemoteWebDriver driver;

    private TestNGCucumberRunner testRunner;

    @Parameters({"browserType"})
    @BeforeClass
    public void setUP(String browserType) throws MalformedURLException {

        DesiredCapabilities dr;

        if (browserType.equals("firefox")) {
            dr = DesiredCapabilities.firefox();
        } else if (browserType.equals("chrome")) {
            dr = DesiredCapabilities.chrome();
        } else {
            dr = DesiredCapabilities.internetExplorer();
        }

        driver = new RemoteWebDriver(new URL("http://localhost:5556/wd/hub"), dr);
        driver.manage().window().maximize();

        testRunner = new TestNGCucumberRunner(RunnerTest.class);
    }

    @Test(dataProvider = "features")
    public void runFeatures(CucumberFeatureWrapper cFeature) {
        testRunner.runCucumber(cFeature.getCucumberFeature());
    }

    @DataProvider(name = "features")
    public Object[][] getFeatures() {
        return testRunner.provideFeatures();
    }

    @AfterClass
    public void tearDown() {
        testRunner.finish();
        sleep();
        driver.quit();
    }

    private static void sleep() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
