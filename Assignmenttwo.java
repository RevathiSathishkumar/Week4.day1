package week4.day1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmenttwo {
	
	public static void main(String[] args) {
		     //Open a Browser
		
				WebDriverManager.chromedriver().setup();
		        ChromeDriver driver=new ChromeDriver();
		        
		    //open a URL
		        
		        driver.get("https://html.com/tags/table/");
		        driver.manage().window().maximize();
		        
		   // Get the count of number of rows
		        
		        WebElement elementTable= driver.findElement(By.xpath("//div[@class='related-pages']"));
		       
		        List<WebElement> rows =elementTable.findElements(By.tagName("tr"));
		      
		        int rowsize= rows.size();
		      
		        System.out.println(rowsize);
		    
		      
	 // Get the count of number of colums
		     
		       List<WebElement> cols =rows.get(1).findElements(By.tagName("td"));
		     	  	  
		       System.out.println(cols.size());
	}

}
