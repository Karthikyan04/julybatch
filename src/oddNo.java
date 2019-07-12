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
		WebElement ra=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		ra.sendKeys("rajechandran777@gmail.com");
		WebElement r1=driver.findElement(By.xpath("//input[@type='password']"));
		r1.sendKeys("Raje@143");
		WebElement r2=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		r2.click();
			driver.manage().window().maximize();
		    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles");
		    Robot r = new Robot();
		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			List<WebElement> mob = new ArrayList<>();
					mob = driver.findElements(By.className("_3wU53n"));
					for (WebElement x : mob) {
						System.out.println("Mobile Names");
						
						String text = x.getText();	
						System.out.println(text);
					}
					int s = mob.size();
					System.out.println(s);
					driver.quit();
					
		}}
