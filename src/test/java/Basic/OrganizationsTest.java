package Basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrganizationsTest {
	@Test 
	public void CreateOrganizationTest()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		
		
	}
}
