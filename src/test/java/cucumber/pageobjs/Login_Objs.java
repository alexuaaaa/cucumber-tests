package cucumber.pageobjs;

import java.util.HashMap;
import java.util.Map;

public class Login_Objs {

    private static final Map<String, String> loginMap;

    static {
        loginMap = new HashMap<String, String>();
        loginMap.put("Username", "username");
        loginMap.put("Password", "password");
    }

    public static String findLocator(String elementName) {
        elementName = elementName.replaceAll("\\s", "");

        if (loginMap.containsKey(elementName)) {
            return (loginMap.get(elementName));
        }
        return null;
    }
}
