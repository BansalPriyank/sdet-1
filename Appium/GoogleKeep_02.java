package NewAppium;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GoogleKeep_02 {
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
	  caps.setCapability("appPackage", "com.google.android.keep");
	  caps.setCapability("appActivity", ".activities.BrowseActivity");

	        // Instantiate Appium Driver
	  URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
	  driver = new AndroidDriver<MobileElement>(appServer, caps);
	  wait = new WebDriverWait(driver, 5);
}
  @Test
  public void googlekeep() { 
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.id("com.google.android.keep:id/new_note_button")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  MobileElement title = driver.findElement(By.id("com.google.android.keep:id/editable_title"));
	  title.sendKeys("This is Appium Testing");
	  MobileElement note= driver.findElement(By.id("com.google.android.keep:id/edit_note_text"));
	  note.sendKeys("Testing is going on. Everything is great");
	  driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")).click();
	  
	  String titlePage= driver.findElement(By.id("com.google.android.keep:id/index_note_title")).getText();
	  String notePage= driver.findElement(By.id("com.google.android.keep:id/index_note_text_description")).getText();
	  Assert.assertEquals("This is Appium Testing", titlePage);
	  Assert.assertEquals("Testing is going on. Everything is great", notePage);
}
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  }
	  
	  


