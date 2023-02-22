package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

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
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sangeetha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Poorana Ramachandran");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rasangeetha6@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String Title = driver.getTitle();
		System.out.println("Title");
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTest");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sang");
		driver.findElement(By.name("submitButton")).click();
		String title2 = driver.getTitle();
		System.out.println("Title2");
		
		
		
		
		

	}

}
