package cucumber.pageobjs;

import java.util.HashMap;
import java.util.Map;

public class RegisterPatientObjs {

    private static final Map<String, String> registerPatientMap;

    static {
        registerPatientMap = new HashMap<>();
        registerPatientMap.put("GivenName", "givenName");
        registerPatientMap.put("MiddleName", "middleName");
        registerPatientMap.put("FamilyName", "familyName");
        registerPatientMap.put("GenderButton", "genderLabel");
        registerPatientMap.put("Gender", "//*[@id=\"gender-field\"]/option[1]");
        registerPatientMap.put("Birthday", "birthdateLabel");
        registerPatientMap.put("Day", "birthdateDay-field");
        registerPatientMap.put("Year", "birthdateYear-field");
        registerPatientMap.put("Month", "birthdateMonth-field");
        registerPatientMap.put("Jan", "//*[@id=\"birthdateMonth-field\"]/option[2]");
        registerPatientMap.put("Address_button", "//*[@id=\"formBreadcrumb\"]/li[2]/ul/li[1]/span");
        registerPatientMap.put("Address", "address1");
        registerPatientMap.put("phone", "//*[@id=\"formBreadcrumb\"]/li[2]/ul/li[2]/span");
        registerPatientMap.put("phone_nr", "phoneNumber");
        registerPatientMap.put("relatives_path", "//*[@id=\"formBreadcrumb\"]/li[3]/ul/li/span");
        registerPatientMap.put("patient_type", "relationship_type");
        registerPatientMap.put("patient_doctor", "//*[@id=\"relationship_type\"]/option[2]");
        registerPatientMap.put("personal_name", "//*[@id=\"null\"]/div/div/p[2]/input[1]");
        registerPatientMap.put("confirm", "//*[@id=\"confirmation_label\"]");
        registerPatientMap.put("submit", "submit");
    }

    public static String findLocator(String elementName) {
        elementName = elementName.replaceAll("\\s", "");

        if (registerPatientMap.containsKey(elementName)) {
            return (registerPatientMap.get(elementName));
        }
        return null;
    }
}
