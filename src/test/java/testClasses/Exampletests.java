package testClasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import pageObjectClasses.HomeScreen;
import pageObjectClasses.LoginScreen;
import pageObjectClasses.Menu;
import pageObjectClasses.PasscodeScreen;
import pageObjectClasses.Registration;
import pageObjectClasses.SettingsMenu;
import testListeners.SingleDataProvider;
import utlilty.WaitClass;

public class ExampleTests {
	
	IOSDriver<MobileElement> driver;
	Example ob ;

	
	@BeforeMethod
	public void beforeMethod(Object args[]){
		ob = new Example(driver);														//OBJECT CREATION TO USE EXAMPLE CLASS(PAGE OBJECT CLASS) MEMBERS 
	}
	
	@AfterMethod
	public void afterMethod(){
		
	}
	
	@Test(dataProvider="data" , dataProviderClass= SingleDataProvider.class)			//WITH DATA FROM EXCEL
	public void firstExample(String one, String two, String three){
		
	}

	@Test 																				//WITHOUT DATA
	public void secondExample(){

	}

}
