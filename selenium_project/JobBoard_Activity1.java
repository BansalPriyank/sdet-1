import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JobBoard_Activity1 {
	public static void main(String[] args) {
		WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Projects\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
         driver.get("https://alchemy.hguy.co/jobs");
         driver.manage().window().maximize();
         String title = driver.getTitle();
         System.out.println("Page title is: " + title);
        if (title.equals("Alchemy Jobs – Job Board Application")) {
        	driver.close();
        }
        	
        else
        {
        	System.out.println("Title is not valid");
        	}
             
}}
