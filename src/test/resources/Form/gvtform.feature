#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of India govt register form
  

  @tag1
  Scenario: Title of India govt register form
    Given User Opens the Chrome browser and navigate to India govt register form website
    When user enter "<Username>", "<EmailAddress>"
    And user enters "<FirstName>","<LastName>"
    And user selects "<country>","<state>","<Pincode>","<Education>"
    And user checks the Subcribe to newsletter
    And user enters "<Text>"
    And User click on Create Account
    Then user enter validate data sucessfully
   
    Examples: 
|  Username     |  EmailAddress      |  FirstName  |  LastName  |  Pincode |  country | state           | Education                               | Text   |
|  Meg1103      |  meg@gmail.com     |  Meghana    |   Bojja    |  550323  |  India   | Andhra Pradesh  | Graduate/Post Graduate-Professional     | s7n59n |
|  Chitti1103   |  chitt@gmail.com   |  Chitti     |   Soppari  |  552381  |  India   | Goa             | Higher Secondary Education              | i2h4g1 |
|  Maggie1123   |  maggie@gmail.com  |  Maggie     |   Spri     |  523123  |  India   | Karnataka       | Elementary Education                    | g6s3k2 |
|  pavan0709    |  pavan@gmail.com   |  Pavan      |   Bojja    |  567321  |  India   | Telangana       | Vocational                              | o9w3e2 |
|  Kalyan2303   |  kalayan@gmail.com |  Kalyan     |   BPjk     |  500023  |  India   | Kerala          | Higher Secondary Education              | h3g6w8 |
|  Bujji110323  |  bujji@gmail.com   |  Bujji      |   PkBojja  |  577631  |  India   | West Bengal     | Secondary Education                     | m26w2d |

