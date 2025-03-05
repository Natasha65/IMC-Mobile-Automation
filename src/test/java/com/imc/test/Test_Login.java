package com.imc.test;

import java.net.*;
import org.testng.annotations.Test;
import com.imc.base.*;
import com.imc.errorCollectors.ErrorCollector;
import com.imc.pages.DashboardPage;
import com.imc.pages.LoginPage;

import junit.framework.Assert;

import java.io.IOException;
import java.lang.String;
public class Test_Login extends BaseClass {
	
    @Test(priority = 1 )
	public void VerifyUserCanLoginWith_ValidMRN_Number() throws InterruptedException, IOException {
	try {
    		setupReport();
    		setupAppiumDriver();
    		
    		LoginPage loginPage=new LoginPage();
    		int step=1;
    		String key="000348";
    		String otp="4321";
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Navigating to application");
    		step++;
    		Thread.sleep(10000);
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Enter MR Number : " + key);
    		loginPage.enterMrNumber(key);
    		step++;
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Click On Sign in Button");
    		loginPage.ClickOnSignInButton();
    		Thread.sleep(10000);
    		step++;
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Enter OTP");
    		loginPage.EnterOTP(otp);
    		step++;
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Click On Ok Alert ");
    		loginPage.ClickOkAlert();
    		step++;
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Verify User Successfully Logged In");
    		ErrorCollector.verifyTrue(loginPage.VerifyIMCDashboard() , "Verified : User Successfully Logged In");
    		step++;
   		
    		ErrorCollector.extentLogInfo("Step " + step + " : Closing the Application");
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
			Assert.fail();
    	}
		finally {
		if (driver != null) {
            Runtime.getRuntime().exec("adb shell am force-stop sa.med.imc.myimc"); 
            driver.quit(); 
        }
	}
	}

    
    @Test(priority = 2, dependsOnMethods="VerifyUserCanLoginWith_ValidMRN_Number")
	public void VerifyUserCanLoginWith_InValidMRN_Number() throws InterruptedException, IOException {
	try {
    		setupReport();
    		setupAppiumDriver();
    		
    		LoginPage loginPage=new LoginPage();
    		int step=1;
    		String key="00034990";
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Navigating to application");
    		step++;
    		Thread.sleep(10000);
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Enter InValid MR Number : " + key);
    		loginPage.enterMrNumber(key);
    		step++;
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Click On Sign in Button");
    		loginPage.ClickOnSignInButton();
    		step++;
    		
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Verify Error Message");
    		ErrorCollector.verifyTrue(loginPage.VerifyInvalidMRErrorMessage() , "Verified : Verify Error Message : <b> Invalid MR Number is Entered  </b> is displaying");
    		step++;
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Closing the Application");
    	

    	}
    	catch(Exception e) {
    		e.printStackTrace();
			Assert.fail();
    	}
		finally {
	        if (driver != null) {
	            Runtime.getRuntime().exec("adb shell am force-stop sa.med.imc.myimc"); 
	            driver.quit(); 
	        }
		}
	}
  

    @Test(priority = 3 , dependsOnMethods="VerifyUserCanLoginWith_InValidMRN_Number")
	public void VerifyUserCanLoginWith_InValid_LoginID() throws InterruptedException, IOException {
	try {
    		setupReport();
    		setupAppiumDriver();
    		
    		LoginPage loginPage=new LoginPage();
    		int step=1;
    		String key="00034990";
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Navigating to application");
    		step++;
    		Thread.sleep(10000);
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Enter InValid Login ID : " + key);
    		loginPage.enterLoginId(key);
    		step++;
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Click On Sign in Button");
    		loginPage.ClickOnSignInButton();
    		step++;
    		
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Verify Error Message");
    		ErrorCollector.verifyTrue(loginPage.VerifyInvalidIDErrorMessage() , "Verified : Verify Error Message : <b> Invalid ID is Entered  </b> is displaying");
    		step++;
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Closing the Application");
    	

    	}
    	catch(Exception e) {
    		e.printStackTrace();
			Assert.fail();
    	}
		finally {
        if (driver != null) {
            Runtime.getRuntime().exec("adb shell am force-stop sa.med.imc.myimc"); 
            driver.quit(); 
        }
	}
	}
    
  
    @Test(priority = 4)
	public void VerifyContactUs_Button() throws InterruptedException, IOException {

    	try {
    		setupReport();
    		setupAppiumDriver();
    		LoginPage loginPage=new LoginPage();
    		int step=1;
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Navigating to application");
    		step++;
    		Thread.sleep(10000);
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Click On Contact Us Button");
    		loginPage.ClickOnContactUsButton();
    		step++;
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Verify Request a Callback button is displaying");
    		ErrorCollector.verifyTrue(loginPage.isRequestACallBackButtonIsDisplaying() , "Verified : Request a Callback button is displaying");
    		step++;
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Verify Call Us button is displaying");
    		ErrorCollector.verifyTrue(loginPage.isCallUsButtonIsDisplaying() , "Verified : Call Us button is displaying");
    		step++;
    		    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Closing the Application");

    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	finally {
            if (driver != null) {
                Runtime.getRuntime().exec("adb shell am force-stop sa.med.imc.myimc"); 
                driver.quit(); 
            }
    	}
	}

	
    @Test(priority = 5)
  	public void VerifyUerCanCancel_Changing_TheLanguage() throws InterruptedException, IOException {

      	try {
      		setupReport();
    		setupAppiumDriver();
      		
      		LoginPage loginPage=new LoginPage();
      		int step=1;
      		
      		ErrorCollector.extentLogInfo("Step " + step + " : Navigating to application");
      		step++;
      		
      		ErrorCollector.extentLogInfo("Step " + step + " : Click On Language Button");
    		loginPage.ClickOnLanguageCancelButton();
    		step++;
    		
      		
      		ErrorCollector.extentLogInfo("Step " + step + " : Verify Language Is English");
      		ErrorCollector.verifyTrue(loginPage.VerifyIMCDashboard(), "Verified : <b> Language Is English <b>");
      		step++;
      		
      		ErrorCollector.extentLogInfo("Step " + step + " : Closing the Application");

      	}
      	catch(Exception e) {
      		e.printStackTrace();
				Assert.fail();
      	}
      	finally {
            if (driver != null) {
                Runtime.getRuntime().exec("adb shell am force-stop sa.med.imc.myimc"); 
                driver.quit(); 
            }
    	}
  	}
    
    
    
    @Test(priority = 6)
  	public void VerifyChatbot_Button() throws InterruptedException, IOException {

      	try {
      		setupReport();
    		setupAppiumDriver();
      		
      		LoginPage loginPage=new LoginPage();
      		int step=1;
      		
      		ErrorCollector.extentLogInfo("Step " + step + " : Navigating to application");
      		step++;
      		
      		ErrorCollector.extentLogInfo("Step " + step + " : Click On Chatbot Button");
    		loginPage.ClickOnChatbotBtn();
    		step++;
    		Thread.sleep(15000);
    		
      		ErrorCollector.extentLogInfo("Step " + step + " : Verify Chatbot is Opened");
      		ErrorCollector.verifyTrue(loginPage.VerifyChatbot() , "Verified : Chatbot Button is clickable");
      		step++;
      		
      		ErrorCollector.extentLogInfo("Step " + step + " : Closing the Application");

      	}
      	catch(Exception e) {
      		e.printStackTrace();
      		Assert.fail();
      	}
      	finally {
            if (driver != null) {
                Runtime.getRuntime().exec("adb shell am force-stop sa.med.imc.myimc"); 
                driver.quit(); 
            }
    	}
  	}
    
   
    @Test(priority = 7)
  	public void VerifyRegister_Button() throws InterruptedException, IOException {

      	try {
      		
      		setupReport();
    		setupAppiumDriver();
    		
      		LoginPage loginPage=new LoginPage();
      		int step=1;
      		
      		ErrorCollector.extentLogInfo("Step " + step + " : Navigating to application");
      		step++;

      		
      		ErrorCollector.extentLogInfo("Step " + step + " : Click On Register Link Button");
    		loginPage.ClickOnRegisterButton();
    		step++;
    		
//      		ErrorCollector.extentLogInfo("Step " + step + " : Verify Sign Up Screen is displaying");
//      		ErrorCollector.verifyTrue(loginPage.VerifySignUpScreen(), "Verified : <b>Sign Up <b> Screen is displaying");
//      		step++;
      		
      		ErrorCollector.extentLogInfo("Step " + step + " : Closing the Application");

      	}
      	catch(Exception e) {
      		e.printStackTrace();
				Assert.fail();
      	}
      	finally {
            if (driver != null) {
                Runtime.getRuntime().exec("adb shell am force-stop sa.med.imc.myimc"); 
                driver.quit(); 
            }
    	}
  	}
   
    
    @Test(priority = 8)
  	public void VerifyUserUnableToLogin_With_InValidOTP() throws InterruptedException, IOException {

      	try {
      		
      		setupReport();
    		setupAppiumDriver();
    		
      		LoginPage loginPage=new LoginPage();
      		int step=1;
      		String key="000348";
      		String otp="4333";
      		
      		ErrorCollector.extentLogInfo("Step " + step + " : Navigating to application");
      		step++;
      		
      		ErrorCollector.extentLogInfo("Step " + step + " : Enter MR Number : " + key);
    		loginPage.enterMrNumber(key);
    		step++;

      		
      		ErrorCollector.extentLogInfo("Step " + step + " : Click On Remember Me checkbox");
    		loginPage.ClickOnRemeberMeCheckbox();
    		step++;
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Click On Sign in Button");
    		loginPage.ClickOnSignInButton();
    		step++;
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Enter OTP");
    		loginPage.EnterOTP(otp);
    		step++;
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Verify Error Message");
    		ErrorCollector.verifyTrue(loginPage.VerifyOTP() , "Verified Error Message : OTP Not Matched!");
    		step++;
    		
    	
      		ErrorCollector.extentLogInfo("Step " + step + " : Closing the Application");

      	}
      	catch(Exception e) {
      		e.printStackTrace();
				Assert.fail();
      	}
      	finally {
            if (driver != null) {
                Runtime.getRuntime().exec("adb shell am force-stop sa.med.imc.myimc"); 
                driver.quit(); 
            }
    	}
  	}
}
