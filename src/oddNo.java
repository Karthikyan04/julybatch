import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class oddNo {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Raji\\git\\julybatch\\julybatch\\julybatch\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
		WebElement r=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		r.sendKeys("rajechandran777@gmail.com");
		WebElement r1=driver.findElement(By.xpath("//input[@type='password']"));
		r1.sendKeys("Raje@143");
		WebElement r2=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		r2.click();
		}
	
}
