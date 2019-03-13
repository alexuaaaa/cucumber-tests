package cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.URL;

@CucumberOptions(
        features = "src/test/resources/features",/*location of the features provided*/
        glue = {"cucumber.steps", "cucumber.config"},/*means the package where step definitions are set*/
        tags = {"@RegisterPatient_Test1"},/*tags means that specific feature is tested, or scenario*/
        /*dryRun = true to check if mapping is valid between feature file and step definition*/
        monochrome = true,/*true displays the output in a readable format*/
        plugin = {"html:target/site/cucumber-pretty","json:target/cucumber.json"}
)

public class RunnerTest {

    private static ThreadLocal<RemoteWebDriver> dr = new ThreadLocal<>();

    private TestNGCucumberRunner testNGCucumberRunner;

    @Parameters({"browserType", "platform", "node"})
    @BeforeClass(alwaysRun = true)
    public void setUP(String browserType, String platform, String node) throws Exception {
        getSeleniumGridCapabilities(browserType, platform, node);

        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(dataProvider = "scenarios")
    public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {
        testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());
    }

    @DataProvider
    public Object[][] scenarios() {
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        testNGCucumberRunner.finish();
        sleep();
        getDriver().quit();
    }

    private static void getSeleniumGridCapabilities(String browserType, String platform, String node) throws Exception {
        RemoteWebDriver driver = null;
        DesiredCapabilities capability = null;

        if (browserType.equals("chrome")) {
            capability = DesiredCapabilities.chrome();
            capability.setBrowserName("chrome");
            capability.setPlatform(Platform.extractFromSysProperty(platform));

            driver = new RemoteWebDriver(new URL(node + "/wd/hub"), capability);

        } else if (browserType.equals("firefox")) {
            capability = DesiredCapabilities.firefox();
            capability.setBrowserName("firefox");

            driver = new RemoteWebDriver(new URL(node + "/wd/hub"), capability);
        }

        if (platform.equals("windows")) {
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

    public static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
