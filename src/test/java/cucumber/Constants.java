package cucumber;

public class Constants {

    public static final String APPLICATION_URL = "https://demo.openmrs.org/openmrs/login.htm";
    public static final String USER_NAME_VALUE = "admin";
    public static final String PASSWORD_VALUE = "Admin123";
    public static final String LOGOUT_BUTTON = "/html/body/header/ul/li[3]/a";
    public static final String INVALID_MESSAGE_CREDENTIALS = "Invalid username/password. Please try again.";
    public static final String GENDER_BUTTON = "//*[@id=\"genderLabel\"]";
    public static final String BIRTHDAY_ID = "birthdateLabel";
    public static final String DAY_ID = "birthdateDay-field";
    public static final String YEAR_ID = "birthdateYear-field";
    public static final String MONTH_ID = "birthdateMonth-field";
    public static final String JANUARY_PATH = "//*[@id=\"birthdateMonth-field\"]/option[2]";
    public static final String ADDRESS_PATH = "//*[@id=\"formBreadcrumb\"]/li[2]/ul/li[1]/span";
    public static final String ADDRESS_PATIENT_ID = "address1";
    public static final String PHONE_PATH = "//*[@id=\"formBreadcrumb\"]/li[2]/ul/li[2]/span";
    public static final String PHONE_NUMBER = "phoneNumber";
    public static final String RELATIVE_PATH = "//*[@id=\"formBreadcrumb\"]/li[3]/ul/li/span";
    public static final String PERSONAL_NAME_PATH = "//*[@id=\"null\"]/div/div/p[2]/input[1]";
    public static final String PATIENT_TYPE_ID = "relationship_type";
    public static final String PATIENT_DOCTOR = "//*[@id=\"relationship_type\"]/option[2]";
    public static final String SUBMIT_BUTTON_ID = "submit";
    public static final String CONFIRM_BUTTON_XPATH = "//*[@id=\"confirmation_label\"]";
    public static final String GENERAL_ACTIONS_XPATH = "//*[@id=\"content\"]/div[9]/div/div[3]/div/ul/h3";
    public static final String LOGIN_PAGE = "Login";
    public static final String REGISTER_PAGE = "RegisterPatient";
    public static final String HOME_PAGE = "HomePage";
}
