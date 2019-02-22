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
  "name": "Message with logged In appears having \"\u003clocation\u003e\"",
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
  "name": "Message with logged In appears having \"Isolation Ward\"",
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
  "duration": 3338408960,
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
  "duration": 265780053,
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
  "duration": 92218026,
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
  "duration": 1342096213,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Isolation Ward",
      "offset": 39
    }
  ],
  "location": "LoginThenStepsDef.messageWithLoggedInAppears(String)"
});
formatter.result({
  "duration": 47930027,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.logoutButtonWillBeClicked()"
});
formatter.result({
  "duration": 697201920,
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
  "name": "Message with logged In appears having \"Laboratory\"",
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
  "duration": 324797440,
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
  "duration": 192505600,
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
  "duration": 81624747,
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
  "duration": 1046175574,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Laboratory",
      "offset": 39
    }
  ],
  "location": "LoginThenStepsDef.messageWithLoggedInAppears(String)"
});
formatter.result({
  "duration": 44959146,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.logoutButtonWillBeClicked()"
});
formatter.result({
  "duration": 677726293,
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
  "name": "Message with logged In appears having \"Outpatient Clinic\"",
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
  "duration": 302058667,
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
  "duration": 201661013,
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
  "duration": 88163840,
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
  "duration": 969039360,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Outpatient Clinic",
      "offset": 39
    }
  ],
  "location": "LoginThenStepsDef.messageWithLoggedInAppears(String)"
});
formatter.result({
  "duration": 45713067,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.logoutButtonWillBeClicked()"
});
formatter.result({
  "duration": 678641493,
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
  "name": "Message with logged In appears having \"Pharmacy\"",
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
  "duration": 362087253,
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
  "duration": 287546027,
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
  "duration": 96532907,
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
  "duration": 1040861014,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pharmacy",
      "offset": 39
    }
  ],
  "location": "LoginThenStepsDef.messageWithLoggedInAppears(String)"
});
formatter.result({
  "duration": 47822507,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.logoutButtonWillBeClicked()"
});
formatter.result({
  "duration": 762780160,
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
  "name": "Message with logged In appears having \"Registration Desk\"",
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
  "duration": 277946453,
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
  "duration": 205352960,
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
  "duration": 80486827,
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
  "duration": 990899627,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Registration Desk",
      "offset": 39
    }
  ],
  "location": "LoginThenStepsDef.messageWithLoggedInAppears(String)"
});
formatter.result({
  "duration": 37958400,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.logoutButtonWillBeClicked()"
});
formatter.result({
  "duration": 687357867,
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
  "duration": 306257067,
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
  "duration": 172310187,
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
  "duration": 80995840,
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
  "duration": 948914346,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.registerAPatientButtonIsSent()"
});
formatter.result({
  "duration": 2029458346,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.theNameOfThePatientIsProvidedAndNextSectionIsSet(DataTable)"
});
formatter.result({
  "duration": 649084160,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.theGenderIsProvided(PatientDetails\u003e)"
});
formatter.result({
  "duration": 207269973,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.theBirthdayIsSet(DataTable)"
});
formatter.result({
  "duration": 511286614,
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
  "duration": 224207360,
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
  "duration": 236122454,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.userWillSendThePatientRelatedTo(DataTable)"
});
formatter.result({
  "duration": 590909014,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.userWillPressConfirm()"
});
formatter.result({
  "duration": 96583680,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.pageWithUserInformationWillAppear()"
});
formatter.result({
  "duration": 3545696000,
  "status": "passed"
});
});