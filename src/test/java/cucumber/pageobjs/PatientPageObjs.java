package cucumber.pageobjs;

import java.util.HashMap;
import java.util.Map;

public class PatientPageObjs {

    private static final Map<String, String> patientPageMap;

    static {
        patientPageMap = new HashMap<String, String>();
        patientPageMap.put("GeneralInfo", "//*[@id=\"content\"]/div[9]/div/div[3]/div/ul/h3");
    }

    public static String findLocator(String elementName) {
        elementName = elementName.replaceAll("\\s", "");

        if (patientPageMap.containsKey(elementName)) {
            return (patientPageMap.get(elementName));
        }
        return null;
    }
}
