package cucumber.pageobjs;

import java.util.HashMap;
import java.util.Map;

public class HomePageObjs {

    private static final Map<String, String> homeMap;

    static {
        homeMap = new HashMap<String, String>();
        homeMap.put("LoggedInMessage", "home-container");
    }

    public static String findLocator(String elementName) {
        elementName = elementName.replaceAll("\\s", "");

        if (homeMap.containsKey(elementName)) {
            return (homeMap.get(elementName));
        }
        return null;
    }
}
