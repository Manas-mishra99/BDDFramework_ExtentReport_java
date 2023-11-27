Feature: Search for a store
#search for a store
  @firstTest
  Scenario: Search for a store
    Given I am on the Asian Paints website
    When I navigate to the "Stores" page
    And I enter the pincode as "411001" in the search box And I click on the "Search" button And I click on the "Directions" button
    Then I should see the details of the store
#
##searching for a store that doesnt exist Scenario: Search for a non-existent store
#    Given I am on the Asian Paints website
#    When I go to the "Stores" page
#    And I enter a pincode in the search box And I click on the "Search" button
#    But I should see a message that the store could not be found
#
#
##Exploring the furnishing store
#  Scenario: Navigate to Furnishing Store
#    Given I am on the Asian Paints website
#    When I navigate to the "Furnishing Stores" page And I click to see the different types
#    And I click on see more to know more about the furnishing And I click on dropdown filters for "Black" for furnishing colour And I click on see more to see more about the product Then I should enter pincode and click on place enquiry
#
#
##Explore the decor store
#  Scenario: Select a decor item
#    Given I am on the "Decor Store" page
#    When I click on a decor item
#    Then I should be redirected to that decor items details page
#
#
#  Scenario Outline: Search for stores in          different cities
#    Given I am on the Asian Paints website
#    When I navigate to the "find Store near me"
#  page in stores option And I enter "pincode" or "city" in the search box
#    And I click on the "Search" button
#    Then I should see a list of stores in the nearby pincode and the city as well.
#    Examples:
#
#    pincode | city
#
#    411001  |  Pune
#
#
#    411035 | mumbai
