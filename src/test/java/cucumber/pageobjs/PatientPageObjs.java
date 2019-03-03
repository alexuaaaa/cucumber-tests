package cucumber.pageobjs;

import java.util.HashMap;
import java.util.Map;

public class PatientPageObjs {

    private static final Map<String, String> patientPageMap;
    public static final String GENERAL_ACTION = "//*[@id=\"content\"]/div[9]/div/div[3]/div/ul/h3";

    static {
        patientPageMap = new HashMap<>();
        patientPageMap.put("GeneralInfo", "content");
        patientPageMap.put("GivenFamilyName", "Alex Andrei Albu");
        patientPageMap.put("Diagnoses", "DIAGNOSES");
        patientPageMap.put("RecentVisits", "RECENT VISITS");
        patientPageMap.put("Vitals", "VITALS");
        patientPageMap.put("LatestObs", "LATEST OBSERVATIONS");
        patientPageMap.put("HealthTrend", "HEALTH TREND SUMMARY");
        patientPageMap.put("WeightGraph", "WEIGHT GRAPH");
        patientPageMap.put("Appointment", "APPOINTMENTS");
        patientPageMap.put("Family", "FAMILY");
        patientPageMap.put("Conditions", "CONDITIONS");
        patientPageMap.put("Allergies", "ALLERGIES");
    }

    public static String findLocator(String elementName) {
        elementName = elementName.replaceAll("\\s", "");

        if (patientPageMap.containsKey(elementName)) {
            return (patientPageMap.get(elementName));
        }
        return null;
    }
}
