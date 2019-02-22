package cucumber.pageobjs;

import java.util.HashMap;
import java.util.Map;

public class HomePageObjs {

    private static final Map<String, String> homeMap;

    static {
        homeMap = new HashMap<String, String>();
        homeMap.put("LoggedInMessage", "home-container");
        homeMap.put("FindPatientRecord", "coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension");
        homeMap.put("ActiveVisits", "org-openmrs-module-coreapps-activeVisitsHomepageLink-org-openmrs-module-coreapps-activeVisitsHomepageLink-extension");
        homeMap.put("CaptureVitals", "referenceapplication-vitals-referenceapplication-vitals-extension");
        homeMap.put("AppointmentScheduling", "appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension");
        homeMap.put("Reports", "reportingui-reports-homepagelink-reportingui-reports-homepagelink-extension");
        homeMap.put("DataManagement", "coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension");
        homeMap.put("ConfigureMetadata", "org-openmrs-module-adminui-configuremetadata-homepageLink-org-openmrs-module-adminui-configuremetadata-homepageLink-extension");
        homeMap.put("SystemAdministration", "coreapps-systemadministration-homepageLink-coreapps-systemadministration-homepageLink-extension");
        homeMap.put("RegisterPatient","referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension");
    }

    public static String findLocator(String elementName) {
        elementName = elementName.replaceAll("\\s", "");

        if (homeMap.containsKey(elementName)) {
            return (homeMap.get(elementName));
        }
        return null;
    }
}
