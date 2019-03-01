package cucumber.pageobjs;

import java.util.HashMap;
import java.util.Map;

public class PatientPageObjs {

    private static final Map<String, String> patientPageMap;
    public static final String GENERAL_ACTION = "//*[@id=\"content\"]/div[9]/div/div[3]/div/ul/h3";

    static {
        patientPageMap = new HashMap<String, String>();
        patientPageMap.put("GeneralInfo", "//*[@id=\"content\"]/div[9]/div/div[3]/div/ul/h3");
        patientPageMap.put("GivenFamilyName", "//*[@id=\"content\"]/div[6]/div[1]/h1");
    }

    public static String findLocator(String elementName) {
        elementName = elementName.replaceAll("\\s", "");

        if (patientPageMap.containsKey(elementName)) {
            return (patientPageMap.get(elementName));
        }
        return null;
    }
}
