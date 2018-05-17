package ui_generic_test_cases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class UISubMenuContent {

	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("disable-infobars");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("http://uat1wap01/traxui/#/login");
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("amallekh_sncf");		
	    
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Croixrouge_13013");
		
	    driver.findElement(By.xpath("//span[@translate='login.form.button']")).click();
	    
	    Thread.sleep(2000);
	    
	    //Select Language	    
	    String xp_Language ="//li[@ui-sref-active='active']//a[@class='dropdown-toggle']";
	   
	    WebElement menu=driver.findElement((By.xpath(xp_Language)));
	   
	    menu.click();
	   
	    Actions action=new Actions(driver);
	   
	    action.moveToElement(menu).perform();
	    
	    Thread.sleep(1000);

	    driver.findElement(By.xpath("//a[@ng-click='changeLanguage(language)'][contains(text(),'English')]")).click();
	    
	    //“KPIS” Sub Menu Item
	    String xp_kpis_menu ="//li[@has-permission='KPI:R']//a[@class='dropdown-toggle']";
	   
	    WebElement menu_kpis=driver.findElement((By.xpath(xp_kpis_menu)));
	   
	    menu_kpis.click();
	    
	    List<WebElement> dd_kpis=driver.findElements(By.xpath("//li[@has-permission='KPI:R']//ul[@class='dropdown-menu']//li"));
	   
	    System.out.println("“KPIS” Sub Menu Item are ==>");
	    
	    for (int i=0;i<dd_kpis.size();i++)
	    {
	    	WebElement ele= dd_kpis.get(i);
	    	System.out.println(ele.getText());
	    }
	    
	    //“Equipment” Sub Menu Item
	    
	    String xp_equi_menu="//li[@has-permission='EQUIPMENT:R']//a[@class='dropdown-toggle']";
	   
	    WebElement menu_equi=driver.findElement(By.xpath(xp_equi_menu));
	    
	    menu_equi.click();
	    
	    List<WebElement> dd_equi=driver.findElements(By.xpath("//li[@has-permission='EQUIPMENT:R']//ul[@class='dropdown-menu']/li"));
	    
	    System.out.println("“Equipment” Sub Menu Item are ==>");
	    
	    for (int i = 0; i < dd_equi.size(); i++) 
	    {
	    	WebElement ele=dd_equi.get(i);
	    	System.out.println(ele.getText());
	    	
		}
	    
	    
        //“Manage” Sub Menu Item
	    
	    String xp_manage_menu="//html//ul[@class='nav navbar-nav nav-pills navbar-right']/li[1]/a[1]";
	   
	    WebElement menu_manage=driver.findElement(By.xpath(xp_manage_menu));
	    
	    menu_manage.click();
	    
	    List<WebElement> dd_manage=driver.findElements(By.xpath("//html//li[1]/ul[1]/li"));
	    
	    System.out.println("“Manage” Sub Menu Item are ==>");
	    
	    for (int i = 0; i < dd_manage.size(); i++) 
	    {
	    	WebElement ele=dd_manage.get(i);
	    	System.out.println(ele.getText());
	    	
		}
	    
	    //Notifications Sub Menu Item
	    
	    //Device installation Sub Menu Item
	    
	    //Administration Sub Menu Item
	    
	    //Language Sub Menu Item
	    
	    //Account Sub Menu Item

	}



}
