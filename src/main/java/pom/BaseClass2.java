package pom;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReusableMethods;

public class BaseClass2 {
	public   WebDriver driver=null;
	public ReusableMethods r=new ReusableMethods();
	@BeforeSuite
	public void connection() {
		Reporter.log("JDBC connected",true);
	}
		@BeforeClass(alwaysRun=true)
			 public void aapOpen() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			 		driver.manage().window().maximize();
			 		driver.get("https://www.myntra.com/");
			 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		}
		//@BeforeMethod(alwaysRun=true)
		public void login() throws IOException{
			driver.findElement(By.name("username")).sendKeys(r.propertyFetch("UN"),Keys.TAB,r.propertyFetch("PWD"),Keys.ENTER);
		}
		//@AfterMethod(alwaysRun=true)
		public void logOut() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.id("logoutLink")).click();	
		}
	//	@AfterClass(alwaysRun=true)
		public void appClosed() {	
			driver.close();
		}
		@AfterSuite
		public void isConnection() {
			Reporter.log("JDBC disconnected",true);
	}
}

