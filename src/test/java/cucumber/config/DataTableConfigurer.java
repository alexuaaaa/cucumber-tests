package cucumber.config;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import cucumber.classobjs.PatientDetails;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

import java.util.Locale;
import java.util.Map;


public class DataTableConfigurer implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry registry) {
        registry.defineDataTableType(new DataTableType(PatientDetails.class, new TableEntryTransformer<PatientDetails>() {
            @Override
            public PatientDetails transform(Map<String, String> entry) {
                return new PatientDetails(entry.get("given"), entry.get("middle"), entry.get("familyName"), entry.get("gender"), entry.get("day"), entry.get("year"), entry.get("path"), entry.get("firstName"), entry.get("lastName"));
            }
        }));

    }

}