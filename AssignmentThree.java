package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentThree {
	
	public static void main(String[] args) {
		
		
		 //Open a Browser
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        
         //open a URL
        
        driver.get("https://html.com/tags/table/");
        driver.manage().window().maximize();
        
        //You have to print the respective values based on given Library
        
        WebElement Elementtable = driver.findElement(By.xpath("//div[@class='render']"));
        
        List<WebElement> rows = Elementtable.findElements(By.tagName("tr"));
        
        for(int i=1;i<rows.size();i++)
        {
        	List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
        	System.out.println(cols.get(0).getText());
        }
	}

}
