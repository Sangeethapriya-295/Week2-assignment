package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sangeethapriya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Poorana Ramachandran");
		WebElement tool = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop=new Select(tool);
		drop.selectByVisibleText("Partner");
	    WebElement tool1 = driver.findElement(By.id("createLeadForm_marketingCampaignId")); 
		Select drop1 = new Select(tool1);
		drop1.selectByValue("9001");
		WebElement tool2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop2 = new Select(tool2);
		drop2.selectByIndex(5);
		WebElement tool3 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop3 = new Select(tool3);
		drop3.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		String title1 = driver.getTitle(); 
		System.out.println("title1");

	}

}
