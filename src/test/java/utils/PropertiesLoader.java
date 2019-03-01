package utils;

import org.apache.commons.exec.environment.EnvironmentUtils;

import java.util.Properties;

public class PropertiesLoader {

    private static Properties props;

    static {

        try {
            String envFile = System.getProperty("env");
            String filePath = "environments/".concat(envFile.concat(".properties"));
            props = new Properties();
            props.load(EnvironmentUtils.class.getClassLoader().getResourceAsStream(filePath));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static String getDriver() {
        return props.getProperty("driver");
    }

    public static String getDriverExecute() {
        return props.getProperty("driver.execute");
    }
}
