Feature: Compose email

  Background: email composition Pre-requisites
    Given User access the home page of the gmail
    And User login to page using id and password
    And User access the compose window by clicking the "Compose" button

  Scenario: Verify the Compose button works
    Then User is navigated to the compose window called "New Message"
    And The mouse cursor should be active in to field.

  Scenario: Verify the valid email is accepted in the "To" field
    When User access the compose window by clicking the "Compose" button
    And User enters the valid email formate of the recipent
    Then User gets the suggestions for the emails in the drop down to select from them
    And User is able to enter more than one valid emails
    When User press enter button
    Then The email is added to the recipents list

  Scenario: Verify the in-valid email is not accepted in the "To" field
    When User enters the invalid email in the "To" field
    And User press enter button
    Then The invalid formate email is marked with red Underline

  Scenario: Verify the "Cc" and "Bcc" fields are Available and Active
    When User clicks on "Cc" and "Bcc"
    Then The input box should open for corusponding field
    And valid email is acceptible

  Scenario: Verify the "Subject" field Available and Active
    When User clicks on "Subject" field it should get active
    And User enters the text to the field
    Then The Subject field should contain entred text

  Scenario: Verify the message body field is Available and Active
    When User clicks in the body field
    Then User should be able to enter the text message
    And Text Formatting options should be available for text modification

  Scenario: Verify the buttons "Formatting oprion", "Attach files", "Insert link", "insert emoji", "insert from drive", "insert photo" are availbale and active
    When User cliks on "Formatting oprion"
    Then Formatting ribbon or options must appear or disappear
    When User clicks on "Attach files"
    Then The System window should open for uploading the file
    When User clicks on "Insert link"
    Then Edit link window shold open
    When User clicks on "insert emoji"
    Then Window should open for selecting emoji
    When User clicks on "insert from drive"
    Then Users google drive window should open
    When User clicks on "insert photo"
    Then Users system window should open to upload photo

  #Scenario: Verify the delete icon is available
