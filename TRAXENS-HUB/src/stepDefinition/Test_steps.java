package stepDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_steps {
 
	public WebDriver driver;
	public ArrayList<String> list_KPIS=new ArrayList<>();

	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage() throws Throwable {
		
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("disable-infobars");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://uat1wap01/traxui/#/login");
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	}
	
	@Given("^I am connected on Traxens-Hub$")
	public void i_am_logged() throws Throwable {

        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("disable-infobars");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://uat1wap01/traxui/#/login");
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("amallekh_sncf");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Croixrouge_13013");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	@When("^I enter userName as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_enter_userName_as_and_Password_as(String arg1, String arg2) throws Throwable {
		
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(arg1);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(arg2); 
	}

	@Then("^I should see Failed to sign in message$")
	public void i_should_see_Failed_to_sign_in_message() throws Throwable {

		driver.findElement(By.xpath("//div[@class='alert alert-danger ng-scope']"));
		String msg_erreur=driver.findElement(By.xpath("//div[@class='alert alert-danger ng-scope']")).getText();
		System.out.println("Identifiants de connexion sont incorrects. Apparition de ce message d'erreur: "+msg_erreur);
	}

	@When("^I click on sign_in button$")
	public void i_click_on_sign_in_button() throws Throwable {

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("^I should be logged$")
	public void i_should_be_logged() throws Throwable {

		System.out.println("Successfuly sign in");
	}
	

	@Then("^I put my mouse over \"([^\"]*)\"$")
	public void i_put_my_mouse_over(String arg1) throws Throwable {

        WebElement menu=driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-scope']"));
        
		menu.click();
		
		Actions action=new Actions(driver);
		
		action.moveToElement(menu).perform();
		
		Thread.sleep(1000);
		
	}

	@Then("^I click on \"([^\"]*)\"$")
	public void i_click_on(String arg1) throws Throwable {
	    
		driver.findElement(By.xpath("//a[@ng-click='logout()']")).click();
	}

	@Then("^I should be unlogged$")
	public void i_should_be_unlogged() throws Throwable {
	 
		driver.findElement(By.xpath("//button[@id='okBtn']")).click();

		Thread.sleep(1000);
	}

	@Then("^I should be redirected to authentication page$")
	public void i_should_be_redirected_to_authentication_page() throws Throwable {
	    
		System.out.println(driver.getTitle());
	}

	@Then("^I should see Logo Traxens-Hub$")
	public void i_should_see_Logo_Traxens_Hub() throws Throwable {
		//Logo TRAXENS-HUB
		driver.findElement(By.xpath("//div[@class='logo']"));
	}

	@Then("^I should see Accueil$")
	public void i_should_see_Accueil() throws Throwable {
		//Acceuil
		driver.findElement(By.xpath("//li[@class='pointer active']//a[@ui-sref='home']"));
	}

	@Then("^I should see menu KPI$")
	public void i_should_see_menu_KPI() throws Throwable {
		//Menu KPIS
		driver.findElement(By.xpath("//li[@has-permission='KPI:R']//a[@class='dropdown-toggle']"));
	}

	@Then("^I should see ORDRES DE MISSION$")
	public void i_should_see_ORDRES_DE_MISSION() throws Throwable {
		//Ordres de mission
		driver.findElement(By.xpath("//a[@ui-sref='booking']"));
	}

	@Then("^I should see menu equipements$")
	public void i_should_see_menu_quipements() throws Throwable {
		//Menu Equipements
		driver.findElement(By.xpath("//li[@has-permission='EQUIPMENT:R']//a[@class='dropdown-toggle']"));
	}

	@Then("^I should see menu Gerer$")
	public void i_should_see_menu_G_rer() throws Throwable {
		//Menu Gérer
		driver.findElement(By.xpath("//html//ul[@class='nav navbar-nav nav-pills navbar-right']/li[1]/a[1]"));
	}

	@Then("^I should see menu Notifications$")
	public void i_should_see_menu_Notifications() throws Throwable {
		//Menu Notifications
		driver.findElement(By.xpath("//html//ul[@class='nav navbar-nav nav-pills navbar-right']/li[2]/a[1]"));   
	}

	@Then("^I should see menu Installation Boitier$")
	public void i_should_see_menu_Installation_Boitier() throws Throwable {
		//Menu Installation Boitier
		driver.findElement(By.xpath("(//A[@class='dropdown-toggle'])[5]"));
	}

	@Then("^I should see menu Administration$")
	public void i_should_see_menu_Administration() throws Throwable {
	   
		//Menu administration
		driver.findElement(By.xpath("(//A[@class='dropdown-toggle'])[6]"));
	}

	@Then("^I should see Contacter le support client$")
	public void i_should_see_Contacter_le_support_client() throws Throwable {
	    //Contacter support client
		driver.findElement(By.xpath("//a[@ui-sref='supportRequest.new']"));
	}

	@Then("^I should see menu Langue$")
	public void i_should_see_menu_Langue() throws Throwable {
		//Menu Langue
		driver.findElement(By.xpath("//li[@ui-sref-active='active']//a[@class='dropdown-toggle']"));
	}

	@Then("^I should see menu Compte$")
	public void i_should_see_menu_Compte() throws Throwable {
	  
		//Menu Compte
		driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-scope']"));
	}

	
	@Then("^I wait the loading page$")
	public void i_wait_the_loading_page() throws Throwable {
	    Thread.sleep(2000);
	    
	}

	@Then("^I select English language$")
	public void i_select_English_language() throws Throwable {
		Thread.sleep(2000);
		String xp ="//li[@ui-sref-active='active']//a[@class='dropdown-toggle']";
	    WebElement menu=driver.findElement((By.xpath(xp)));
	    menu.click();
	    Actions action=new Actions(driver);
	    action.moveToElement(menu).perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@ng-click='changeLanguage(language)'][contains(text(),'English')]")).click();
	}

	
	@When("^I click on KPIS menu$")
	public void i_click_on_KPIS_menu() throws Throwable {
	
	    String xp_kpis_menu ="//li[@has-permission='KPI:R']//a[@class='dropdown-toggle']";
	   
	    WebElement menu_kpis=driver.findElement((By.xpath(xp_kpis_menu)));
	   
	    menu_kpis.click();
	    
	    List<WebElement> dd_kpis=driver.findElements(By.xpath("//li[@has-permission='KPI:R']//ul[@class='dropdown-menu']//li"));
	   
	    for (int i=0;i<dd_kpis.size();i++)
	    {
	    	WebElement ele= dd_kpis.get(i);
	    
	    	list_KPIS.add(ele.getText());	    	
	    	
	    }

	}
	
	
	
	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String arg1) throws Throwable {

		for (int i=0;i<list_KPIS.size();i++){
			if (list_KPIS.get(i).contains(arg1))
			{
				System.out.println("Le sous menu "+arg1+" existe dans KPIS");
			}	
		}	
	}
	
	
	

}