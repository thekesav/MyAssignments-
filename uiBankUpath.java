package NewDay;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class uiBankUpath {
	
	public static void main(String[] args) {
		
		

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kesavraj63603@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Kesav124");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("KESAV RAJ");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("NARAYAN");
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("R B");
		WebElement findElement = driver.findElement(By.xpath("//select[@id='sex']"));
		Select dropDown = new Select(findElement);
		dropDown.selectByVisibleText("Male");
		WebElement findElement1 = driver.findElement(By.xpath("//select[@id='title']"));
		Select dropDown1 = new Select(findElement1);
		dropDown1.selectByVisibleText("Mr");
		WebElement findElement2 = driver.findElement(By.xpath("//select[@id='employmentStatus']"));
		Select dropDown2 = new Select(findElement2);
		dropDown2.selectByVisibleText("Full-time");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("thekesav");
		
		driver.close();
		
		
	}

}
