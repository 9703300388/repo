package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement src = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		Thread.sleep(1000);
		WebElement des = driver.findElement(By.xpath("//h1[text()='Block 2']"));
		 Actions act = new Actions(driver);
		 Thread.sleep(1000);
		 act.dragAndDrop(des,src).perform();
		 Thread.sleep(1000);
		 driver.close();
		
	}

}
