//package com.imc.pages;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.imc.base.BaseClass;
//
//public class RegisterPage extends BaseClass{
//	
//    
//	@FindBy(xpath = "//android.widget.Button[@content-desc=\"ID Type (National ID / Iqama / Passport / Birth Notification)* ID Number* Nationality* Date of Birth*\"]/android.widget.EditText[1]")
//	public WebElement Id_Number;
//	
//	
//
//		
//	public RegisterPage() {
//		PageFactory.initElements(driver, this);
//	}
//	
//	
//	public void verifyOTP(String number) {
//		waitForElementToBePresent(Id_Number, defaultTimeForVisibility);
//		sendKeysToWebElement(Id_Number , number);
//      
//	}
//	
//   
//}
