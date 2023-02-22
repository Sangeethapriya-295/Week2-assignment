package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumBasic {

	public static void main(String args[]) {
		//set the path
		ChromeDriver driver = new ChromeDriver();
		//load the url
		driver.get(("http://leaftaps.com/opentaps/control/login"));
		//Enter login
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		//Enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//get the title of the page
		String title1=driver.getTitle();
		System.out.println(title1);
		//click crm/sfa
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//click lead
		driver.findElement(By.linkText("Leads")).click();
		//click createlead
		driver.findElement(By.linkText("Create Lead")).click();
		//enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sangeethapriya");
		//enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Poorana Ramachandran");
		//get text method
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
	}
	

}
