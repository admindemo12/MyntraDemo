package oracleHomePage;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumberRunner.Loginpage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Home {
	Loginpage lp;
	WebDriver driver;
@Before()
public void open() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		lp=new Loginpage(driver);
		lp.AcctBtnLabel().click();
		lp.signIn().click();
		lp.getUsername().sendKeys("supriyareddy598@gmail.com",Keys.TAB,"supriyA@4",Keys.ENTER);
}
@After()
public void tear() {

}
}
