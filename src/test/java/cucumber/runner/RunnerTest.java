package cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.URL;

import static utils.PropertiesLoader.getSeleniumGridNodeURL;

@CucumberOptions(
        features = "src/test/resources/features",/*location of the features provided*/
        glue = {"cucumber.steps"},/*means the package where step definitions are set*/
        // tags = {"@RegisterPatient"},/*tags means that specific feature is tested, or scenario*/
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

    @Parameters({"browserType", "version", "platform"})
    @BeforeClass
    public void setUP(String browserType, String version, String platform) throws Exception {
        DesiredCapabilities capability;

        capability = gridSet(browserType, version, platform);

        driver = new RemoteWebDriver(new URL(getSeleniumGridNodeURL()), capability);

        testRunner = new TestNGCucumberRunner(RunnerTest.class);
    }

    @Test(dataProvider = "features")
    public void runFeatures(CucumberFeatureWrapper cFeature) {
        sleep();
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

    public DesiredCapabilities gridSet(String browser, String version, String os) {
        DesiredCapabilities capability = null;
        if (browser.equals("firefox")) {
            capability = DesiredCapabilities.firefox();
            capability.setBrowserName("firefox");
            capability.setVersion(version);
        }

        if (browser.equals("chrome")) {
            System.out.println("Test scripts running on chrome");
            capability = DesiredCapabilities.chrome();
            capability.setBrowserName("chrome");
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            capability.setVersion(version);
        }
        if (os.equals("WINDOWS")) {
            capability.setPlatform(org.openqa.selenium.Platform.WINDOWS);
        } else if (os.equals("XP")) {
            capability.setPlatform(org.openqa.selenium.Platform.XP);
        } else if (os.equals("Linux")) {
            capability.setPlatform(org.openqa.selenium.Platform.LINUX);
        } else {
            capability.setPlatform(org.openqa.selenium.Platform.ANY);
        }
        return capability;
    }

    public static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
