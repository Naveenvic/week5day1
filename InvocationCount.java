package week5day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InvocationCount extends BaseHooks {

@Test(invocationCount = 2)
	

	public  void invocationCount() {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
}

}
