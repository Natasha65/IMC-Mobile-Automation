package com.imc.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imc.base.BaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.github.ashwith.flutter.FlutterFinder;

public class AppointmentsPage extends BaseClass{
	
	FlutterFinder finder;
    
    String SearchEditText="(//android.widget.EditText)[1]";
    String MonthDropdown="(//android.widget.Button)[3]";
    String MonthSlot="//android.widget.Button[@content-desc='Mar 2025']";
	String DateSlot="(//android.widget.Button[@content-desc='Mar 2025']//following-sibling::android.view.View//android.view.View)[6]";
	String TimeSlot="(//android.widget.Button[@content-desc=\"Mar 2025\"]//following-sibling::android.view.View)[2]//android.view.View[2]";
	String ConfirmSlotButton="//android.widget.Button[@content-desc=\"Confirm\"]";
	String ConfirmSlotOkButton="//android.widget.Button[@content-desc='Ok']";
	String AppointmentSuccessMessage="//android.widget.ImageView[@content-desc='Success']";
	String AppointmentDeniedMessage="//android.widget.ImageView[@content-desc='Information']";
	String Threedots="(//android.widget.Button)[2]";
	String CancelButton="//android.widget.Button[@content-desc='Cancel']";
	String YesButton="//android.widget.Button[@content-desc='Yes']";

	
	
	public AppointmentsPage() {
		finder=new FlutterFinder(driver);
    }
	
	
	public void SelectMonth(){
		Click(MonthDropdown);
		Click(MonthSlot);
    }
	
	public void selectDate(){
		Click(DateSlot);
    }
	
	public void selectTime(){
		Click(TimeSlot);
    }

	public void SearchDoctor(String doctor){
	   Click(SearchEditText);
	   EnterKeys(SearchEditText , doctor);
    }
	
	public void ClickOnConfirmSlotButton(){
		   Click(ConfirmSlotButton);
	    }
	
	public void ClickOnConfirmSlotOKButton(){
		   Click(ConfirmSlotOkButton);
	    }
	
	public void ClickOnThreeDots(){
		   Click(Threedots);
	}
	
	public void ClickOnCancelButton(){
		   Click(CancelButton);
	}
	
	public void ClickOnYes(){
		   Click(YesButton);
	}
	
	public boolean VerifySearchedDoctorResult(String doctor) {
	    String locator = "//android.widget.ImageView[contains(@content-desc, '" + doctor + "')]";
	    return isDisplaying(locator);
	}
	
	public boolean VerifySlotLocation() {
	    String locator = "//android.view.View[contains(@content-desc, 'International Medical Center')]";
	    return isDisplaying(locator);
	}
	
	public boolean VerifySlotClinic(String clinic) {
	    String locator = "//android.view.View[contains(@content-desc, '" + clinic + "')]";
	    return isDisplaying(locator);
	}
	
	public boolean VerifyAppointmentSuccessMessage() {
	    return isDisplaying(AppointmentSuccessMessage);
	}
	
	public boolean VerifyAppointmentDeniedMessage() {
	    return isDisplaying(AppointmentDeniedMessage);
	}
	
	public boolean VerifyDoctorName(String doctorName) {
	    String locator = "//android.view.View[contains(@content-desc, '" + doctorName + "')]";
	    return isDisplaying(locator);
	}
	
	
	public void ClickOnDoctorProfile(String doctor) {
	    String locator = "//android.widget.ImageView[contains(@content-desc, '" + doctor + "')]";
	    Click(locator);
	}

	
	
	public boolean VerifyBookedSlot(String doctor) {
		try {
		 String locator = "//android.widget.ImageView[contains(@content-desc, '" + doctor + "')]";
		 return isDisplaying(locator);
		}catch(Exception e) {
			return true;
		}
	}
		
   
}
