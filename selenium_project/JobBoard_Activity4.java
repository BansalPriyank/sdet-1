import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JobBoard_Activity4 {
	public static void main(String[] args) {
		WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Projects\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
         driver.get("https://alchemy.hguy.co/jobs");
         driver.manage().window().maximize();
         String secondheading = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/h2")).getText();
         System.out.println("heading is :"+secondheading);
         if (secondheading.equals("Quia quis non"))
         {
         	driver.close();
         }
         	
         else
         {
         	System.out.println( "Heading is not valid");
         	}
	}}


