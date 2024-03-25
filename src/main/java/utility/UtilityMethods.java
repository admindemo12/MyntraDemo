package utility;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

public class UtilityMethods {
public void maxiMize(WebDriver driver) {
	driver.manage().window().maximize();
}
public void miniMize(WebDriver driver) {
	driver.manage().window().minimize();
}
public void setSize(WebDriver driver,int a,int b) {
	driver.manage().window().setSize(new Dimension(a,b));
}
public void setPosition(WebDriver driver,int a,int b) {
	driver.manage().window().setPosition(new Point(a, b));
}
public void forward(WebDriver driver) {
	driver.navigate().forward();
}
public void back(WebDriver driver) {
	driver.navigate().back();
}
public void refresh(WebDriver driver) {
	driver.navigate().refresh();
}
public boolean isSelected(WebElement ele) {
	return ele.isSelected();
	}
public boolean isDisplayed(WebElement ele) {
	return ele.isDisplayed();
	}
public boolean isEnabled(WebElement ele) {
	return ele.isEnabled();
	}
public String getAtribute(WebElement ele,String a) {
	return ele.getAttribute(a);
	}
public void submit(WebElement ele) {
	 ele.submit();
	}  
public void clear(WebElement ele) {
	 ele.clear();
	}
public void robot(String key,int a) throws AWTException {
	Robot r=new Robot();
	for(int i=1;i<=a;i++) {
	switch(key) {
	case "Tab":
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		break;
	case "Enter":
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		break;
	case "Space":
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
		break;
	case "Escape":
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		break;
	case "Copy":
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		break;
	case "Paste":
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		break;
	default:
		System.out.println("choose valid option");
	}  
	}
}
public void scroll(WebDriver driver,int a,int b) {
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(a,b);");
}
public void moveToElement(WebDriver driver,WebElement ele) {
   Actions act=new Actions(driver);
		  act.moveToElement(ele).perform();
}
  public void actions(String key,WebDriver driver,WebElement ele,WebElement ele1,int a,int b) {
	  Actions act=new Actions(driver);
	  switch(key) {
	  case "MoveToElement":
		  act.moveToElement(ele).perform();
		  break;
	  case "ContextClick":
		  act.moveToElement(ele).contextClick().build().perform();
		  break;
	  case "DoubleClick":
		  act.doubleClick(ele).perform();
		  break;
	  case "DragAndDrop":
		  act.dragAndDropBy(ele,a,b).perform();
		  break;
	  case "DragAndDrop1":
		  act.dragAndDrop(ele,ele1).perform();
           break;
	  default:
			System.out.println("choose valid option");
		  }
  }
  public void select(String key,WebElement ele,int a,String b,String c) {
	  Select s=new Select(ele);
	  switch(key) {
	  case "Index": 
	   s.selectByIndex(a);
	   break;
	  case "VisibleText":
			   s.selectByVisibleText(b);
		   break;
	  case "Value":
		   s.selectByValue(c);
	   break;
	  default:
			System.out.println("choose valid option");
	   }
}
  public void frame(String key,WebDriver driver,WebElement ele,int a,String b) {
	  switch(key) {
	  case "Index":
	   driver.switchTo().frame(a);
	   break;
	  case "WebElement":
		  driver.switchTo().frame(ele);
		   break;
	  case "Value":
		  driver.switchTo().frame(b);
	   break;
	  case "DefaultContent":
		  driver.switchTo().defaultContent(); 
	   break;
	  default:
			System.out.println("choose valid option");
	   }
} 
  public void alert(String key,WebDriver driver,String a) {
	  Alert alt=driver.switchTo().alert();
	  switch(key) {
	  case "Accept":
	  alt.accept();
	   break;
	  case "Dismiss":
		 alt.dismiss();
		   break;
	  case "GetText":
		  alt.getText();
	   break;
	  case "SendKeys":
		  alt.sendKeys(a);
	   break;
	  default:
			System.out.println("choose valid option");
	   }
} 
  public String getWindowHandle(WebDriver driver) {
	 return driver.getWindowHandle();
  }
  public Set<String> getWindowHandles(WebDriver driver) {
		 return driver.getWindowHandles();
	  }
  public void nestedFrame(WebDriver driver,WebElement ele,int a) {
	driver.switchTo().frame(ele).switchTo().frame(a) ;
  }
  public void newWindow(WebDriver driver) {
		driver.switchTo().newWindow(WindowType.TAB) ;
	  }
  public void window(WebDriver driver,String a) {
		driver.switchTo().window(a) ;
	  }
  public void fileUpload(String a) {
		StringSelection s=new StringSelection(a) ;
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	  }
}
  

