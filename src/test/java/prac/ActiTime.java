package prac;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReusableMethods;

public class ActiTime {
	ReusableMethods r=new ReusableMethods();
	WebDriver driver;
	@DataProvider(name="data")
	public String[][]  paraMeter() throws IOException{
		int y=r.excelFetchRow("Sheet1");
		int z=r.excelFetchCell("Sheet1",1);
		Reporter.log(y+"roandcolumn "+z,true);
		String [][]a=new String[y][z];
		for(int i=0;i<y;i++) {
			//int z=r.excelFetchCell("Sheet1",i);
			for(int j=0;j<z;j++) {
			 a[i][j]=r.excelFetchData("Sheet1",i,j);
			 }
		}
		return a;
	}
@Test(priority=1)
public void open() {
	WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
	driver.get("https://www.oracle.com/in/");
	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 		driver.findElement(By.id("acctBtnLabel")).click();
	 		driver.findElement(By.xpath("//a[text()='Sign-In']")).click();
}
//@Test(dataProvider="data",priority=2)
public void zlog(String u,String p) {
	 		//driver.findElement(By.xpath("//a[text()='Sign-In']")).click();
	 		driver.findElement(By.name("ssousername")).sendKeys(u,Keys.TAB,p,Keys.ENTER);
	 		//String t=driver.findElement(By.id("errormsg")).getText();
	 		String t=driver.getTitle();
	 		Assert.assertEquals(t,"Oracle India | Cloud Applications and Cloud Platform");
	 		if(t.equals("Oracle India | Cloud Applications and Cloud Platform")) {
	 		driver.findElement(By.id("acctBtnLabel")).click();
	 		driver.findElement(By.xpath(" //a[text()='Sign Out']")).click();
	 		driver.findElement(By.id("acctBtnLabel")).click();
	 		driver.findElement(By.xpath("//a[text()='Sign-In']")).click();
	 		}
	 			}                                            

}
