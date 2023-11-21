package NewDay;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookNew {
	
	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.get("https://www.facebook.com/'");
	
	driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("KESAV RAJ");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("NARAYAN");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7200663603");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kesav@123123");
	driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("14");
	driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Jan");
	driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("2000");
	driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
}
}