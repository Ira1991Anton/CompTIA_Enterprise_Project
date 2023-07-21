package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserUtils;
import utilities.DataReader;
import utilities.Driver;


public class SettingsSteps {
	
BrowserUtils utils = new BrowserUtils();

                       
                     //Maggie Brown Email SetUp
    
        @Given("As a user I am on the home screen")
	public void as_a_user_i_am_on_the_home_screen() {
	    Driver.getDriver().get(DataReader.getProperty("URL"));
	   Assert.assertTrue(
	    		Driver.getDriver().findElement(
	    			By.xpath("//div[@id='BreadcrumbButton.Grid.StackPanel.contentPresenter.TextBlock']"))
	    		.isDisplayed());
	    }

	@When("I set the user email settings to SSL")
	public void i_set_the_user_email_settings_to_ssl() throws InterruptedException {
		//click on settings
		Thread.sleep(1000);
		utils.moveToElement(Driver.getDriver().findElement(By.id("wpDesktop.DesktopIcon15.Grid.gContent.imImage")));
		utils.doubleClickWithActionsClass(Driver.getDriver().findElement(By.id("wpDesktop.DesktopIcon15.Grid.gContent.imImage")));
		// click on mail, calendar
		Thread.sleep(1000);
		utils.waitUntilElementVisible(Driver.getDriver().findElement(By.id("siMailContactsCalendars.Grid.tbText")));
		utils.moveToElement(Driver.getDriver().findElement(By.id("siMailContactsCalendars.Grid.tbText")));
		utils.doubleClickWithActionsClass(Driver.getDriver().findElement(By.id("siMailContactsCalendars.Grid.imImage")));
		// click on maggie
		Thread.sleep(1000);
		utils.waitUntilElementVisible(Driver.getDriver().findElement(By.xpath("//div[text()='Maggie Brown']")));
		utils.doubleClickWithActionsClass(Driver.getDriver().findElement(By.xpath("//div[text()='Maggie Brown']")));
		
		// wait and click on email
		
		utils.waitUntilElementVisible(Driver.getDriver().findElement(By.xpath("//div[text()='Account']")));
		utils.doubleClickWithActionsClass(Driver.getDriver().findElement(By.xpath("//div[text()='Account']")));
		
		
		// wait and click on advanced 
		Thread.sleep(1000);
		utils.waitUntilElementVisible(Driver.getDriver().findElement(By.xpath("//div[text()='Advanced']")));
		utils.doubleClickWithActionsClass(Driver.getDriver().findElement(By.xpath("//div[text()='Advanced']")));
		
		// wait and click on switch toggle
		
		//utils.waitUntilElementVisible(Driver.getDriver().findElement(By.id("siUseSSL.Grid.tbOnOff.Grid.SwitchRoot")));
		utils.waitUntilElementToBeClickable(Driver.getDriver().findElement(By.id("siUseSSL.Grid.tbOnOff.Grid.SwitchRoot.Canvas.SwitchThumb")));
		utils.doubleClickWithActionsClass(Driver.getDriver().findElement(By.xpath("//div[@id='siUseSSL.Grid.tbOnOff.Grid.SwitchRoot.Canvas.SwitchThumb']")));
		Thread.sleep(1000);
		
	}

	@Then("The sever port should be set to {int}")
	public void the_sever_port_should_be_set_to(int portnum) {
	    // wait and get text of the port and verify
		utils.waitUntilElementVisible(Driver.getDriver().findElement(By.id("tbServerPort")));
		utils.moveToElement(Driver.getDriver().findElement(By.id("tbServerPort")));
		String port = Driver.getDriver().findElement(By.id("tbServerPort")).getText();
		System.out.println(port);
		Assert.assertEquals(Integer.parseInt(port), portnum);
		
	}

	@Then("I select Account at the top.")
	public void i_select_account_at_the_top() {
		utils.waitUntilElementVisible(Driver.getDriver().findElement(By.xpath("//div[text()='Account']")));
		utils.doubleClickWithActionsClass(Driver.getDriver().findElement(By.xpath("//div[text()='Account']")));
	}

	@Then("I Click Done")
	public void i_click_done() {
		utils.waitUntilElementVisible(Driver.getDriver().findElement(By.xpath("//div[text()='Done']")));
		utils.doubleClickWithActionsClass(Driver.getDriver().findElement(By.xpath("//div[text()='Done']")));
	}
	
	      
	
	            //CorpNet-Wireless connection 
	
	}
