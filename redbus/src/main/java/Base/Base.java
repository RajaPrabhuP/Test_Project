package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public static ChromeDriver driver;
	String url="https://www.redbus.in/";

	@BeforeMethod
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java\\redbus\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//Loading a url
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

	}
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.close();
	}

	public void waitForVisibilityOfElement(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void waitForElementClickable(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(locator));	
	}

	public void waitForElementClickable(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(ele));	
	}

	public WebElement FindElementByXpath(String xpath)
	{
		waitForElementClickable(By.xpath(xpath));
		return driver.findElementByXPath(xpath);
	}

	public WebElement FindElementById(String id)
	{
		waitForElementClickable(By.id(id));
		return driver.findElementById(id);
	}

	public void pageLoadWait()
	{
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.MILLISECONDS);
	}

}