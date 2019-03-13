package cucumber.classobjs;

public class PatientDetails {

    public String given;
    public String middle;
    public String familyName;
    public String day;
    public String year;
    public String firstName;
    public String lastName;

    public PatientDetails(String given, String middle, String familyName, String day, String year, String firstName, String lastName) {
        this.given = given;
        this.day = day;
        this.year = year;
        this.middle = middle;
        this.familyName = familyName;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
