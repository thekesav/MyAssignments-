package NewDay;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tamilMatrimony {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		driver.findElement(By.xpath("//select[@id='REGISTERED_BY']")).click();
		WebElement findElement = driver.findElement(By.id("REGISTERED_BY"));
		Select dropDown=new Select(findElement);
		dropDown.selectByVisibleText("Myself");
		driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("KESAV RAJ");
		driver.findElement(By.xpath("//input[@class='hp-gender']")).click();
		driver.findElement(By.xpath("(//select[@id='DOBDAY']/option)[3]")).click();
		driver.findElement(By.xpath("(//select[@id='DOBMONTH']/option)[6]")).click();
		driver.findElement(By.xpath("(//select[@id='DOBYEAR']/option)[5]")).click();
		
		driver.findElement(By.xpath("(//select[@id='RELIGION']/option)[2]")).click();		
		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='MOTHERTONGUE']"));
	      Select dropDown2=new Select(findElement2);
	      dropDown2.selectByVisibleText("Tamil");
	      WebElement findElement3 = driver.findElement(By.xpath("//select[@id='CASTE_NORMAL']"));
		Select dropDown3= new Select(findElement3);
		dropDown3.selectByVisibleText(" Mudaliyar ");
		
		WebElement findElement4 = driver.findElement(By.xpath("//select[@name='COUNTRY']"));
		Select dropDown4 = new Select(findElement4);
		dropDown4.selectByVisibleText("India");
		
	   driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("7200663603");
	   driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("kesavraj63603@gmail.com");
	   driver.close();
		
		
		
	}
}
