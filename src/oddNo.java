
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class oddNo {

	public  void main(String args[]) 
	{
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\git\\julybatch\\driver\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			
			driver.quit();
		}
	
}
