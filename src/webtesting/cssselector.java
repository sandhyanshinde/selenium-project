package webtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   //usernametext
		    driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		    //password text
		    driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
		    //click on login button
		    driver.findElement(By.cssSelector("button.oxd-button")).click();
		    //log out
		    driver.findElement(By.cssSelector("img.oxd-userdropdown-img")).click();
		    driver.findElement(By.linkText("Logout")).click();
		    //driver.close();
			}

	
 

	}


 