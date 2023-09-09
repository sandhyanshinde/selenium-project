package webtesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookdropdown {
	
	public static void Reuse(WebElement elm,String value)
	{
		Select s1=new Select(elm);
		
		System.out.println("is all list is selected?"+s1.isMultiple());
		
		/*s1.selectByIndex(4);
		Thread.sleep(2000);
		s1.selectByVisibleText("7");
		Thread.sleep(2000);
	    s1.selectByValue("2");*/
	    List<WebElement>l1=s1.getOptions();
	    System.out.println("total availabel option in day dropdown list  "+l1.size());
	    //String exp="9";
	    for(WebElement i:l1)
	    {
	    	System.out.println("show the all day "+i.getText());
	    	if(i.getText().equals(value))
	    			{
	    		       
	    		      i.click();
	    		      break;
	    			}
	    }
	    
		
	}

	public static void main(String[] args) throws InterruptedException {

		
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.linkText("Create new account")).click();
	
	WebElement elm=driver.findElement(By.id("day"));
	Reuse(elm,"27");
	WebElement elm2=driver.findElement(By.id("month"));
	Reuse(elm2,"Jan");
	WebElement elm3=driver.findElement(By.id("year"));
	Reuse(elm3,"2010");
	
    
	}
}
