package prac;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.HomePage;
import pom.Women;
import utility.UtilityMethods;

public class WomenCate2  extends BaseClass {
	UtilityMethods um=new UtilityMethods();
	HomePage hp;
	@Test
	public void t1() {
		 hp=new HomePage(driver);
			WebElement ele=hp.getWomen();
		um.actions("MoveToElement", driver, ele, ele, 0, 0);
	}

@Test
public void chooseWomenCategory() {
	hp=new HomePage(driver);
		WebElement ele=hp.getWomen();
	um.actions("MoveToElement", driver, ele, ele, 0, 0);
	Women m=new Women(driver);
	List<WebElement> ele1=m.getIndianAndFusionWear();
	for(int i=0;i<ele1.size();i++) {
		String a=ele1.get(i).getText();
	System.out.println(a);	
	}
	ele1.get(2).click();
}
}
