package prac;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.BaseClass2;
import pom.HomePage;
import utility.UtilityMethods;

public class Order2 extends BaseClass2{
@Test
public void t2() {
	HomePage hp=new HomePage(driver);
	WebElement ele=hp.getBag();
	ele.click();
}
}
