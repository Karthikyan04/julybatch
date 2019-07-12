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
	public static void main(String[] args) throws AWTException	{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\julybatch\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/search?q=Mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
		   Robot r1 = new Robot();
		  driver.findElement(By.xpath("//div[text()='Redmi Note 7S (Ruby Red, 64 GB)']")).click();
		    r1.keyPress(KeyEvent.VK_ENTER);
		    r1.keyRelease(KeyEvent.VK_ENTER);
	}
}