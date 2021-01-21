import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JobBoard_Activity9
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
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[7]/a/div[3]")).click();
         Thread.sleep(3000);
         driver.findElement(By.className("page-title-action")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("post-title-0")).sendKeys("QA_Accenture");
         driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div[1]/div[4]/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]")).sendKeys("This is a description box");
         driver.findElement(By.id("_job_location")).sendKeys("Mumbai");
         Thread.sleep(3000);
         driver.findElement(By.name("_application")).sendKeys("sdet675@URL.com");
         Thread.sleep(3000);
         driver.findElement(By.name("_company_name")).sendKeys("Accenture");
         driver.findElement(By.name("_company_website")).sendKeys("www.accenture.com");
         driver.findElement(By.name("_company_tagline")).sendKeys("Accentureaccenture");
         driver.findElement(By.name("_company_twitter")).sendKeys("@Accenture");
         driver.findElement(By.name("_job_expires-datepicker")).sendKeys("January 30, 2021");
         driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[2]/button[2]")).click();
         driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div/button")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[2]/div/div[2]/div[2]/a")).click();
         driver.close() ;
	}}

