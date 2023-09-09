package webtesting;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {
	public static void Samecode(Alert alt)
	{
	System.out.println("alert text is:  "+alt.getText());
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//button[1]")).click();
		
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();	
		Samecode(alt);
		alt.accept();
		 driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
	     Alert alt1=driver.switchTo().alert();
	     Samecode(alt);
	     alt1.dismiss();
	     
	    driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
	     Alert alt2=driver.switchTo().alert();
	    Samecode(alt);
	 	alt2.sendKeys("hi sandhya");
	 	alt2.accept();
	 	driver.close();
	     
	}

}
