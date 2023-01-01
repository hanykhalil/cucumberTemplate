Feature: Testing login functionality
  
   #Scenario: login with valid username and password
     #Given The user open the application and go to login page
     #When The user enter valid username  and password pass2 pass3 and click login
     #|410|2489441|01|98239|
     #Then The user should navigae to the homepage
 
	@regression
  Scenario Outline: Login with invalid Credentials
  	 Given The user open the application and go to login page
     When The user enter valid "<username>"  and "<password>" "<pass2>" "<pass3>" and click login
     Then error message should be appear
 		 Examples:

 		 |   username  |  password  |  pass2  |  pass3  |
 		 |	 410       |  5236544   |  01     |  62548  |
 		 |	 410       |  5236545   |  01     |  62548  |
 		# |	 411       |  5236544   |  01     |  62545  |