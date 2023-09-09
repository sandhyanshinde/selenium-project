package webtesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderAutomationforRedbus {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//div//span[@class=\'dateText\']")).click();
		//Expectation click
		
		String date="22";
		String month="Jul";
		String year="2024";
		while(true)
		{
		String text= driver.findElement(By.xpath("//div[contains(@class,'DayNavigator__Icon')][2]")).getText();
		System.out.println(text);
		String arr[]=text.split(" ");
		String mon=text.split(" ")[0];
		String yer=text.split(" ")[1];
		
		if(mon.contains(month) && yer.contains(year))
         {
        	 break;
	
         }
		else
		{
			driver.findElement(By.xpath("//div[contains(@class,'DayNavigator__Icon')][3]")).click();
		}
		}
		
		List<WebElement> alldates=driver.findElements(By.xpath("//span[contains(@class,'DayTiles__CalendarDays')]"));
		for(WebElement i:alldates) 
		{
			if(i.getText().contains(date))
			{
				i.click();
				break;
			}
		}
		 driver.close();
		// date selection
		
		
		
		/*for(String i:arr)
		{
		
			System.out.println(i);
		
		}
		System.out.println(text.split(" ")[0]);
		
		//System.out.println(text.split(" ")[1]);*/
		
		
		
				

	}

}
