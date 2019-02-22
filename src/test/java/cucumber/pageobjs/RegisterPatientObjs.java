package cucumber.pageobjs;

import java.util.HashMap;
import java.util.Map;

public class RegisterPatientObjs {

    private static final Map<String, String> registerPatientMap;

    static {
        registerPatientMap = new HashMap<String, String>();
        registerPatientMap.put("GivenName", "givenName");
        registerPatientMap.put("MiddleName", "middleName");
        registerPatientMap.put("FamilyName", "familyName");
    }

    public static String findLocator(String elementName) {
        elementName = elementName.replaceAll("\\s", "");

        if (registerPatientMap.containsKey(elementName)) {
            return (registerPatientMap.get(elementName));
        }
        return null;
    }
}
