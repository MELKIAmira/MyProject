package ui_generic_test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UIMenuContent {

	public static WebDriver driver;
	public static void main(String[] args) {


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
		
		//Logo TRAXENS-HUB
		WebElement WE1=driver.findElement(By.xpath("//div[@class='logo']"));
		System.out.println(WE1.getText());
		
		//Acceuil
		WebElement WE2=driver.findElement(By.xpath("//li[@class='pointer active']//a[@ui-sref='home']"));
		System.out.println(WE2.getText());
		
		//Menu KPIS
		WebElement WE3=driver.findElement(By.xpath("//li[@has-permission='KPI:R']//a[@class='dropdown-toggle']"));
		System.out.println(WE3.getText());
		
		//Ordres de mission
		WebElement WE4=driver.findElement(By.xpath("//a[@ui-sref='booking']"));
		System.out.println(WE4.getText());
		
		//Menu Equipements
		WebElement WE5=driver.findElement(By.xpath("//li[@has-permission='EQUIPMENT:R']//a[@class='dropdown-toggle']"));
		System.out.println(WE5.getText());
		
		//Menu Gérer
		WebElement WE6=driver.findElement(By.xpath("//html//ul[@class='nav navbar-nav nav-pills navbar-right']/li[1]/a[1]"));
		System.out.println("+++>"+WE6.getAttribute("title"));
		
		//Menu Notifications
		driver.findElement(By.xpath("//html//ul[@class='nav navbar-nav nav-pills navbar-right']/li[2]/a[1]"));
		
		//Menu Installation Boitier
		driver.findElement(By.xpath("(//A[@class='dropdown-toggle'])[5]"));
		
		//Menu administration
		driver.findElement(By.xpath("(//A[@class='dropdown-toggle'])[6]"));
		
		//Contacter support client
		driver.findElement(By.xpath("//a[@ui-sref='supportRequest.new']"));
		
		//Menu Langue
		driver.findElement(By.xpath("//li[@ui-sref-active='active']//a[@class='dropdown-toggle']"));
		
		//Menu Compte
		driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-scope']"));
		
		
	}

}
