@all @authentification
Feature: Login
	Differents scenarios related to login/logout
 
@authentification.login 
Scenario: Login depuis page d'identification Traxen-hub
	Given I am on the homepage
	#Connexion
	When I enter userName as "amallekh_sncf" and Password as "Croixrouge_13013"
	And I click on sign_in button
	Then I should be logged
@authentification.login
Scenario: Echec d'identification
#An error message should be seen when the username and the password are incorrect.
	Given I am on the homepage
	#Connexion
	When I enter userName as "user" and Password as "password"
	And I click on sign_in button
	Then I should see Failed to sign in message
	
@authentification.logout
Scenario: Déconnexion
	Given I am connected on Traxens-Hub
	# Deconnexion
    Then I put my mouse over "Mon compte"
    And I click on "Déconnexion"
    Then I should be unlogged
    And I should be redirected to authentication page
    