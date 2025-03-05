
package com.imc.base;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.ExtentTest;
import com.imc.listeners.ExtentListeners;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	public static AndroidDriver driver;
	public static ExtentTest extentReport;
	public static SoftAssert softAssert;
	public static DesiredCapabilities dc ;
    public static String buildPath = System.getProperty("user.dir") + "/src/test/resources/executables/app-debug 4.apk";
	public static String imagePath = System.getProperty("user.dir") + "/src/test/resources/data/Images/";
	public static final String testSuiteRunnerFileName = "SuiteTests_Android";
	public static final String testSuiteRunnerSheetName = "Tests";

    public static void setupReport() {
    	extentReport = ExtentListeners.testReport.get();
    	softAssert = new SoftAssert();
    }
    
	public static void setupAppiumDriver() {
		try {
			if (extentReport == null) {
				setupReport();
			}
			dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,  "Android"); 
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0"); 
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			dc.setCapability(MobileCapabilityType.APP, buildPath); 
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Flutter"); 
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30000); 
			dc.setCapability("appium:uiautomator2ServerLaunchTimeout", 120000); 
			dc.setCapability("appium:uiautomator2ServerInstallTimeout", 120000); 
			dc.setCapability("appium:sessionOverride", true); 
			dc.setCapability("appium:noReset", true);  
			dc.setCapability("appium:fullReset", false); 
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
	        driver.manage().timeouts().implicitlyWait(Integer.parseInt(PropertiesReader.getPropertyValue("implicit.wait")), TimeUnit.SECONDS);
		    System.out.println("Appium Driver Created Successfully");
		} catch (Exception e) {
			System.out.println("Cause: " + e.getCause());
			System.out.println("Message: " + e.getMessage());
			e.printStackTrace();
		}
	}

//	@AfterMethod
//    public void tearDown() throws IOException {
//		if(driver!=null) {
//			driver.quit();
//            Runtime.getRuntime().exec("adb shell am force-stop sa.med.imc.myimc"); // Replace with your app's package name
//            System.out.println("Appium driver quit");
//		}
//            
//    }
	

    public static AndroidDriver getDriver() {
        return driver;
    }
    public static void printString(String message) {
		try {
			System.out.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    

    public void click(WebElement element) {
		waitForElementToBeClickable(element, 30);
		element.click();
	}
    
    public boolean isElementDisplayed(WebElement element) {
		try {
			if (element.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
    
	public void waitForElementToBePresent(WebElement locator, int timeOutInSeconds) {

		WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(locator));
	}

	public void waitForElementsToBePresent(List<WebElement> locator, int timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOfAllElements(locator));
	}

	public void waitForElementToBeClickable(WebElement by, int timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public boolean isElementClickable(WebElement by, int timeOutInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
			wait.until(ExpectedConditions.elementToBeClickable(by));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public AndroidElement waitForElementToBePresent(By locator, int timeOutInSeconds) {

		WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
		return (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public void clickElement(AndroidElement element, String elementLabel) {
		element.click();
	}


	public void sendKeysToElement(AndroidElement element, String keys, String elementLabel) {
		element.sendKeys(keys);
	}
	public void sendKeysToWebElement(WebElement element, String keys) {
		// waitForElementVisibility(element, defaultTimeForVisibility);
		// waitForElementToBeClickable(element, defaultTimeTOBeClickable);
		element.clear();
		element.sendKeys(keys);
		
	}
    
    public boolean isDisplaying(String xpath) {
    	    WebDriverWait wait = new WebDriverWait(driver, 30);
            
            MobileElement button = (MobileElement) wait.until(
                    ExpectedConditions.elementToBeClickable(MobileBy.xpath(xpath))
            );
            return button.isDisplayed();
    }
    
    public boolean isButtonDisplaying_AccessibilityID(String id) {
	   	 WebDriverWait wait = new WebDriverWait(driver, 30);
	     
	     MobileElement button = (MobileElement) wait.until(
	             ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(id))
	     );
	     return button.isDisplayed();
   }

    
    public void EnterKeys(String xpath , String text) {
    	WebDriverWait wait = new WebDriverWait(driver, 30);
        
        MobileElement button = (MobileElement) wait.until(
                ExpectedConditions.elementToBeClickable(MobileBy.xpath(xpath))
        );
        button.sendKeys(text);
   }
    
    public void Click(String xpath) {
    	WebDriverWait wait = new WebDriverWait(driver, 30);
        
        MobileElement button = (MobileElement) wait.until(
                ExpectedConditions.elementToBeClickable(MobileBy.xpath(xpath))
        );
        button.click();
   }
    
    
    public void Click_WithID(String id) {
    	WebDriverWait wait = new WebDriverWait(driver, 30);
        
        MobileElement button = (MobileElement) wait.until(
                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(id))
        );
        button.click();
   }
    

}
