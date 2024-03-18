Feature: Send email

  Scenario: verify the "Send" option available
    Given User access the home page of the gmail
    And User access the compose window by clicking the "Compose" button
    Then User is navigated to the compose window called "New Message"
    And The Send button should be available

  Scenario Outline: Verify clicking send button for invalid email address shows error message
    Given User enters <"email type"> To field
    And User clicks on Send button
    But The Simple Alert for <"Error message"> should appear

    Examples: 
      | email type  | Error message                                                                                            |
      | wrongemail@ | The address in the To field was not recognised. Please make sure that all addresses are properly formed. |
      | null        | Please specify at least one recipient.                                                                   |

  Scenario: Verify the send email option works for empty Subject and body
    Given User enters the valid email to the To field
    And User keep the Subject and message body empty
    When User clicks on Send button
    Then User is displayed with Confirm Alert asking to send message without Subject and body
    When User clicks ok button
    Then email should be send
    When User clicks cancel button
    Then User is returned to the compose window

  Scenario: Verify "Schedule Send" option is available
    Given User enters the valid email to the To field
    When User clicks on Schedule Send arrow button
    Then Window for selecting date and time to send the message is appered
