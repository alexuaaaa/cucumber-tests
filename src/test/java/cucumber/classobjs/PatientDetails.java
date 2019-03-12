package cucumber.classobjs;

public class PatientDetails {

    public String given;
    public String middle;
    public String familyName;
    public String gender;
    public String day;
    public String year;
    public String path;
    public String lastName;
    public String firstName;


    public PatientDetails(String given, String middle, String familyName, String gender, String day, String year, String path, String firstName, String lastName) {
        this.given = given;
        this.middle = middle;
        this.familyName = familyName;
        this.gender = gender;
        this.day = day;
        this.year = year;
        this.path = path;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
