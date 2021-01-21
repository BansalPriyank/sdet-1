import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JobBoard_Activity2 {
	public static void main(String[] args) {
		WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Projects\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
         driver.get("https://alchemy.hguy.co/jobs");
         driver.manage().window().maximize();
         String searchheading = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/header/h1")).getText();
         System.out.print("heading is"+searchheading);
         if (searchheading.equals("Welcome to Alchemy Jobs")) {
         	driver.close();
         }
         	
         else
         {
         	System.out.println("Heading is not valid");
         	}
	}}


