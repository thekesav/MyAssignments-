package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications","start-maximized");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		driver.findElement(By.linkText(("CRM/SFA"))).click();
		driver.findElement(By.linkText(("Create Contact"))).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		
		 driver.findElement(By.xpath("//span[text()='From Contact']/following::a")).click();
		Set<String> childWindow = driver.getWindowHandles();
		List<String> openedWindow=new ArrayList<String>(childWindow);
		driver.switchTo().window(openedWindow.get(1));
		driver.findElement(By.xpath("//div[contains(@class,'grid3-col-firstName')]/following::a")).click();
		
		Thread.sleep(3000);
		driver.switchTo().window(openedWindow.get(0));
		String title=driver.getTitle();
		System.out.println("title"+title);
		
		driver.findElement(By.xpath("//span[text()='To Contact']/following::a")).click();
		 
		Set<String> childWindow1 = driver.getWindowHandles();
		List<String> openedWindow1=new ArrayList<String>(childWindow1);
		driver.switchTo().window(openedWindow1.get(1));
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[contains(@class,'grid3-col-firstName')]/following::a[4]")).click();

		driver.switchTo().window(openedWindow.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.accept();
		
	}
	

}
