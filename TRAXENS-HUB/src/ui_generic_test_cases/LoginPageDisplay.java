package ui_generic_test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPageDisplay {

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
		
		System.out.println("Successfuly sign in");

	}

}
