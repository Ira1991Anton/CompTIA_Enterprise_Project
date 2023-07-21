

Feature: User Settings
 
 Background: 
  Given As a user I am on the home screen
 

 @EmailSetUp
 Scenario: As a user I can Change Email Setting to use SSL on port 993
 When I set the user email settings to SSL
 Then The sever port should be set to 933
 And I select Account at the top.
 Then I Click Done
 

  @CorpNetWireless_WIFI
  Scenario: As a user I am able to Connect to CorpNet-Wirless Wi-Fi 
    When I connect to CorpNet-Wireless Wi-Fi 
    And  I enter password "@CorpNetWeRSecure!&" in the password field 
    And I lcik Join 
    Then I should be connected to CorpNet-Wirles 

   
