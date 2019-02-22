$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login form of the application",
  "description": "",
  "id": "login-form-of-the-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "1. When user and password are send with valid values then user is logged successfully",
  "description": "Positive test",
  "id": "login-form-of-the-application;1.-when-user-and-password-are-send-with-valid-values-then-user-is-logged-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "The URL application is accessed with success",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User is send the valid \"Username\" and \"Password\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User is send one \"\u003clocation\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "\"Login\" button is pressed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "\"LoggedInMessage\" with logged In appears having \"\u003clocation\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Logout button will be clicked",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "login-form-of-the-application;1.-when-user-and-password-are-send-with-valid-values-then-user-is-logged-successfully;",
  "rows": [
    {
      "cells": [
        "location"
      ],
      "line": 14,
      "id": "login-form-of-the-application;1.-when-user-and-password-are-send-with-valid-values-then-user-is-logged-successfully;;1"
    },
    {
      "cells": [
        "Isolation Ward"
      ],
      "line": 15,
      "id": "login-form-of-the-application;1.-when-user-and-password-are-send-with-valid-values-then-user-is-logged-successfully;;2"
    },
    {
      "cells": [
        "Laboratory"
      ],
      "line": 16,
      "id": "login-form-of-the-application;1.-when-user-and-password-are-send-with-valid-values-then-user-is-logged-successfully;;3"
    },
    {
      "cells": [
        "Outpatient Clinic"
      ],
      "line": 17,
      "id": "login-form-of-the-application;1.-when-user-and-password-are-send-with-valid-values-then-user-is-logged-successfully;;4"
    },
    {
      "cells": [
        "Pharmacy"
      ],
      "line": 18,
      "id": "login-form-of-the-application;1.-when-user-and-password-are-send-with-valid-values-then-user-is-logged-successfully;;5"
    },
    {
      "cells": [
        "Registration Desk"
      ],
      "line": 19,
      "id": "login-form-of-the-application;1.-when-user-and-password-are-send-with-valid-values-then-user-is-logged-successfully;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "1. When user and password are send with valid values then user is logged successfully",
  "description": "Positive test",
  "id": "login-form-of-the-application;1.-when-user-and-password-are-send-with-valid-values-then-user-is-logged-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 4,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "The URL application is accessed with success",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User is send the valid \"Username\" and \"Password\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User is send one \"Isolation Ward\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "\"Login\" button is pressed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "\"LoggedInMessage\" with logged In appears having \"Isolation Ward\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Logout button will be clicked",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGivenStepsDef.theURLApplicationIsAccessedWithSuccess()"
});
formatter.result({
  "duration": 2817023573,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Username",
      "offset": 24
    },
    {
      "val": "Password",
      "offset": 39
    }
  ],
  "location": "LoginWhenStepsDef.userIsSendTheValidCredentials(String,String)"
});
formatter.result({
  "duration": 17897267626,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Isolation Ward",
      "offset": 18
    }
  ],
  "location": "LoginWhenStepsDef.userIsSendOneLocation(String)"
});
formatter.result({
  "duration": 85550934,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 1
    }
  ],
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess(String)"
});
formatter.result({
  "duration": 2874977280,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LoggedInMessage",
      "offset": 1
    },
    {
      "val": "Isolation Ward",
      "offset": 49
    }
  ],
  "location": "LoginThenStepsDef.messageWithLoggedInAppears(String,String)"
});
formatter.result({
  "duration": 39860697173,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.logoutButtonWillBeClicked()"
});
formatter.result({
  "duration": 724291414,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "1. When user and password are send with valid values then user is logged successfully",
  "description": "Positive test",
  "id": "login-form-of-the-application;1.-when-user-and-password-are-send-with-valid-values-then-user-is-logged-successfully;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 4,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "The URL application is accessed with success",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User is send the valid \"Username\" and \"Password\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User is send one \"Laboratory\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "\"Login\" button is pressed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "\"LoggedInMessage\" with logged In appears having \"Laboratory\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Logout button will be clicked",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGivenStepsDef.theURLApplicationIsAccessedWithSuccess()"
});
formatter.result({
  "duration": 315426560,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Username",
      "offset": 24
    },
    {
      "val": "Password",
      "offset": 39
    }
  ],
  "location": "LoginWhenStepsDef.userIsSendTheValidCredentials(String,String)"
});
formatter.result({
  "duration": 2774129066,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Laboratory",
      "offset": 18
    }
  ],
  "location": "LoginWhenStepsDef.userIsSendOneLocation(String)"
});
formatter.result({
  "duration": 79428267,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 1
    }
  ],
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess(String)"
});
formatter.result({
  "duration": 1840359253,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LoggedInMessage",
      "offset": 1
    },
    {
      "val": "Laboratory",
      "offset": 49
    }
  ],
  "location": "LoginThenStepsDef.messageWithLoggedInAppears(String,String)"
});
formatter.result({
  "duration": 1416563626,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.logoutButtonWillBeClicked()"
});
formatter.result({
  "duration": 750294187,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "1. When user and password are send with valid values then user is logged successfully",
  "description": "Positive test",
  "id": "login-form-of-the-application;1.-when-user-and-password-are-send-with-valid-values-then-user-is-logged-successfully;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 4,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "The URL application is accessed with success",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User is send the valid \"Username\" and \"Password\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User is send one \"Outpatient Clinic\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "\"Login\" button is pressed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "\"LoggedInMessage\" with logged In appears having \"Outpatient Clinic\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Logout button will be clicked",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGivenStepsDef.theURLApplicationIsAccessedWithSuccess()"
});
formatter.result({
  "duration": 309908480,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Username",
      "offset": 24
    },
    {
      "val": "Password",
      "offset": 39
    }
  ],
  "location": "LoginWhenStepsDef.userIsSendTheValidCredentials(String,String)"
});
formatter.result({
  "duration": 1317591466,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Outpatient Clinic",
      "offset": 18
    }
  ],
  "location": "LoginWhenStepsDef.userIsSendOneLocation(String)"
});
formatter.result({
  "duration": 80318720,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 1
    }
  ],
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess(String)"
});
formatter.result({
  "duration": 1579397973,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LoggedInMessage",
      "offset": 1
    },
    {
      "val": "Outpatient Clinic",
      "offset": 49
    }
  ],
  "location": "LoginThenStepsDef.messageWithLoggedInAppears(String,String)"
});
formatter.result({
  "duration": 2081404160,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.logoutButtonWillBeClicked()"
});
formatter.result({
  "duration": 736494507,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "1. When user and password are send with valid values then user is logged successfully",
  "description": "Positive test",
  "id": "login-form-of-the-application;1.-when-user-and-password-are-send-with-valid-values-then-user-is-logged-successfully;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 4,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "The URL application is accessed with success",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User is send the valid \"Username\" and \"Password\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User is send one \"Pharmacy\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "\"Login\" button is pressed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "\"LoggedInMessage\" with logged In appears having \"Pharmacy\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Logout button will be clicked",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGivenStepsDef.theURLApplicationIsAccessedWithSuccess()"
});
formatter.result({
  "duration": 319097173,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Username",
      "offset": 24
    },
    {
      "val": "Password",
      "offset": 39
    }
  ],
  "location": "LoginWhenStepsDef.userIsSendTheValidCredentials(String,String)"
});
formatter.result({
  "duration": 1997665706,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pharmacy",
      "offset": 18
    }
  ],
  "location": "LoginWhenStepsDef.userIsSendOneLocation(String)"
});
formatter.result({
  "duration": 83072427,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 1
    }
  ],
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess(String)"
});
formatter.result({
  "duration": 1014237014,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LoggedInMessage",
      "offset": 1
    },
    {
      "val": "Pharmacy",
      "offset": 49
    }
  ],
  "location": "LoginThenStepsDef.messageWithLoggedInAppears(String,String)"
});
formatter.result({
  "duration": 51517440,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.logoutButtonWillBeClicked()"
});
formatter.result({
  "duration": 667291733,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "1. When user and password are send with valid values then user is logged successfully",
  "description": "Positive test",
  "id": "login-form-of-the-application;1.-when-user-and-password-are-send-with-valid-values-then-user-is-logged-successfully;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 4,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "The URL application is accessed with success",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User is send the valid \"Username\" and \"Password\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User is send one \"Registration Desk\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "\"Login\" button is pressed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "\"LoggedInMessage\" with logged In appears having \"Registration Desk\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Logout button will be clicked",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGivenStepsDef.theURLApplicationIsAccessedWithSuccess()"
});
formatter.result({
  "duration": 295513173,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Username",
      "offset": 24
    },
    {
      "val": "Password",
      "offset": 39
    }
  ],
  "location": "LoginWhenStepsDef.userIsSendTheValidCredentials(String,String)"
});
formatter.result({
  "duration": 189206614,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Registration Desk",
      "offset": 18
    }
  ],
  "location": "LoginWhenStepsDef.userIsSendOneLocation(String)"
});
formatter.result({
  "duration": 100075520,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 1
    }
  ],
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess(String)"
});
formatter.result({
  "duration": 982034346,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LoggedInMessage",
      "offset": 1
    },
    {
      "val": "Registration Desk",
      "offset": 49
    }
  ],
  "location": "LoginThenStepsDef.messageWithLoggedInAppears(String,String)"
});
formatter.result({
  "duration": 48878507,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.logoutButtonWillBeClicked()"
});
formatter.result({
  "duration": 734081707,
  "status": "passed"
});
formatter.uri("RegisterPatient.feature");
formatter.feature({
  "line": 2,
  "name": "Register a patient",
  "description": "",
  "id": "register-a-patient",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@RegisterPatient"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Register a patient and after that set confirm",
  "description": "",
  "id": "register-a-patient;register-a-patient-and-after-that-set-confirm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The URL application is accessed with success",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User is send the valid \"Username\" and \"Password\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User is send one \"Inpatient Ward\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "\"Login\" button is pressed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Register a patient button is sent",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "The PatientDetails are set",
  "rows": [
    {
      "cells": [
        "Given",
        "Middle",
        "FamilyName"
      ],
      "line": 12
    },
    {
      "cells": [
        "Alex",
        "Andrei",
        "Albu"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "The gender is provided",
  "rows": [
    {
      "cells": [
        "Gender",
        "Path"
      ],
      "line": 15
    },
    {
      "cells": [
        "Male",
        "//*[@id\u003d\"gender-field\"]/option[1]"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "The birthday is set",
  "rows": [
    {
      "cells": [
        "Day",
        "Year"
      ],
      "line": 18
    },
    {
      "cells": [
        "10",
        "1990"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User will send the address \"Bucuresti\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User will provide the telephone \"0734364811\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User will send the patient related to",
  "rows": [
    {
      "cells": [
        "LastName",
        "FirstName"
      ],
      "line": 23
    },
    {
      "cells": [
        "Albu",
        "Alexandru"
      ],
      "line": 24
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User will press confirm",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Page With User Information will appear",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGivenStepsDef.theURLApplicationIsAccessedWithSuccess()"
});
formatter.result({
  "duration": 288433920,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Username",
      "offset": 24
    },
    {
      "val": "Password",
      "offset": 39
    }
  ],
  "location": "LoginWhenStepsDef.userIsSendTheValidCredentials(String,String)"
});
formatter.result({
  "duration": 180822613,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Inpatient Ward",
      "offset": 18
    }
  ],
  "location": "LoginWhenStepsDef.userIsSendOneLocation(String)"
});
formatter.result({
  "duration": 95581440,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 1
    }
  ],
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess(String)"
});
formatter.result({
  "duration": 968023466,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.registerAPatientButtonIsSent()"
});
formatter.result({
  "duration": 5373669973,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.theNameOfThePatientIsProvidedAndNextSectionIsSet(DataTable)"
});
formatter.result({
  "duration": 730654720,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.theGenderIsProvided(PatientDetails\u003e)"
});
formatter.result({
  "duration": 212812800,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.theBirthdayIsSet(DataTable)"
});
formatter.result({
  "duration": 492696320,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bucuresti",
      "offset": 28
    }
  ],
  "location": "RegisterPatientThenStepsDef.userWillSendTheAddress(String)"
});
formatter.result({
  "duration": 230238720,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0734364811",
      "offset": 33
    }
  ],
  "location": "RegisterPatientThenStepsDef.userWillProvideTheTelephone(Integer)"
});
formatter.result({
  "duration": 226041600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.userWillSendThePatientRelatedTo(DataTable)"
});
formatter.result({
  "duration": 576180480,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.userWillPressConfirm()"
});
formatter.result({
  "duration": 93118720,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.pageWithUserInformationWillAppear()"
});
formatter.result({
  "duration": 7606214400,
  "status": "passed"
});
});