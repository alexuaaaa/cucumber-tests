package cucumber.config;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import cucumber.classobjs.PatientDetails;
import cucumber.classobjs.PatientGender;
import io.cucumber.datatable.DataTableType;

import java.util.Locale;
import java.util.Map;


public class DataTableConfigurer implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(
                new DataTableType(PatientDetails.class,
                        (Map<String, String> row) -> {
                            String given = row.get("Given");
                            String middle = row.get("Middle");
                            String familyName = row.get("FamilyName");
                            String day = row.get("Day");
                            String year = row.get("Year");
                            String firstName = row.get("FirstName");
                            String lastName = row.get("LastName");

                            return new PatientDetails(given, middle, familyName, day, year, firstName, lastName);
                        }
                )
        );

        typeRegistry.defineDataTableType(
                new DataTableType(PatientGender.class,
                        (Map<String, String> row) -> {
                            String gender = row.get("Gender");
                            String path = row.get("Path");

                            return new PatientGender(gender, path);
                        }
                )
        );
    }
}