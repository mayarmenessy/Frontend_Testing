Feature: F04_Search |
  @test
  Scenario user could search using product name
    When User search for laptop
    Then Soft assertion to verify laptop



  Scenario Outline: user could search for product using sku
    When User search for "<SKuName>"
    Then Soft assertion to verify "<SKuName>"
    Examples:
      | SKuName   |
      | APPLE_CAM |
