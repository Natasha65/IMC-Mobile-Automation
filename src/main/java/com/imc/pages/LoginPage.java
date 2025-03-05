package com.imc.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imc.base.BaseClass;
import com.imc.base.PropertiesReader;
import com.imc.errorCollectors.ErrorCollector;

import io.github.ashwith.flutter.FlutterElement;
import io.github.ashwith.flutter.FlutterFinder;

public class LoginPage  extends BaseClass {

	public FlutterFinder finder;
	
	
	@FindBy(xpath = "//android.widget.ImageView[contains(@content-desc,  'Request a Callback')]")
	public WebElement requestACallBack;
	
	@FindBy(xpath = "//android.widget.ImageView[contains(@content-desc,  'Call Us')]")
	public WebElement CallUs;

	@FindBy(xpath = "(//android.widget.TextView[contains(@text, 'International')])[1]")
	public WebElement ChatbotHeading;
	
	@FindBy(xpath = "//android.view.View[@content-desc='Ok']")
	public WebElement OkAlert;
	
	@FindBy(xpath = "(//android.widget.EditText)[1]")
	public WebElement otpInput;
	
	@FindBy(xpath = "(//android.view.View[contains(@content-desc, 'MR Number')]//following-sibling::android.widget.EditText)[1]")
	public WebElement MrNumber;
	
	@FindBy(xpath = "(//android.view.View[contains(@content-desc, 'MR Number')]//following-sibling::android.widget.EditText)[2]")
	public WebElement LoginID;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Sign In']")
	public WebElement SignIn;
	
	@FindBy(xpath = "//android.view.View[@content-desc='Invalid ID is entered']")
	public WebElement InValidID;
	
	@FindBy(xpath = "//android.view.View[@content-desc='Invalid MR Number is entered']")
	public WebElement InValidMRNumber;
	
	
	@FindBy(xpath = "//android.view.View[@content-desc='OTP Not Matched!']")
	public WebElement OTPError;
	
	@FindBy(xpath = "//android.view.View[@content-desc=\"registerlink\"]")
	public WebElement SignUp;
	
	


	String imcDashboard="Book An Appointment";
	String Arabic="Book An Appointment";

	public LoginPage() {
		PageFactory.initElements(driver, this);
		finder=new FlutterFinder(driver);
	}
	
    public void enterMrNumber(String key) {
    	waitForElementToBePresent(MrNumber, 30);
		click(MrNumber);
		sendKeysToWebElement(MrNumber,key);

    }
    
    public void enterLoginId(String key) {
    	waitForElementToBePresent(LoginID, 30);
		click(LoginID);
		sendKeysToWebElement(LoginID,key);

      }
    
    public void ClickOnSignInButton() {
    	click(SignIn);
    }
    
    public void ClickOnSignOutButton() {
    	FlutterElement sideMenu= finder.byValueKey("sidemenu");
    	sideMenu.click();
    	
    	FlutterElement logout= finder.byText("Log Out");
    	logout.click();
    }
    
    public void ClickOnContactUsButton() 
    {
    	FlutterElement sideMenu= finder.byValueKey("contactusbtn");
    	sideMenu.click();
//    	click(CallUs);
    }
    
    
    public void SelectHospital() {
		FlutterElement hospitalDropdown= finder.byValueKey("hospital_dropdown");
		hospitalDropdown.click();
		
		FlutterElement IMC= finder.byText("International Medical Center");
		IMC.click();
    }
    
    
    
    public void ClickOnNotification() {
    	FlutterElement notification = finder.byValueKey("notification");
    	notification.click();
    }
    
    public void ClickOnChatbotBtn() {
    	FlutterElement chatbotbtn = finder.byValueKey("chatbotbtn");
    	chatbotbtn.click();
    }
    
    public void ClickOnRegisterButton() {
    	FlutterElement register = finder.byValueKey("registerlink");
    	register.click();
    }
    
    public void ClickOnRemeberMeCheckbox() {
    	FlutterElement rememberMe = finder.byValueKey("rememberme");
    	rememberMe.click();
    }
    
    public void ClickOnLanguageCancelButton() {
    	FlutterElement languagebtn = finder.byValueKey("languagebtn");
    	languagebtn.click();
    
    	FlutterElement langyesbtn = finder.byValueKey("langcancelbtn");
    	langyesbtn.click();
    }
    
    
    public  int login(int  step) throws InterruptedException {

	 	String Key = PropertiesReader.getPropertyValue("Key");
		String Otp = PropertiesReader.getPropertyValue("Otp");
		
		Thread.sleep(20000);
		ErrorCollector.extentLogInfo("Step " + step + " : Enter MR Number : " + Key);
		enterMrNumber(Key);
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On Sign in Button");
		ClickOnSignInButton();
		Thread.sleep(10000);
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Enter OTP");
		EnterOTP(Otp);
		Thread.sleep(10000);
		step++;

		ErrorCollector.extentLogInfo("Step " + step + " : Click On Ok Alert ");
		ClickOkAlert();
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Verify User Successfully Logged In");
		ErrorCollector.verifyTrue(VerifyIMCDashboard() , "Verified : User Successfully Logged In");
		step++;
	
        return step;
    }
    
   
    public void EnterOTP(String otp) {
    	waitForElementToBePresent(otpInput, 30);
    	sendKeysToWebElement(otpInput, otp);
         
    }
 
    public void ClickOkAlert() {
    	click(OkAlert);
         
    }
    
    public boolean VerifyIMCDashboard() {
    	return isButtonDisplaying_AccessibilityID(imcDashboard);
		
    }

    public boolean VerifyOTP() {
    	waitForElementToBePresent(OTPError, 30);
		return isElementDisplayed(OTPError);
    		
    }
    
    public boolean VerifyMRNumberIsAlreadyEntered() {
    	return isButtonDisplaying_AccessibilityID(imcDashboard);
		
    }
 
    public boolean VerifyChatbot() {
    	waitForElementToBePresent(ChatbotHeading, 30);
		return isElementDisplayed(ChatbotHeading);
    }
    

    public boolean VerifyArabic() {
    	return isButtonDisplaying_AccessibilityID(Arabic);
		
    }
//    
//    public boolean VerifySignUpScreen() {
//    	return isButtonDisplaying_AccessibilityID(SignUp);
//		
//    }
    
    
    public boolean VerifyInvalidMRErrorMessage() {
    	waitForElementToBePresent(InValidMRNumber, 30);
		return isElementDisplayed(InValidMRNumber);
		
    }
    
    public boolean VerifyInvalidIDErrorMessage() {
    	waitForElementToBePresent(InValidID, 30);
		return isElementDisplayed(InValidID);		
    }
    
 
    public boolean isRequestACallBackButtonIsDisplaying() {
    	waitForElementToBePresent(requestACallBack, 30);
		return isElementDisplayed(requestACallBack);	
		
    }
    
    public boolean isCallUsButtonIsDisplaying() {
    	waitForElementToBePresent(CallUs, 30);
		return isElementDisplayed(CallUs);	
		
    }
    
}
