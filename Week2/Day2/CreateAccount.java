package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
					
		//Load the url -get
		driver.get("http://leaftaps.com/opentaps/control/main");
			
	//maximize the browser
	driver.manage().window().maximize();
			
	//add implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
	//Enter the username
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			
	//Enter the password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
			
	//Click the Login Button
	driver.findElement(By.className("decorativeSubmit")).click();

	// Click on the CRMSFA link
	driver.findElement(By.partialLinkText("CRM")).click();

	// Click on the Accounts link text
	driver.findElement(By.linkText("Accounts")).click();
	
	// Click on the create Accounts link text
	driver.findElement(By.linkText("Create Account")).click();
	
	//Enter the account name
	driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
				
	//Select "ComputerSoftware" as the industry.
	WebElement industryElement =driver.findElement(By.name("industryEnumId"));
	Select dropdown = new Select(industryElement);
	dropdown.selectByIndex(3);
	
//	- Select "S-Corporation" as ownership using SelectByVisibleText.
	WebElement ownershipElement =driver.findElement(By.name("ownershipEnumId"));
	Select ownershipdropdown = new Select(ownershipElement);
	ownershipdropdown.selectByVisibleText("S-Corporation");
	
//	- Select "Employee" as the source using SelectByValue.
	WebElement sourceElement =driver.findElement(By.id("dataSourceId"));
	Select sourcedropdown = new Select(sourceElement);
	sourcedropdown.selectByValue("LEAD_EMPLOYEE");
	
//	- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
	WebElement marketingElement =driver.findElement(By.id("marketingCampaignId"));
	Select marketingdropdown = new Select(marketingElement);
	marketingdropdown.selectByIndex(6);
	
//	- Select "Texas" as the state/province using SelectByValue.
	WebElement stateElement =driver.findElement(By.id("generalStateProvinceGeoId"));
	Select statedropdown = new Select(stateElement);
	statedropdown.selectByValue("TX");

//	- Click the "Create Account" button.
	driver.findElement(By.className("smallSubmit")).click();	

//	- Verify that the account name is displayed correctly.
	WebElement verifyNameElement = driver.findElement(By.id("accountName"));
	String verifyText = verifyNameElement.getText();
	System.out.println(verifyText);
	
//	- Close the browser window.
			driver.quit();

}
	}
