Feature: checkerTool
  NHS Cost for Wales Residents
  As person from Wales
  I need to know what help I can get with my NHS costs
  So that I can get the treatment I need

  @Test
  Scenario: check eligibility for help as a resident below 18 of Wales for NHS treatment
    Given I am a NHS checkerTool website
    And I am a resident from Wales
    When I put my details into the Checker tool
    Then I should know if I am qualify to "get help with nhs fees"
    And I should then get a result of whether I will "get help or not"




