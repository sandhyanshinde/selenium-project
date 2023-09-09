package webtesting;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {
	public static void main(String[] args) 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless");
		WebDriver driver=new ChromeDriver(option);
		System.out.println("Browser is open!");
		//System.out.println(driver.getTitle());
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Application is open!");
		System.out.println("to get same page title is"+driver.getCurrentUrl());
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		System.out.println(" get next page url"+driver.getCurrentUrl());
		
		/*ChromeDriver driver=new ChromeDriver();
		Capabilities cap=driver.getCapabilities();
		System.out.println(cap.getBrowserName());
		System.out.println(cap.getBrowserVersion());
		System.out.println(cap.getPlatformName());
            Map<String,Object>allcap=cap.asMap();
            System.out.println(allcap);*/
	}


}
