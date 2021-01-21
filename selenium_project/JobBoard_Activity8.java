import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JobBoard_Activity8
{
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver;
         System.setProperty("webdriver.chrome.driver", "C:\\Selenium Projects\\chromedriver_win32//chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://alchemy.hguy.co/jobs/wp-admin");
         driver.manage().window().maximize();
         driver.findElement(By.id("user_login")).sendKeys("root");
         Thread.sleep(3000);
         driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
         Thread.sleep(3000);
         driver.findElement(By.id("wp-submit")).click();
         Thread.sleep(3000);
         String title = driver.getTitle();
         System.out.println("Page title is: " + title);
        if (title.equals("Dashboard ‹ Alchemy Jobs — WordPress")) {
        	driver.close();
        }
        	
        else
        {
        	System.out.println("User is not logged in");
        	}     
         
	}}


