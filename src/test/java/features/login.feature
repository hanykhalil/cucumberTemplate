Feature: Testing login functionality
  
   #Scenario: login with valid username and password
     #Given The user open the application and go to login page
     #When The user enter valid username  and password pass2 pass3 and click login
     #|410|2489441|01|98239|
     #Then The user should navigae to the homepage
 
	
	@myGitExcusion
  Scenario Outline: Login with invalid Credentials
  	 Given The user open the application and go to login page
     When The user enter valid "<username>"  and "<password>" "<pass2>" "<pass3>" and click login
     Then error message should be appear
 		 Examples:

 		 |   username  |  password  |  pass2  |  pass3  |
 		 |	 520       |  5236544   |  21     |  62548  |
 		 |	 522       |  5236545   |  44     |  62548  |
 		# |	 600       |  5236544   |  55     |  62545  |