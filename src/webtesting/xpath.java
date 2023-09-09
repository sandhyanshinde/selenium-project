package webtesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.goibibo.com/");
         driver.findElement(By.xpath("//span[@class=\'logSprite icClose\']")).click();
         driver.findElement(By.xpath("//div[@class=\'sc-12foipm-34 gmkrNR\'] //p[@class=\'sc-12foipm-27 bhYNaI fswWidgetPlaceholder\']")).click();
         driver.findElement(By.xpath("//input[@type=\'text\']")).sendKeys("n");
         List<WebElement>list1=driver.findElements(By.xpath("//ul[@id=\'autoSuggest-list\']//li//span[@class=\'autoCompleteTitle \']"));
         System.out.println("optionavailable in list of n "+list1.size());
         
         for(WebElement i:list1)
         {
        	System.out.println(i.getText());
         }
         
	}

}
