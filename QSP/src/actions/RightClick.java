package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		WebElement linkText=driver.findElement(By.xpath("//a[Text()='actiTIME Inc.']"));
		 Actions  act=new Actions(driver);
		 act.contextClick(linkText).perform();
		 Robot r= new Robot();
		 r.keyPress(KeyEvent.VK_T);
		 
	}
}
