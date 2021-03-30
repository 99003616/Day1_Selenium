import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day2_Selenium {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to selenium basic training");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		// Css selector Orange HRM's
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/maintenance/purgeEmployee");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		Thread.sleep(2000);
//		driver.findElement(By.id("btnLogin")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("confirm_password")).sendKeys("admin123");
//		driver.findElement(By.cssSelector("input[value='Verify']")).click();
		
//		driver.findElement(By.xpath("//*[text()='Leave']")).click();
//		driver.findElement(By.xpath("//*[text()='Apply']")).click();
		
		
		
		// For Hovering We can use Actions   ------ Apply Leave 
//		WebElement ele=driver.findElement(By.linkText("Leave"));
//		Actions act= new Actions(driver);
//		act.moveToElement(ele).build().perform();
//		driver.findElement(By.xpath("//*[text()='Apply']")).click();
//		
//		Select dd = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
//		dd.selectByVisibleText("CAN - Bereavement");
//		Thread.sleep(2000);
//		driver.findElement(By.id("applyleave_txtFromDate")).click();
//		driver.findElement(By.xpath("//*[text() ='12']")).click();
//		driver.findElement(By.id("applyleave_txtToDate")).click();
//		driver.findElement(By.xpath("//*[text() ='15']")).click();
//		driver.findElement(By.id("applyleave_txtComment")).sendKeys("Purpose of visit - Meeting Parents");
//		Thread.sleep(2000);
//		driver.findElement(By.id("applyBtn")).click();
		
		//  Entitlements 
//		WebElement ele=driver.findElement(By.linkText("Leave"));
//		Actions act= new Actions(driver);
//		act.moveToElement(ele).build().perform();
//		WebElement ele1=driver.findElement(By.linkText("Entitlements"));
//		Actions act1= new Actions(driver);
//		act.moveToElement(ele1).build().perform();
//		driver.findElement(By.xpath("//*[text()='Employee Entitlements']")).click();
		
		
		//ICICI
		driver.get("https://loan.icicibank.com/asset-portal-all/check-eligibility?loanType=al&WT.mc_id=Desk_OAPN_cms_cl_index_btn_applynow");
		driver.manage().window().maximize();
		driver.findElement(By.id("carRelspan")).click();
		driver.findElement(By.xpath("//*[text()='New Car Loan']")).click();
		driver.findElement(By.id("MOBILENUM")).sendKeys("9560188888");
		driver.findElement(By.id("CUSTFIRSTNAME")).sendKeys("Manzar");
		driver.findElement(By.id("CUSTLASTNAME")).sendKeys("Hussain");
		Thread.sleep(500);
		driver.findElement(By.id("CUSTCOMMUCITY")).sendKeys("jaipur");
		Thread.sleep(500);
		driver.findElement(By.id("CUSTCOMMUCITY")).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		driver.findElement(By.id("CUSTCOMMUCITY")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("residancespan")).click();
		driver.findElement(By.xpath("//*[text()='Owned']")).click();
		driver.findElement(By.id("yrspan_mvce")).click();
		driver.findElement(By.xpath("//*[text()='2018']")).click();
		driver.findElement(By.id("mnthspan")).click();
		driver.findElement(By.xpath("//*[text()='Jan']")).click();
		driver.findElement(By.id("DATEOFBIRTH")).sendKeys("29091998");
		Thread.sleep(500);
//		WebElement radio1 = driver.findElement(By.cssSelector("input[value='No']"));
//        radio1.click();
        driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys("Honda City");
        Thread.sleep(500);
        Thread.sleep(500);
        driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys(Keys.ENTER);
        Thread.sleep(500);
        driver.findElement(By.id("CITY_NAME")).sendKeys("Mumbai");
        Thread.sleep(500);
        driver.findElement(By.id("CITY_NAME")).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		driver.findElement(By.id("CITY_NAME")).sendKeys(Keys.ENTER);
        Thread.sleep(500);
        driver.findElement(By.id("CAR_MODEL_PRIZE")).click();
        Thread.sleep(500);
        driver.findElement(By.id("selSalspan")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[text()='Self Employed Professional']")).click();
        Thread.sleep(500);
        
        driver.findElement(By.id("NAME_OF_BUSSINESS")).sendKeys("Jk Jewellers");
		Thread.sleep(500);
		driver.findElement(By.id("Nobspan")).click();
		driver.findElement(By.xpath("//*[text()='MANUFACTURING']")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("yrspan_sdb")).click();
	    driver.findElement(By.linkText("2017")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("mnthspan_1")).click();
	    driver.findElement(By.linkText("Jan")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("totalworkexp_1")).click();
	    driver.findElement(By.linkText("3")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("LATEST_Y_GROSS_T_INC")).sendKeys("1200000");
	    Thread.sleep(500);
        driver.findElement(By.id("TOTAL_CURR_EMI_PAID")).sendKeys("100000");
//        Thread.sleep(500);
//        WebElement radio2 = driver.findElement(By.id("relwithBankNo"));
//        radio2.click();
        Thread.sleep(500);
        driver.findElement(By.id("eligibility-btn")).click();
        


		
		// Slider
		//-----------------------Emi Calculator
//		driver.get("https://emicalculator.net/");
//		WebElement ele=driver.findElement(By.id("loanamountslider"));
//		Actions act= new Actions(driver);
//		act.dragAndDropBy(ele,200,0).build().perform();
//		
//		WebElement ele1=driver.findElement(By.id("loaninterestslider"));
//		Actions act1= new Actions(driver);
//		act.dragAndDropBy(ele1,20,0).build().perform();
//		
//		WebElement ele2=driver.findElement(By.id("loantermslider"));
//		Actions act2= new Actions(driver);
//		act.dragAndDropBy(ele2,50,0).build().perform();
//		
		//-------------------------Drag and drop Ex 
		
//		driver.get("http://demo.guru99.com/test/drag_drop.html");
//		WebElement ele1=driver.findElement(By.id("fourth"));
//		WebElement ele2=driver.findElement(By.id("amt8"));
//		Actions act1= new Actions(driver);
//		act1.dragAndDrop(ele1,ele2).build().perform();
//		Thread.sleep(3000);
		
	}

}
