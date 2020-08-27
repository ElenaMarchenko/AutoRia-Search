 Feature: User should be able to search  for auto using any filter.


 Scenario: Searching auto using filters
  Given User navigates to Autoria website
  When User opens advanced search page
  When User clicks on Type of transport accordeon and choose cars
  And User clicks on Maker button and choose Ford
  And User enters Cost boundaries till 15000
  And User clicks on Bargaining is possible button
  And User clicks on Odessa region in Region checkbox
  And User clicks on Nikolaev region in Region checkbox
  And User clicks on Kiev region in Region checkbox
  And User clicks on Hide button in Auto not in Ukraine checkbox
  And User clicks on Show button in Uncleared checkbox
  And User clicks on Hide button in In credit checkbox
  And User clicks on Hide button in Confiscated checkbox
  And User clicks on Hide button in Broken checkbox
  And User clicks on Hide button in Not on the go checkbox
  And User clicks on Petrol button in Fuel checkbox
  And User clicks on Diesel button in Fuel checkbox
  And User clicks on Manual gearbox button in Gearbox checkbox
  And User clicks on Automation gearbox button in Gearbox checkbox
  And User clicks on Comfort accordeon and clicks on Cruise control
  And User clicks on From cheap to expensive button in Sorting checkbox
  And User clicks on Hide sold button in Relevance checkbox
  And User enters Count of doors 5
  When User clicks search button
  Then User choose the car from the list