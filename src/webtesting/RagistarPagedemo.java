package webtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RagistarPagedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		
	    driver.findElement(By.cssSelector("span.caret")).click();
	    
	    driver.findElement(By.linkText("Register")).click();
	    
	    driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Sandhya");
	    
	    driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("shinde");
	    
	    driver.findElement(By.cssSelector("input[type='email']")).sendKeys("ksandhya97@gmail.com");
	    
	    driver.findElement(By.cssSelector("input[id='input-telephone']")).sendKeys("8108690675");
	    
	    driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Admin@123");
	    
	    driver.findElement(By.cssSelector("input[id='input-confirm']")).sendKeys("Admin@123");
	    
	    driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	    
	    driver.findElement(By.cssSelector("input.btn-primary")).click();
	    
	   // driver.close();
	}

}
