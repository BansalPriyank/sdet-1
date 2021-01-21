import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JobBoard_Activity6
{
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver;
         System.setProperty("webdriver.chrome.driver", "C:\\Selenium Projects\\chromedriver_win32//chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://alchemy.hguy.co/jobs");
         driver.manage().window().maximize();
         driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/form/div[1]/div[1]/input")).sendKeys("Tester1");
         Thread.sleep(3000);
         driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/form/div[1]/div[4]/input")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/ul/li[1]/a")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div[3]/input")).click();
         System.out.println (driver.findElement(By.className("job_application_email")).getAttribute("innerText"));
         driver.close();      
         
	}}


