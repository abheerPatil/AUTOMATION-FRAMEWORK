package baseClass;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class DriverClass {
	
  public static IOSDriver<MobileElement> driver = null;
  
  public DriverClass() {
	  DesiredCapabilities caps = new DesiredCapabilities();
      caps.setCapability("automationName", "");
      caps.setCapability("platformName", "");
      caps.setCapability("platformVersion", "");
      caps.setCapability("deviceName","");
      caps.setCapability("udid", "");	
      caps.setCapability("noReset", true);
      caps.setCapability("bundleId","");
      caps.setCapability("xcodeOrgId", "");
      caps.setCapability("xcodeSigningId", "");
      caps.setCapability("autoDismissAlerts", true);
      try {
		driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}
  
  public static IOSDriver<MobileElement> set(){
	  new DriverClass();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  return driver;
	  
  }
  
  
}
