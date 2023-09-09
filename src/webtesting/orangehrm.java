package webtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   //usernametext
    driver.findElement(By.name("username")).sendKeys("Admin");
    //password text
    driver.findElement(By.name("password")).sendKeys("admin123");
    //click on login button
    driver.findElement(By.className("oxd-button")).click();
    //log out
    driver.findElement(By.className("oxd-userdropdown-img")).click();
    driver.findElement(By.linkText("Logout")).click();
    //driver.close();
	}

}
