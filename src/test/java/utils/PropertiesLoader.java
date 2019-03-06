package utils;

import org.apache.commons.exec.environment.EnvironmentUtils;

import java.util.Properties;

public class PropertiesLoader {

    private static Properties props;

    static {
        try {
            String filePath = "environments/application.properties";
            props = new Properties();
            props.load(EnvironmentUtils.class.getClassLoader().getResourceAsStream(filePath));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String getURLApplication() {
        return props.getProperty("application.demo.url");
    }

    public static String getSeleniumGridNodeOneURL() {
        return props.getProperty("selenium.grid.node.url.one");
    }

    public static String getSeleniumGridNodeTwoURL() {
        return props.getProperty("selenium.grid.node.url.two");
    }

    public static String getSeleniumGridHubURL() {
        return props.getProperty("selenium.hub.url");
    }
}
