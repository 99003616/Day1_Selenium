import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day_Selenium {
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ibef.org/ibefusers/signUpRequest");
	}

}
