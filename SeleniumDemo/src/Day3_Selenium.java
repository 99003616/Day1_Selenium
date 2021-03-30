import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day3_Selenium {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Desktop\\geckodriver-v0.29.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		
//		// ---------------- FireFox Browser ---- Automation Demo Site
//		driver.get("http://demo.automationtesting.in/Frames.html");
////		JavascriptExecutor js = (JavascriptExecutor) driver;
////		js.executeScript("window.scrollBy(0,1000)");
//		driver.switchTo().frame("SingleFrame");
//		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Hello World");
//		driver.switchTo().frame("Iframe with in an Iframe");
//		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
//	}
	
	 ///--------------------------Test NG
//	@Test
//	public void Login() throws InterruptedException{
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Desktop\\geckodriver-v0.29.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		Thread.sleep(2000);
//		driver.findElement(By.id("btnLogin")).click();
//	}
//	@Test
//	public void FullScreen(){
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Desktop\\geckodriver-v0.29.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://demo.automationtesting.in/Frames.html");
//		driver.manage().window().maximize();
//	}
//	
//	@Test
//	public void Scroll(){
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Desktop\\geckodriver-v0.29.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://demo.automationtesting.in/Frames.html");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)");
//	}
//	
	
	//------------------------Priority(TestNg)
	@Test(priority = 1,description = "Orange hrms Live" /* , enabled = false*/ ,dependsOnMethods = "y" )
	public void x() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Desktop\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	@Test(priority = 2, enabled = true)
	public void y(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Desktop\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://emicalculator.net/");
	}
	@Test(alwaysRun = true)
	public void z() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Desktop\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
	}
	@BeforeMethod
	public void a() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void b() {
		System.out.println("After Method");
	}
}
