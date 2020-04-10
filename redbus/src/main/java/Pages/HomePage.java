package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Base.Base;

public class HomePage extends Base {

	public HomePage getTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		return this;
	}
	
	public HomePage enterSource(String source) throws InterruptedException
	{
		WebElement src=driver.findElementById("src");
		src.sendKeys(source);
		Thread.sleep(1000);
		src.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		return this;
	}
	
	public HomePage enterDest(String destination) throws InterruptedException
	{
		WebElement dest=driver.findElementById("dest");
		dest.sendKeys(destination);
		Thread.sleep(1000);
		dest.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		return this;
	}

	public HomePage selectFromDate(String date)
	{
		driver.findElementByXPath("(//td[text()='"+date+"'])[2]").click();
		return this;
	}
	
	public ResultPage clickSearch()
	{
		driver.findElementById("search_btn").click();
		return new ResultPage();
	}

}