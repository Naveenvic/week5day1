package week5day1;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority =2 )
private void CreateLead() {
	// TODO Auto-generated method stub

}
	@Test(priority =8 )
	private void DeleteLead() {
		// TODO Auto-generated method stub

	}
	@Test(priority =-5 )
	private void MergeLead() {
		// TODO Auto-generated method stub

	}
}
//priority is used to run method as what you want to run first,second,third
//ex; -5,2,8 due to low to high it run the method first run mergelead,second run createlead ,third run deletelead
