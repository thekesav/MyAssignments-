package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		WebElement MensFashion = driver.findElement(By.xpath("//span[@class='catText'][1]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(MensFashion).perform();
		//click on sports shoes
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		 //Get the count of the sports shoes
			String count = driver.findElement(By.xpath("//h1[contains(text(),'Sports Shoes for Men')]/following::span"))
					.getText();
			
			System.out.println("Total count of sports shoes: " + convertToInt(count));
			
        //Click Training shoes
			driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
			
       // Sort by Low to High
			driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
			driver.findElement(By.xpath("(//ul[@class='sort-value']/li)[2]")).click();
			
			 //Check if the items displayed are sorted correctly
			
			//Select the price range (900-1200)
			WebElement fromValue = driver.findElement(By.name("fromVal"));
			fromValue.clear();
			fromValue.sendKeys("400");
			
			WebElement toValue = driver.findElement(By.name("toVal"));
			toValue.clear();
			toValue.sendKeys("1200");
			driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
			
			//Filter with color Navy 
			Thread.sleep(5000);
			driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
			
		 //verify the all applied filters 

			List<WebElement> appliedFilters = driver.findElements(By.xpath("//div[@class='navFiltersPill']"));
			for (int i = 0; i < appliedFilters.size(); i++) {
			System.out.println(appliedFilters.get(i).getText());
			}
			 //Mouse Hover on first resulting Training shoes
			Actions a = new Actions(driver);
			WebElement ele = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
			a.moveToElement(ele).perform();
			
			// click QuickView button
			driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
			
		//Print the cost and the discount percentage
			System.out.println("Cost: "+driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText());
			System.out.println("Discount: "+driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText());
			
		// Take the snapshot of the shoes.
			
		 //Close the current window
	        driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
	        
           //Close the main window
			driver.close();
	}

	public static int convertToInt(String a) {
		String replaceAll = a.replaceAll("\\D", "");
		int parseInt = Integer.parseInt(replaceAll);
		return parseInt ;
	}
	

	}
		
		
	


