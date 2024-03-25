package prac;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.HomePage;

public class Login2 extends BaseClass{
@Test
public void t1() {
	HomePage hp=new HomePage(driver);
	WebElement ele=hp.getSearchBar();
	ele.sendKeys("kurthi");
	ele.submit();
}
}
