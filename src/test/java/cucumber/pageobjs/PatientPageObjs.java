package cucumber.pageobjs;

import java.util.HashMap;
import java.util.Map;

public class PatientPageObjs {

    private static final Map<String, String> patientPageMap;
    public static final String GENERAL_ACTION = "//*[@id=\"content\"]/div[9]/div/div[3]/div/ul/h3";

    static {
        patientPageMap = new HashMap<>();
        patientPageMap.put("GeneralInfo", "//*[@id=\"content\"]/div[9]/div/div[3]/div/ul/h3");
        patientPageMap.put("GivenFamilyName", "//*[@id=\"content\"]/div[6]/div[1]/h1");
        patientPageMap.put("Diagnoses", "//*[@id=\"coreapps-diagnosesList\"]/div[1]/h3");
        patientPageMap.put("RecentVisits", "info-header");
        patientPageMap.put("Vitals", "//*[@id=\"coreapps-mostRecentVitals\"]/div[1]");
        patientPageMap.put("LatestObs", "//*[@id=\"coreapps-fr690\"]/div[1]/h3");
        patientPageMap.put("HealthTrend", "//*[@id=\"coreapps-fr8485\"]/div[1]/h3");
        patientPageMap.put("WeightGraph", "//*[@id=\"coreapps-fr5620\"]/div[1]/h3");
        patientPageMap.put("Appointment", "//*[@id=\"content\"]/div[9]/div/div[1]/div[6]/div[1]/h3");
        patientPageMap.put("Family", "//*[@id=\"coreapps-fr687\"]/div[1]/h3");
        patientPageMap.put("Conditions", "//*[@id=\"content\"]/div[9]/div/div[2]/div[3]/div[1]/h3");
        patientPageMap.put("Allergies", "//*[@id=\"content\"]/div[9]/div/div[2]/div[4]/div[1]/h3");
    }

    public static String findLocator(String elementName) {
        elementName = elementName.replaceAll("\\s", "");

        if (patientPageMap.containsKey(elementName)) {
            return (patientPageMap.get(elementName));
        }
        return null;
    }
}
