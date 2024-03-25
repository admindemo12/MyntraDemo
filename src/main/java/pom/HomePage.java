package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath ="//nav[@class=\"desktop-navbar\"]/div/div/div/a")
private WebElement men;
@FindBy(xpath ="//a[text()='Women']")
private WebElement women;
@FindBy(xpath ="///a[text()='Kids']")
private WebElement kids;
@FindBy(xpath ="//a[text()='Home & Living']")
private WebElement homeAndLiving;
@FindBy(xpath ="//a[text()='Beauty']")
private WebElement Beauty;
@FindBy(xpath ="//a[text()='Studio']")
private WebElement studio;
@FindBy(xpath ="//span[text()='Profile']")
private WebElement profile;
@FindBy(xpath ="//span[text()='Wishlist']")
private WebElement wishlist;
@FindBy(xpath ="//span[text()='Bag']")
private WebElement bag;
@FindBy(className="desktop-searchBar")
private WebElement searchBar;
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);	
}
public WebElement getMen() {
	return men;
}
public WebElement getWomen() {
	return women;
}
public WebElement getKids() {
	return kids;
}
public WebElement getHomeAndLiving() {
	return homeAndLiving;
}

public WebElement getBeauty() {
	return Beauty;
}
public WebElement getStudio() {
	return studio;
}
public WebElement getProfile() {
	return profile;
}
public WebElement getWishlist() {
	return wishlist;
}
public WebElement getBag() {
	return bag;
}
public WebElement getSearchBar() {
	return searchBar;
}
}
