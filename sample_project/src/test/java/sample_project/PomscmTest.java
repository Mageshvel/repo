package sample_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class PomscmTest {
	@Test
	public void launch() {
		WebDriver driver=new ChromeDriver();
		
		Reporter.log("PollscmTest class executed",true);
	}
	

}
