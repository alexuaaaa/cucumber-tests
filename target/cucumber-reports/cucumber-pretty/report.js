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
  "name": "User is send the valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User is send one \"\u003clocation\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Login button is pressed",
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
  "name": "User is send the valid credentials",
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
  "name": "Login button is pressed",
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
  "duration": 1878714453,
  "status": "passed"
});
formatter.match({
  "location": "LoginWhenStepsDef.userIsSendTheValidCredentials()"
});
formatter.result({
  "duration": 282783147,
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
  "duration": 97626453,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess()"
});
formatter.result({
  "duration": 827048960,
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
  "duration": 69058133,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.logoutButtonWillBeClicked()"
});
formatter.result({
  "duration": 802599680,
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
  "name": "User is send the valid credentials",
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
  "name": "Login button is pressed",
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
  "duration": 291199147,
  "status": "passed"
});
formatter.match({
  "location": "LoginWhenStepsDef.userIsSendTheValidCredentials()"
});
formatter.result({
  "duration": 265916586,
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
  "duration": 90490027,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess()"
});
formatter.result({
  "duration": 595871146,
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
  "duration": 66548480,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.logoutButtonWillBeClicked()"
});
formatter.result({
  "duration": 686067627,
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
  "name": "User is send the valid credentials",
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
  "name": "Login button is pressed",
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
  "duration": 320388694,
  "status": "passed"
});
formatter.match({
  "location": "LoginWhenStepsDef.userIsSendTheValidCredentials()"
});
formatter.result({
  "duration": 177424214,
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
  "duration": 79664640,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess()"
});
formatter.result({
  "duration": 607571627,
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
  "duration": 53601280,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.logoutButtonWillBeClicked()"
});
formatter.result({
  "duration": 814591573,
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
  "name": "User is send the valid credentials",
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
  "name": "Login button is pressed",
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
  "duration": 318533974,
  "status": "passed"
});
formatter.match({
  "location": "LoginWhenStepsDef.userIsSendTheValidCredentials()"
});
formatter.result({
  "duration": 186097066,
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
  "duration": 80751360,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess()"
});
formatter.result({
  "duration": 588573866,
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
  "duration": 52538880,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.logoutButtonWillBeClicked()"
});
formatter.result({
  "duration": 735224320,
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
  "name": "User is send the valid credentials",
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
  "name": "Login button is pressed",
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
  "duration": 339037440,
  "status": "passed"
});
formatter.match({
  "location": "LoginWhenStepsDef.userIsSendTheValidCredentials()"
});
formatter.result({
  "duration": 170714880,
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
  "duration": 95749120,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess()"
});
formatter.result({
  "duration": 587115093,
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
  "duration": 63808427,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.logoutButtonWillBeClicked()"
});
formatter.result({
  "duration": 699769600,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "2. When user press Logout then the page will return to login",
  "description": "Positive test",
  "id": "login-form-of-the-application;2.-when-user-press-logout-then-the-page-will-return-to-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "The URL application is accessed with success",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User is send the valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User is send one \"Inpatient Ward\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Login button is pressed",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Logout button will be clicked",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGivenStepsDef.theURLApplicationIsAccessedWithSuccess()"
});
formatter.result({
  "duration": 317778774,
  "status": "passed"
});
formatter.match({
  "location": "LoginWhenStepsDef.userIsSendTheValidCredentials()"
});
formatter.result({
  "duration": 204705707,
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
  "duration": 79093333,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess()"
});
formatter.result({
  "duration": 693111040,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.logoutButtonWillBeClicked()"
});
formatter.result({
  "duration": 724816640,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 31,
  "name": "3. When user is login with invalid credentials then invalid message is returned",
  "description": "Negative test",
  "id": "login-form-of-the-application;3.-when-user-is-login-with-invalid-credentials-then-invalid-message-is-returned",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 30,
      "name": "@Test3"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "The URL application is accessed with success",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "User is send the invalid \"\u003cusername\u003e\" and invalid \"\u003cpassword\u003e\" credentials",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "User is send one \"Inpatient Ward\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Login button is pressed",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Invalid message with invalid user/pass is returned",
  "keyword": "Then "
});
formatter.examples({
  "line": 38,
  "name": "",
  "description": "",
  "id": "login-form-of-the-application;3.-when-user-is-login-with-invalid-credentials-then-invalid-message-is-returned;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 39,
      "id": "login-form-of-the-application;3.-when-user-is-login-with-invalid-credentials-then-invalid-message-is-returned;;1"
    },
    {
      "cells": [
        "test",
        "test"
      ],
      "line": 40,
      "id": "login-form-of-the-application;3.-when-user-is-login-with-invalid-credentials-then-invalid-message-is-returned;;2"
    },
    {
      "cells": [
        "Admin",
        "test"
      ],
      "line": 41,
      "id": "login-form-of-the-application;3.-when-user-is-login-with-invalid-credentials-then-invalid-message-is-returned;;3"
    },
    {
      "cells": [
        "test",
        "Admin123"
      ],
      "line": 42,
      "id": "login-form-of-the-application;3.-when-user-is-login-with-invalid-credentials-then-invalid-message-is-returned;;4"
    },
    {
      "cells": [
        "@#$#",
        "Admin123"
      ],
      "line": 43,
      "id": "login-form-of-the-application;3.-when-user-is-login-with-invalid-credentials-then-invalid-message-is-returned;;5"
    },
    {
      "cells": [
        "Admin",
        "@#$#"
      ],
      "line": 44,
      "id": "login-form-of-the-application;3.-when-user-is-login-with-invalid-credentials-then-invalid-message-is-returned;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 40,
  "name": "3. When user is login with invalid credentials then invalid message is returned",
  "description": "Negative test",
  "id": "login-form-of-the-application;3.-when-user-is-login-with-invalid-credentials-then-invalid-message-is-returned;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 30,
      "name": "@Test3"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "The URL application is accessed with success",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "User is send the invalid \"test\" and invalid \"test\" credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "User is send one \"Inpatient Ward\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Login button is pressed",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Invalid message with invalid user/pass is returned",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGivenStepsDef.theURLApplicationIsAccessedWithSuccess()"
});
formatter.result({
  "duration": 317245867,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 26
    },
    {
      "val": "test",
      "offset": 45
    }
  ],
  "location": "LoginWhenStepsDef.userAndPasswordAreSendWithInvalidValues(String,String)"
});
formatter.result({
  "duration": 160992853,
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
  "duration": 73649493,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess()"
});
formatter.result({
  "duration": 537998080,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.messageWithInvalidCredentialsIsReturned()"
});
formatter.result({
  "duration": 52157013,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "3. When user is login with invalid credentials then invalid message is returned",
  "description": "Negative test",
  "id": "login-form-of-the-application;3.-when-user-is-login-with-invalid-credentials-then-invalid-message-is-returned;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 30,
      "name": "@Test3"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "The URL application is accessed with success",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "User is send the invalid \"Admin\" and invalid \"test\" credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "User is send one \"Inpatient Ward\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Login button is pressed",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Invalid message with invalid user/pass is returned",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGivenStepsDef.theURLApplicationIsAccessedWithSuccess()"
});
formatter.result({
  "duration": 317553494,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 26
    },
    {
      "val": "test",
      "offset": 46
    }
  ],
  "location": "LoginWhenStepsDef.userAndPasswordAreSendWithInvalidValues(String,String)"
});
formatter.result({
  "duration": 171178666,
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
  "duration": 76815360,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess()"
});
formatter.result({
  "duration": 567322027,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.messageWithInvalidCredentialsIsReturned()"
});
formatter.result({
  "duration": 47952213,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "3. When user is login with invalid credentials then invalid message is returned",
  "description": "Negative test",
  "id": "login-form-of-the-application;3.-when-user-is-login-with-invalid-credentials-then-invalid-message-is-returned;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 30,
      "name": "@Test3"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "The URL application is accessed with success",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "User is send the invalid \"test\" and invalid \"Admin123\" credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "User is send one \"Inpatient Ward\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Login button is pressed",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Invalid message with invalid user/pass is returned",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGivenStepsDef.theURLApplicationIsAccessedWithSuccess()"
});
formatter.result({
  "duration": 316498347,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 26
    },
    {
      "val": "Admin123",
      "offset": 45
    }
  ],
  "location": "LoginWhenStepsDef.userAndPasswordAreSendWithInvalidValues(String,String)"
});
formatter.result({
  "duration": 192626346,
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
  "duration": 87846827,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess()"
});
formatter.result({
  "duration": 522656000,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.messageWithInvalidCredentialsIsReturned()"
});
formatter.result({
  "duration": 44464213,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "3. When user is login with invalid credentials then invalid message is returned",
  "description": "Negative test",
  "id": "login-form-of-the-application;3.-when-user-is-login-with-invalid-credentials-then-invalid-message-is-returned;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 30,
      "name": "@Test3"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "The URL application is accessed with success",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "User is send the invalid \"@#$#\" and invalid \"Admin123\" credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "User is send one \"Inpatient Ward\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Login button is pressed",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Invalid message with invalid user/pass is returned",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGivenStepsDef.theURLApplicationIsAccessedWithSuccess()"
});
formatter.result({
  "duration": 325725440,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "@#$#",
      "offset": 26
    },
    {
      "val": "Admin123",
      "offset": 45
    }
  ],
  "location": "LoginWhenStepsDef.userAndPasswordAreSendWithInvalidValues(String,String)"
});
formatter.result({
  "duration": 180903680,
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
  "duration": 83606613,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess()"
});
formatter.result({
  "duration": 543698347,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.messageWithInvalidCredentialsIsReturned()"
});
formatter.result({
  "duration": 48895147,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "3. When user is login with invalid credentials then invalid message is returned",
  "description": "Negative test",
  "id": "login-form-of-the-application;3.-when-user-is-login-with-invalid-credentials-then-invalid-message-is-returned;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 30,
      "name": "@Test3"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "The URL application is accessed with success",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "User is send the invalid \"Admin\" and invalid \"@#$#\" credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "User is send one \"Inpatient Ward\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Login button is pressed",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Invalid message with invalid user/pass is returned",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGivenStepsDef.theURLApplicationIsAccessedWithSuccess()"
});
formatter.result({
  "duration": 296314453,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 26
    },
    {
      "val": "@#$#",
      "offset": 46
    }
  ],
  "location": "LoginWhenStepsDef.userAndPasswordAreSendWithInvalidValues(String,String)"
});
formatter.result({
  "duration": 171283627,
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
  "duration": 78158080,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess()"
});
formatter.result({
  "duration": 608942933,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.messageWithInvalidCredentialsIsReturned()"
});
formatter.result({
  "duration": 48069120,
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
  "name": "User is send the valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User is send one \"Inpatient Ward\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Login button is pressed",
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
  "duration": 320454400,
  "status": "passed"
});
formatter.match({
  "location": "LoginWhenStepsDef.userIsSendTheValidCredentials()"
});
formatter.result({
  "duration": 172437333,
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
  "duration": 75184640,
  "status": "passed"
});
formatter.match({
  "location": "LoginThenStepsDef.userIsLoggedInWithSuccess()"
});
formatter.result({
  "duration": 618456320,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.registerAPatientButtonIsSent()"
});
formatter.result({
  "duration": 3673377280,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.theNameOfThePatientIsProvidedAndNextSectionIsSet(DataTable)"
});
formatter.result({
  "duration": 647181226,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.theGenderIsProvided(PatientDetails\u003e)"
});
formatter.result({
  "duration": 207864747,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.theBirthdayIsSet(DataTable)"
});
formatter.result({
  "duration": 512140800,
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
  "duration": 248757760,
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
  "duration": 248166827,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.userWillSendThePatientRelatedTo(DataTable)"
});
formatter.result({
  "duration": 12555842987,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.userWillPressConfirm()"
});
formatter.result({
  "duration": 111701333,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPatientThenStepsDef.pageWithUserInformationWillAppear()"
});
formatter.result({
  "duration": 4044720214,
  "status": "passed"
});
});