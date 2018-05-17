Feature: NavigationBarContent
	Différents scénarios en relation avec le contenu de la barre de navigation Menu et sous menu

Scenario: UI Menu Content
	Given I am connected on Traxens-Hub
	Then I should see Logo Traxens-Hub
	And I should see Accueil
	And I should see menu KPI
	And I should see ORDRES DE MISSION
	And I should see menu equipements
	And I should see menu Gerer
	And I should see menu Notifications
	And I should see menu Installation Boitier
	And I should see menu Administration
	And I should see Contacter le support client
	And I should see menu Langue
	And I should see menu Compte
	
	
Scenario: UI Sub Menu Content
	Given I am connected on Traxens-Hub
	#Then I wait the loading page
	Then I select English language
	When I click on KPIS menu
	Then I should see "On Time Delivery"
	And I should see "Transit Time"
	And I should see "Containers In Circulation"
	
	