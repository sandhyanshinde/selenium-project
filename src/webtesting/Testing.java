package webtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// open browser
   WebDriver driver=new ChromeDriver();
   //open website
   driver.get("https://www.orangehrm.com/");
   
  String acttitle= driver.getTitle();
  System.out.println("\n u r actual tiitle is  "+acttitle);
  if(acttitle.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
  {
	  System.out.println(" title is match.....test pass");
  }
  else
  {
	  System.out.println(" title is not match.....test fail");
  }
  
   String curl=driver.getCurrentUrl();
   System.out.println("current url is "+curl);
   if(curl.contains("https"))
   {
	   System.out.println(" yes its contains https protocol");
   }
   else
   {
	   System.out.println(" yes its contains http protocol");
   }
  
  driver.quit();
	}

}
