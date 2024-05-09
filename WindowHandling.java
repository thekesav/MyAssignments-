package Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//enter username as Demosalesmanager
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				//enter the password as crmsfa
				driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
				//to login
				driver.findElement(By.className("decorativeSubmit")).click();
				String text = driver.findElement(By.tagName("h2")).getText();
				System.out.println(text);
				//System.out.println(text);
				//driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.partialLinkText("CRM")).click();
		        
				driver.findElement(By.linkText("Contacts")).click();
				
				driver.findElement(By.linkText("Merge Contacts")).click();
				
				//click on from contact
				driver.findElement(By.xpath("//span[text()='From Contact']/following::img")).click();
				
				//to get the window handles
				Set<String> childWindow = driver.getWindowHandles();
				List<String> OpenWindow=new ArrayList<String>(childWindow);
				//move the control to child window
				driver.switchTo().window(OpenWindow.get(1));
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
				//again move the control to parent window
				driver.switchTo().window(OpenWindow.get(0));
				//click on to contact
		        driver.findElement(By.xpath("//span[@class='requiredField']/following::img[2]")).click();
		        //to get the window handles
		        Set<String> childWindow1 = driver.getWindowHandles();
				List<String> OpenWindow1=new ArrayList<String>(childWindow1);
				//move the control to child window 2
				driver.switchTo().window(OpenWindow1.get(1));
				
				//click on any resulting lead
				driver.findElement(By.xpath("//a[text()='11238']")).click();
				driver.switchTo().window(OpenWindow1.get(0));
				
				//merge
				driver.findElement(By.xpath("//a[text()='Merge']")).click();
				//alert
				driver.switchTo().alert().accept();
				
				
	

}
}
