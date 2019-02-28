$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RegisterPatient.feature");
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
  "name": "\"RegisterPatient\" button is sent",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "The PatientDetails with \"GivenName\" and \"MiddleName\" and \"FamilyName\" are set",
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
  "duration": 2055232427,
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
  "duration": 336006827,
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
  "duration": 115470506,
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
  "duration": 1405733547,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RegisterPatient",
      "offset": 1
    }
  ],
  "location": "RegisterPatientThenStepsDef.registerAPatientButtonIsSent(String)"
});
formatter.result({
  "duration": 3268269227,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GivenName",
      "offset": 25
    },
    {
      "val": "MiddleName",
      "offset": 41
    },
    {
      "val": "FamilyName",
      "offset": 58
    }
  ],
  "location": "RegisterPatientThenStepsDef.theNameOfThePatientIsProvidedAndNextSectionIsSet(String,String,String,DataTable)"
});
formatter.result({
  "duration": 764610133,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.theGenderIsProvided(PatientDetails\u003e)"
});
formatter.result({
  "duration": 239246506,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.theBirthdayIsSet(DataTable)"
});
formatter.result({
  "duration": 587760213,
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
  "duration": 269141334,
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
  "duration": 241367894,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.userWillSendThePatientRelatedTo(DataTable)"
});
formatter.result({
  "duration": 656761173,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.userWillPressConfirm()"
});
formatter.result({
  "duration": 146417920,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.pageWithUserInformationWillAppear()"
});
formatter.result({
  "duration": 4354274987,
  "status": "passed"
});
});