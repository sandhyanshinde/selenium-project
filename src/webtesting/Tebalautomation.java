package webtesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tebalautomation {

	public static void main(String[] args) {
		
	 	WebDriver driver=new ChromeDriver();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	driver.get("https://automationplayground.com/crm/customers.html?email-name=ksandhya97%40gmail.com&password-name=M%40sterPe0ple&submit-name=");
	 	
	 	System.out.println("******************all table heading********************************");
		//1.print all the heading
	 	List<WebElement> heding=driver.findElements(By.xpath("//table//thead//tr//th"));
	 	System.out.println("total no. of element in header "+heding.size());
	 	
	 	for(WebElement i:heding)
	 	{
	 		System.out.println(i.getText());
	 	}
	 	
	 	System.out.println("******************all table no of rows********************************\n");
		
	 	//2.no.of rows 
	 	int rows=driver.findElements(By.xpath("//table//tbody//tr")).size();
	 	System.out.println("print no. of rows in table " +rows);
	 	
	 	System.out.println("\n******************all table no.of coloumns********************************\n");
	 	//3.no.of Columns
	 	int colom=driver.findElements(By.xpath("//table//tbody//tr[1]//td")).size();
	 	System.out.println("print no. of coloumn in table " +colom);

	 	System.out.println("\n******************all table specific rows********************************\n");
	 	//4.print specific row
	 	
	 	List<WebElement>crow=driver.findElements(By.xpath("//tbody//tr[2]//td"));
	 	System.out.println("data present in one row"+ crow.size());
	 	for(WebElement i:crow)
	 	{
	 		System.out.println(i.getText());
	 	} 
	 	System.out.println("\n******************all table specific cooumn********************************");
	 	//5.print specific column
	 	List<WebElement>col1=driver.findElements(By.xpath("//table//tbody//tr//td[2]"));
	 	System.out.println("data present in one column"+ col1.size());
	 	for(WebElement i:col1)
	 	{
	 		System.out.println(i.getText());
	 	}
	 	
	 	
		//6.print all the data of table
	 	System.out.println("******************all tabledata********************************\n");

		List<WebElement>td=driver.findElements(By.xpath("//table//tbody//tr//td"));
	 	System.out.println("data present in one table"+ td.size());
	 	for(WebElement i:td)
	 	{
	 		System.out.println(i.getText());
	 	}
	}
	

	
	}


