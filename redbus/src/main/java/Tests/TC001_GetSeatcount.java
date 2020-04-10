package Tests;

import org.testng.annotations.Test;

import Base.Base;
import Pages.HomePage;

public class TC001_GetSeatcount extends Base {

	@Test
	public void test() throws InterruptedException
	{
		String source="Chennai (All Locations)";
		String destination="Salem (All Locations)";
		
		new HomePage().getTitle().enterSource(source).enterDest(destination).selectFromDate("12").clickSearch()
		.getTitle().clickViewSeats().getTitle().getSeatCount();
	}
	
}