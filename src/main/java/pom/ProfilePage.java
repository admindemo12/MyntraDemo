	package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	@FindBy(xpath="//a[text()='login / Signup']")
	private WebElement login;
	@FindBy(xpath="//div[text()='Orders']")
	private WebElement order;
	@FindBy(xpath="//div[text()='Wishlist']")
	private WebElement wishlist;
	@FindBy(xpath="//a[text()='Gift Cards']")
	private WebElement giftCards;
	@FindBy(xpath="//a[text()='Myntra Insider']")
	private WebElement myntraInsider;
	@FindBy(xpath="//a[text()='Myntra Credit']")
	private WebElement myntraCredit;
	@FindBy(xpath="//a[text()='Coupons']")
	private WebElement coupons;
	@FindBy(xpath="//a[text()='Saved Cards']")
	private WebElement savedCards;
	@FindBy(xpath="//a[text()='Saved VPA']")
	private WebElement savedVPA;
	@FindBy(xpath="//a[text()='Saved Addresses']")
	private WebElement savedAddresses;
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactUs;
	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getOrder() {
		return order;
	}
	public WebElement getWishlist() {
		return wishlist;
	}
	public WebElement getGiftCards() {
		return giftCards;
	}
	public WebElement getMyntraInsider() {
		return myntraInsider;
	}
	public WebElement getMyntraCredit() {
		return myntraCredit;
	}
	public WebElement getCoupons() {
		return coupons;
	}
	public WebElement getSavedCards() {
		return savedCards;
	}
	public WebElement getSavedVPA() {
		return savedVPA;
	}
	public WebElement getSavedAddresses() {
		return savedAddresses;
	}
	public WebElement getContactUs() {
		return contactUs;
	}
	
}
