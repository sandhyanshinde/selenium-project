package webtesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		for(int i=1;i<=10;i++)
		{
		WebDriver newtab=driver.switchTo().newWindow(WindowType.TAB);
		newtab.get("https://www.facebook.com/login/");
		}
	    
  WebDriver newwindow=driver.switchTo().newWindow(WindowType.WINDOW);
  newwindow.get("https://www.amazon.com/");
	}

}
