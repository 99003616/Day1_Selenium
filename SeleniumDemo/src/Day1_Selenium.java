import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1_Selenium {

	public static void main(String[] args) throws InterruptedException {
		//------------------Set Property and .get function 
		System.out.println("Welcome to selenium basic training");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		driver.manage().window().maximize();
		
		
		//---------------------Radio Button
		WebElement radio1 = driver.findElement(By.cssSelector("input[value='Male']"));
        radio1.click();
        driver.findElement(By.name("websubmit")).click();
        
        
        //--------------------Login Page
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		Thread.sleep(2000);
//		driver.findElement(By.className("at4-close")).click();
//		Thread.sleep(2000);
        
        
        
        //-----------------------Forms page with xpath implementation
//		driver.findElement(By.xpath("//*[text()='Input Forms']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[text()='Simple Form Demo']")).click();
//		driver.findElement(By.linkText("/selenium-tutorials")).click();
//		driver.findElement(By.xpath("//*[text()='Selenium with Java']")).click();
        
        
        
        //------------------------Drop Down
//		Select dd = new Select(driver.findElement(By.id("select-demo")));
//		dd.selectByVisibleText("Sunday");
//		Thread.sleep(2000);
//		dd.selectByValue("Friday");
//		Thread.sleep(2000);
//		dd.selectByIndex(3);
//		Thread.sleep(2000);
        
        
//		----------------------------Multiple Drop Down
//		Select dd1 = new Select(driver.findElement(By.id("multi-select")));
//		dd1.selectByValue("California");
//		Thread.sleep(2000);
//		driver.findElement(By.id("printMe")).click();
//		Thread.sleep(2000);
//		dd1.selectByValue("Pennsylvania");
//		Thread.sleep(2000);
//		driver.findElement(By.id("printMe")).click();
//		Thread.sleep(2000);
		
	}
}
