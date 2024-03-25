package prac;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.HomePage;
import utility.UtilityMethods;

public class Order extends BaseClass{
@Test
public void t2() {
	HomePage hp=new HomePage(driver);
	WebElement ele=hp.getBag();
	ele.click();
}
}
