//WA Script to print context of the listbox in sorted order without any duplicate options(without any repuatation)
package Tilak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sortoptions1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Tilak/Desktop/automate.html");
		WebElement mtrLB = driver.findElement(By.id("mtr"));
		Select select=new Select(mtrLB);
	    List<WebElement> allOptions = select.getOptions();
	    Set<String> allText = new TreeSet<String>();
	    
	    for(WebElement option:allOptions) {
	    	String text=option.getText();
	    	allText.add(text);
	    }
	    for(String text:allText) {
	    	System.out.println(text);
	    	
	    }
	    driver.close();  
	    
	}


}
