import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	

	@Given("I will launch chrome browser")
	public void i_will_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
	}
	
	@Given("I enter the URl")
	public void i_enter_the_u_rl() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
	}
	
	@When("I enter the username")
	public void i_enter_the_username() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
	}
	
	@When("I enter the password")
	public void i_enter_the_password() {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
	}
	
	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		driver.findElement(By.className("at4-close")).click();
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
	}
	
	@Then("I should see home screen")
	public void i_should_see_home_screen() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
	}
	
	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
	}
	
	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
	}
	
	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException()/;
	}
	
	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
	}
	
	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();/
	}
	
	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
	}

}
