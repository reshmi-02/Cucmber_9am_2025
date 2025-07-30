Feature: As a user i want to login the orange hrm page so that
 i am able to navigate to the dashboard
 
 Background:
 Given user launches the orangehrm page in the browser 
 
 @regression
 Scenario: As a user i want to login the orange hrm page with valid credencials
 When user enter the username "Admin" in the orangehrm page username field 
 And user enter the password "admin123" in the orangehrm page password field 
 And user click on the orangehrm page login button 
 Then user should see the orangehrm page dashboard 
 
 
 @smoke @sanity
Scenario Outline: As a user i want lo login the orangehrm page with invalid credencial 
 When user enter the username "<username>" in the orangehrm page username field 
 And user enter the password "<password>" in the orangehrm page password field 
 And user click on the orangehrm page login button 
 Then user should see the orangehrm page login page 
 
 Examples:
 |username|password|
 |oranium|oranium123|
 |priya|priya123|
 |kavi|kavi123| 
 
 
 
 
 