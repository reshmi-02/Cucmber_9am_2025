Feature: As a user i want to login the facebook page with  data
 so that i am able to navigate to the homepage
 
 
 Scenario: login the facebook page with invalid credencials 
 Given user have to open the url in the browser 
 When user enter the invalid username in the username field 
 And user enter the invalid password in te password field 
 And user click on the login button 
 Then user should be on the error page 