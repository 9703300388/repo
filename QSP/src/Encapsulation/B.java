package Encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://localhost/login.do");
		 A a1=new A(driver);
		 a1.setUserName();
	}
}
