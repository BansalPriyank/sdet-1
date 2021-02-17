package NewAppium;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class GoogleTask_01 {
	  AppiumDriver<MobileElement> driver = null;
	    WebDriverWait wait;
	    @BeforeClass
	    public void beforeClass() throws MalformedURLException {
	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "Pixel4Emulator");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("noReset", true);
	        // Use your own device's messaging app
	        caps.setCapability("appPackage", "com.google.android.apps.tasks");
	        caps.setCapability("appActivity", ".ui.TaskListsActivity");

	        // Instantiate Appium Driver
	        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        wait = new WebDriverWait(driver, 5);
	    }

	    @Test
	    public void googletask() {
	        // Click the button to add a new task.
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	MobileElement Addbutton=driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Create new task\"]");
	    	Addbutton.click();
	    	//Add first task 
	    	MobileElement task=driver.findElementById("add_task_title");
	    	task.sendKeys("Complete Activity with Google Tasks");
	    	//Save the task
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.findElementById("add_task_done").click();
	        String firsttask =driver.findElementById("task_name").getText();
	        System.out.println("The first task is "+firsttask);
	        Assert.assertEquals(firsttask, "Complete Activity with Google Tasks");
	        
	
	    	//Add second task 
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       	Addbutton.click();
	       	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       	driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Keep");
	       	driver.findElementById("add_task_done").click();
	       	String secondtask =driver.findElementByXPath("//android.widget.TextView[@text='Complete Activity with Google Keep']").getText();
	       	System.out.println("The second task is "+secondtask);
	        Assert.assertEquals(secondtask, "Complete Activity with Google Keep");
	       	
	       	//Add Third Task
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       	Addbutton.click();
	       	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       	driver.findElementById("add_task_title").sendKeys("Complete the second Activity Google Keep");
	       	driver.findElementById("add_task_done").click();
	       	String thirdtask =driver.findElementByXPath("//android.widget.TextView[@text='Complete the second Activity Google Keep']").getText();
	       	System.out.println("The Third task is "+thirdtask);
	        Assert.assertEquals(thirdtask, "Complete the second Activity Google Keep");
	       	       	
	    		  }

	    @AfterClass
	    public void afterClass() {
	        driver.quit();
	    }
	}