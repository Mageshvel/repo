package sample_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PomscmTest {
	@Test
	public void launch() {
		WebDriver driver=new ChromeDriver();
		
		Reporter.log("PollscmTest class executed",true);
	}
	

}
