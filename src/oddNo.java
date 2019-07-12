import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class oddNo {


	public static void main(String[] args) throws InterruptedException, AWTException 
	{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Raji\\git\\julybatch\\julybatch\\julybatch\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.quit();
		}
					}
