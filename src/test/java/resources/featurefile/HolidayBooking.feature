Feature: Holiday Search and Booking Functionality
@Sanity
  Scenario: As a user I should be able to search my book holiday

    Given I am on Homepage
    When  I enter "Holiday Destination" in the search box
    And   I click on Accept Cookie Button
    And   I click on search button
    And   I click on More Info button
    Then  I should see and able to verify "Days""Price" and "Phonenumber"
    When  I click Book Online button
    Then  I should be able to book and verify first available "date"
    And   I click on Continue button
    And   I select standard room and select "number required" from dropdown
    And   I click on Select your Room and Continue
    And   I click on continue without extras button
    When  I select "Title" from dropdown for Adult one
    And   I enter "First Name" and "Last Name" for Adult one
    And   I select "Date" "Month" "Year" from dropdown for Adult one
    When  I select "Title" from dropdown for Adult two
    And   I enter "First Name" and "Last Name" for Adult two
    And   I select "Date" "Month" "Year" from dropdown for Adult
    Then  I should verify payment amount as per accomodation selected

