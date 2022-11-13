package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead 
{

	public static void main(String[] args) 
	{
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sample test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gopi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krisna");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("Week2 Day1 Daily Assignments");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Gk@gmail.com");
		WebElement stateDD = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select DD = new Select(stateDD);
		DD.selectByVisibleText("Nevada");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("SeleniumDay1");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.clear();
		firstName.sendKeys("NewGK");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		
		driver.close();
	}
}
