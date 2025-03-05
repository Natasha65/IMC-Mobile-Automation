//package com.imc.pages;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.imc.base.BaseClass;
//
//public class ProfilePage extends BaseClass{
//	
//    
//	@FindBy(xpath = "//android.view.View[@content-desc=\"Email\"]")
//	public WebElement emailField;
//	
//	@FindBy(xpath = "//android.view.View[@content-desc=\"MR Number\"]")
//	public WebElement Mr_Number;
//	
//	@FindBy(xpath = "//android.view.View[@content-desc=\"National/Iqama ID\"]")
//	public WebElement National_Iqama;
//	
//	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Profile Tab 5 of 5\"]")
//	public WebElement Profile;
//	
//	
//	@FindBy(xpath = "//android.view.View[@content-desc=\"DOB\"]")
//	public WebElement DOB;
//	
//	
//	@FindBy(xpath = "//android.view.View[@content-desc=\"Address in English\"]")
//	public WebElement Address_english;
//	
//	@FindBy(xpath = "//android.view.View[@content-desc=\"Address in Arabic\"]/android.widget.EditText")
//	public WebElement Address_arabic;
//	
//	
//	@FindBy(xpath = "//android.view.View[@content-desc=\"Save\"]")
//	public WebElement Savebutton;
//	
//	
//	@FindBy(xpath = "//android.view.View[@content-desc=\"Cancel\"]")
//	public WebElement CancelButton;
//
//	
//
//		
//	public ProfilePage() {
//		PageFactory.initElements(driver, this);
//	}
//	
//	
//	
//	public void clickOnProfileButton(){
//		click(Profile);
//    }
//	
//	
//	public void clickSaveButton(){
//		waitForElementToBePresent(Savebutton, defaultTimeForVisibility);
//		click(Savebutton);
//    }
//	
//	
//
//	public void clickCancelButton(){
//		waitForElementToBePresent(CancelButton, defaultTimeForVisibility);
//		click(CancelButton);
//    }
//	
//	
//
//	public boolean isEmailFieldDisplaying() {
//		waitForElementToBePresent(emailField, defaultTimeForVisibility);
//		return isElementDisplayed(emailField);
//	}
//
//	public boolean isMrNumberDisplaying() {
//		waitForElementToBePresent(Mr_Number, defaultTimeForVisibility);
//		return isElementDisplayed(Mr_Number);
//	}
//	public boolean isDobDisplaying() {
//		waitForElementToBePresent(DOB, defaultTimeForVisibility);
//		return isElementDisplayed(DOB);
//	}
//	
//	public boolean isAddressEnglishDisplaying() {
//		waitForElementToBePresent(Address_english, defaultTimeForVisibility);
//		return isElementDisplayed(Address_english);
//	}
//	
//
//	public boolean isAddressArabicDisplaying() {
//		waitForElementToBePresent(Address_arabic, defaultTimeForVisibility);
//		return isElementDisplayed(Address_arabic);
//	}
//	
//
//	public boolean isNational_Iqama_Displaying() {
//		waitForElementToBePresent(National_Iqama, defaultTimeForVisibility);
//		return isElementDisplayed(National_Iqama);
//	
//	}
//	
//
//	
//	public void EnterEnglish_Address(String address) {
//		waitForElementToBePresent(Address_english, defaultTimeForVisibility);
//		Address_english.sendKeys(address);
//      
//	}
//	
//	public void Enter_Email(String email) {
//		waitForElementToBePresent(emailField, defaultTimeForVisibility);
//		emailField.sendKeys(email);
//      
//	}
//	
//   
//}
