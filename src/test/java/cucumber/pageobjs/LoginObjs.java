package cucumber.pageobjs;

import java.util.HashMap;
import java.util.Map;

public class LoginObjs {

    private static final Map<String, String> loginMap;

    static {
        loginMap = new HashMap<>();
        loginMap.put("Username", "username");
        loginMap.put("Password", "password");
        loginMap.put("Login", "//*[@id=\"loginPortlet\"]/div/form/table/tbody/tr[3]/td[2]/input");
        loginMap.put("LoginInvalidMessage", "openmrs_error");
    }

    public static String findLocator(String elementName) {
        elementName = elementName.replaceAll("\\s", "");

        if (loginMap.containsKey(elementName)) {
            return (loginMap.get(elementName));
        }
        return null;
    }
}
