package prac;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v114.profiler.model.Profile;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.BaseClass2;
import pom.HomePage;
import pom.ProfilePage;
import utility.UtilityMethods;

public class Login extends BaseClass{
@Test
public void t1() {
	HomePage hp=new HomePag(driver);
	WebElement ele=hp.getSearchBar();
	ele.submit();

}
}
