package webtesting;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newwindowortab {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	String pid=driver.getWindowHandle();
	System.out.println(pid);
	Thread.sleep(2000);
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	Set<String>allwindows=driver.getWindowHandles();
	System.out.println(allwindows);
	for(String chilid:allwindows)
	{
		if(!pid.equals(chilid))
		{
			driver.switchTo().window(chilid);
		}
	}
	driver.findElement(By.name("EmailHomePage")).sendKeys("sandhya@gmail.com");
	Thread.sleep(3000);
	driver.close();
	driver.switchTo().window(pid);
	driver.findElement(By.name("username")).sendKeys("Admin");
	
		
	}
	
}
     