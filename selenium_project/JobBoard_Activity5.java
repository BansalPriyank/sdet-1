import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JobBoard_Activity5 {
	public static void main(String[] args) {
		 WebDriver driver;
         System.setProperty("webdriver.chrome.driver", "C:\\Selenium Projects\\chromedriver_win32//chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://alchemy.hguy.co/jobs");
         driver.manage().window().maximize();
         driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();
         String title = driver.getTitle();
         System.out.println("Page title is: " + title);
         if (title.equals("Jobs – Alchemy Jobs")) 
         {
        	driver.close();
         }
        	
         else
         {
         System.out.println("Title is not valid");
        	}
	}}


