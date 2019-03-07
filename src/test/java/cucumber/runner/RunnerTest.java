package cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.URL;

import static utils.PropertiesLoader.getSeleniumGridNodeOneURL;
import static utils.PropertiesLoader.getSeleniumGridNodeTwoURL;

@CucumberOptions(
        features = "src/test/resources/features",/*location of the features provided*/
        glue = {"cucumber.steps"},/*means the package where step definitions are set*/
        tags = {"@Login_Test3"},/*tags means that specific feature is tested, or scenario*/
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

    private static ThreadLocal<RemoteWebDriver> dr = new ThreadLocal<>();

    private TestNGCucumberRunner testRunner;

    @Parameters({"browserType", "platform"})
    @BeforeClass
    public void setUP(String browserType, String platform) throws Exception {
        getSeleniumGridCapabilities(browserType, platform);


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

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        testRunner.finish();
        sleep();
        getDriver().quit();
    }

    private static void getSeleniumGridCapabilities(String browserType, String platform) throws Exception {
        RemoteWebDriver driver = null;
        DesiredCapabilities capability = null;

        if (browserType.equals("chrome")) {
            capability = DesiredCapabilities.chrome();
            capability.setBrowserName("chrome");
            capability.setPlatform(Platform.extractFromSysProperty(platform));

            driver = new RemoteWebDriver(new URL(getSeleniumGridNodeOneURL() + "/wd/hub"), capability);

        } else if (browserType.equals("firefox")) {
            capability = DesiredCapabilities.firefox();
            capability.setBrowserName("firefox");

            driver = new RemoteWebDriver(new URL(getSeleniumGridNodeTwoURL() + "/wd/hub"), capability);
        }

        if (platform.equals("WINDOWS")) {
            capability.setPlatform(org.openqa.selenium.Platform.WINDOWS);
        } else if (platform.equals("XP")) {
            capability.setPlatform(org.openqa.selenium.Platform.XP);
        } else if (platform.equals("Linux")) {
            capability.setPlatform(org.openqa.selenium.Platform.LINUX);
        } else {
            capability.setPlatform(org.openqa.selenium.Platform.ANY);
        }

        setWebDriver(driver);
    }

    private static void setWebDriver(RemoteWebDriver driver) {
        dr.set(driver);
    }

    public static WebDriver getDriver() {
        return dr.get();
    }

    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
