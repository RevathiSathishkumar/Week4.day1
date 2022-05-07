package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentOne {

	public static void main(String[] args) {
		
		//Open a Browser
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        
        //open a URL
        
        driver.get("https://www.chittorgarh.com/");
        driver.manage().window().maximize();
        
        //Click on stock market
        driver.findElement(By.id("navbtn_stockmarket")).click();
        
        //Click on NSE bulk Deals
        driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
        
        //Get all the Security names
        
        //first find the table name
       WebElement elementTable= driver.findElement(By.xpath("//div[@class='table-responsive']"));
      
       List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
       
       for(int i=1;i<rows.size();i++)
       {
    	   
    	   List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
    	   
    	   System.out.println(cols.get(3).getText());
       }     
	}

}
