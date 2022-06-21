package StepDefinations;

import org.openqa.selenium.WebDriver;

import POM.AddnewclientPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class Addnewclient {

	WebDriver driver;
	AddnewclientPage client;
	
	@Given("Select client tab")
	public void select_client_tab() {
		
	   client = new AddnewclientPage(Login.driver);
	   client.Clients.click();
	}

	@Then("Click on Add new client button")
	public void click_on_add_new_client_button() {
		client.Addnewclientbutton.click();	   
	}
	
	@And("Pass the client First name")
	public void pass_the_client_first_name() {
		// System.out.println("First name is entering");
		Assert.assertTrue("First name is displaying", client.firstname.isDisplayed());
	   client.firstname.sendKeys("Hey");
	}
	
	@And("Pass client Last name")
	public void pass_client_last_name() {
	   client.lastname.sendKeys("John");
	}

	@And("Click on Email Checkbox")
	public void enter_click_on_email_checkbox() {
	   client.EmailCheckbox.click();
	}

	@And("Click on Save button")
	public void click_on_save_button() {
	   client.Savebutton.click();
	}

	@And("Click on Ok button in the warining popup")
	public void click_on_ok_button_to_create_client() {
	    client.Okbutton.click();
	}

	@Then("User should navigate to client dashboard")
	public void client_should_navigate_to_client_dashboard() {
	    System.out.println("User is navigate to CLIENT DASHBOARD");
	}
}
