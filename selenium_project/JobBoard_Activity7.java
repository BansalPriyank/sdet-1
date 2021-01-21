import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class JobBoard_Activity7
{
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver;
         System.setProperty("webdriver.chrome.driver", "C:\\Selenium Projects\\chromedriver_win32//chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://alchemy.hguy.co/jobs");
         driver.manage().window().maximize();
         driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[3]/a")).click();
         Thread.sleep(3000);
         driver.findElement(By.name("create_account_email")).sendKeys("sdetabc897@gmail.com");
         Thread.sleep(3000);
         driver.findElement(By.name("job_title")).sendKeys("Test Specialist");
         Thread.sleep(3000);
         driver.findElement(By.name("job_location")).sendKeys("India");
         Thread.sleep(3000);
         Select drpjobtype=new Select (driver.findElement(By.id("job_type")));
         drpjobtype.selectByVisibleText("Freelance");
         driver.switchTo().frame(0);
         driver.findElement(By.id("tinymce")).sendKeys("This is DESC details");
         driver.switchTo().defaultContent();
         Thread.sleep(3000);
         driver.findElement(By.id("application")).sendKeys("abc@URL.com");
         driver.findElement(By.name("company_name")).sendKeys("IBM");
         driver.findElement(By.name("submit_job")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("job_preview_submit_button")).click();
         driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/a")).click();
         driver.close();      
         
	}}


