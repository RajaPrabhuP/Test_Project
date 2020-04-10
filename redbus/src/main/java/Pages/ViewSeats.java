package Pages;

import Base.Base;

public class ViewSeats extends Base {

	
	public ViewSeats getTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		return this;
	}
	
	public ViewSeats getSeatCount()
	{
		String noofSeats = driver.findElementByXPath("(//div[@class='seat-left m-top-30'])[1]").getText();
		System.out.println(noofSeats);
		return this;
	}
}