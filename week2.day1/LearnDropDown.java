package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {
	public static void main(String args[])
	{
		ChromeDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//load the url
		driver.get("https://leafground.com/select.xhtml");
		//find the element
		WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
		//create object for the select class
		Select drop= new Select(tool);
		//select index
		drop.selectByIndex(1); //or
		//select by value
		drop.selectByValue("ui-selectonemenu");  //or
		//select by visibleText
		drop.selectByVisibleText("Playwright");
		
	}

}
