package ui_generic_test_cases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Logout {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
			
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
			
			WebElement menu=driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-scope']"));
			
			menu.click();
			
			Actions action=new Actions(driver);
			
			action.moveToElement(menu).perform();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[@ng-click='logout()']")).click();
			
			//Confirmer la déconnexion en cliquant sur boutton déconnexion depuis le popup
			
			driver.findElement(By.xpath("//button[@id='okBtn']")).click();

			Thread.sleep(1000);
			
			System.out.println(driver.getTitle());
		
			
	}

}
