Feature: F03_currencies | home page

  @test
  Scenario: assure that some elements work
    When user select currencies Eru from home page
    Then assertion to verify "Euro" Symbol on products
