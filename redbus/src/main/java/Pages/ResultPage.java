package Pages;

import Base.Base;

public class ResultPage extends Base {
	
	public ResultPage getTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		return this;
	}
	
	public ViewSeats clickViewSeats() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[text()='View Seats'])[1]").click();
		return new ViewSeats();
	}

}