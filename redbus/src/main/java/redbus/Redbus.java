package redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\git\\MavenProject\\driver\\chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver=new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		//URL
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);

		//Source
		WebElement src=driver.findElementById("src");
		src.sendKeys("Chennai (All Locations)");
		Thread.sleep(1000);
		src.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		//Destination
		WebElement dest=driver.findElementById("dest");
		dest.sendKeys("Bangalore (All Locations)");
		Thread.sleep(1000);
		dest.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		Actions a=new Actions(driver);
		WebElement cal=driver.findElementById("onward_cal");
		a.moveToElement(cal);
		Thread.sleep(2000);
		//WebElement ele=driver.findElementByXPath("(//*[@class='rb-monthTable first last']//tr//td[contains(@class,'current day')])[2]");
		
		WebElement ele=driver.findElementByXPath("(//*[@class='rb-monthTable first last']//tr//td[contains(text(),'12')])[2]");
		Thread.sleep(1000);

		a.click(ele).build().perform();;
		Thread.sleep(1000);
		driver.findElementById("search_btn").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='button view-seats fr'])[1]").click();
		Thread.sleep(2000);
		
		
		String str=driver.findElementByXPath("//div[@class='seat-left m-top-30'][1]").getText(); 
		 System.out.println(str);
		 

		//List<WebElement> elements=driver.findElementsByClassName("bus-items");
		/*
		 * List<WebElement>
		 * elements=driver.findElementsByXPath("//ul[@class='bus-items']//div"); int
		 * len=elements.size(); System.out.println(len); //List<WebElement> eleRows =
		 * elements.get(1).findElements(By.tagName("td")); //List<WebElement>
		 * eleCols=eleRows.get(1).findElements(By.cssSelector("name")); //for(int
		 * i=0;i<len;i++) //{ // System.out.println(eleCols.get(i).getText());
		 * 
		 * //}
		 * driver.findElementByXPath("//ul[@class='dept-time dt-time-filter']//li[4]").
		 * click(); //driver.findElementByClassName("custom-checkbox").click();
		 * //driver.findElementById("dtAfter 6 pm").click(); Thread.sleep(1000);
		 * //driver.findElementById("bt_AC").click();
		 */

	}

}


