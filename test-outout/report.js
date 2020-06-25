$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/sudheer.indlamudi/eclipse-workspace-new/BDD_FrameWork_Practice/src/main/java/com/Features/DataUsingMaps.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on CRM Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters valid username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "0abcdef098@gmail.com",
        "Test@123"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "click on the new button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commission"
      ],
      "line": 16
    },
    {
      "cells": [
        "test deal1",
        "1000",
        "50",
        "10"
      ],
      "line": 17
    },
    {
      "cells": [
        "test deal2",
        "2000",
        "60",
        "20"
      ],
      "line": 18
    },
    {
      "cells": [
        "test deal3",
        "3000",
        "70",
        "30"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click on save button",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "#Then user moves to new deal page1"
    },
    {
      "line": 23,
      "value": "#Then click on the new button1"
    }
  ],
  "line": 24,
  "name": "Close the browser1",
  "keyword": "Then "
});
formatter.match({
  "location": "DatausingMapsStepDefenition.user_is_already_on_CRM_Login_Page()"
});
formatter.result({
  "duration": 29777262000,
  "status": "passed"
});
formatter.match({
  "location": "DatausingMapsStepDefenition.the_title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 25995400,
  "status": "passed"
});
formatter.match({
  "location": "DatausingMapsStepDefenition.user_enters_valid_username_and_password(DataTable)"
});
formatter.result({
  "duration": 500436300,
  "status": "passed"
});
formatter.match({
  "location": "DatausingMapsStepDefenition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 349688000,
  "status": "passed"
});
formatter.match({
  "location": "DatausingMapsStepDefenition.user_is_on_home_page()"
});
formatter.result({
  "duration": 1652083300,
  "status": "passed"
});
formatter.match({
  "location": "DatausingMapsStepDefenition.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 385382900,
  "status": "passed"
});
formatter.match({
  "location": "DatausingMapsStepDefenition.click_on_the_new_button()"
});
formatter.result({
  "duration": 369577300,
  "status": "passed"
});
formatter.match({
  "location": "DatausingMapsStepDefenition.user_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 1333665580800,
  "status": "passed"
});
formatter.match({
  "location": "DatausingMapsStepDefenition.click_on_save_button()"
});
formatter.result({
  "duration": 458018100,
  "status": "passed"
});
formatter.match({
  "location": "DatausingMapsStepDefenition.Close_the_browser1()"
});
