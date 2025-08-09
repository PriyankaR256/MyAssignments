package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CreateLeadAssignment {

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

		// Click on the Leads link
		driver.findElement(By.linkText("Leads")).click();

		// Click on the Create Lead link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// Enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");

		// Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		
		// Enter the title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("first_selenium_assignment");
		
		// Click on the Create lead button
		driver.findElement(By.name("submitButton")).click();

		// to verify the title is displayed correctly
		WebElement spanElement = driver.findElement(By.id("viewLead_generalProfTitle_sp"));
			
		String spanText = spanElement.getText();
		System.out.println(spanText);
		
		//close the browser
		driver.quit();
	
	}

}




