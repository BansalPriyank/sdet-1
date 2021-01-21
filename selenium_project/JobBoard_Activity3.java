import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JobBoard_Activity3 {
	public static void main(String[] args) {
		WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Projects\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
         driver.get("https://alchemy.hguy.co/jobs");
         driver.manage().window().maximize();
         String headerURL = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/header/div/img")).getAttribute("src");
         System.out.print("header URL is :"+headerURL);
         driver.close();
	}}


