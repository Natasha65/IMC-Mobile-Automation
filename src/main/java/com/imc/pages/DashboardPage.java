package com.imc.pages;
import com.imc.base.BaseClass;

import io.github.ashwith.flutter.FlutterElement;
import io.github.ashwith.flutter.FlutterFinder;

public class DashboardPage  extends BaseClass {

	public FlutterFinder finder;
	
	String HospitalDropdown="(//android.widget.ImageView)[1]";
	String IMC="International Medical Center";
	String FirstClinic="First Clinic";
	String KAUSTHealth="KAUST Health";
	String RedSeaMallClinic="Red Sea Mall Clinic";
	String imcDashboard="Book An Appointment";
	String Chatbot="(//android.view.View)[22]";
	String HomeIcon="//android.widget.ImageView[contains(@content-desc, 'Home')]";
	String ReportsIcon="//android.widget.ImageView[contains(@content-desc, 'Reports')]";
	String AppointmentsIcon="//android.widget.ImageView[contains(@content-desc, 'Appointments')]";
	String VisitsIcon="//android.widget.ImageView[contains(@content-desc, 'Visits')]";
	String ProfileIcon="//android.widget.ImageView[contains(@content-desc, 'Profile')]";
	String OkAlert="//android.view.View[@content-desc=\"Ok\"]";
	String SurgeryTab="//android.view.View[@content-desc='Cardiac Surgery']";
	String Arabic="Book An Appointment";
	String otpInput="(//android.widget.EditText)[1]";
	String InValidID="//android.view.View[@content-desc='Invalid ID is entered']";
	String InValidMRNumber="//android.view.View[@content-desc='Invalid MR Number is entered']";
	
	
	public DashboardPage() {
		finder=new FlutterFinder(driver);
	}
	
    public void SelectHospital() {
		Click(HospitalDropdown);
		Click_WithID(IMC);
    }
    
    public void ClickOnHospitalDropdown() {
    	Click(HospitalDropdown);
    }
    
    public void enterLoginId(String key) {
  		FlutterElement loginId= finder.byValueKey("loginidinput");
  		loginId.sendKeys(key);
      }
    
    
    public void ClickOnSignOutButton() {
    	FlutterElement sideMenu= finder.byValueKey("sidemenu");
    	sideMenu.click();
    	
    	FlutterElement logout= finder.byText("Log Out");
    	logout.click();
    }
    
    
    
    public void ClickOnNavAppointmentButton() {
		Click(AppointmentsIcon);
		
    }
    
    public void ClickOnExistingTabs() {
		Click(SurgeryTab);
		
    }
    public void ClickOnNavReportButton() {
    	Click(ReportsIcon);
    }
    
    public void ClickOnNavVisitsButton() {
    	Click(VisitsIcon);
    }
    
    public void ClickOnNavProfileButton() {
    	Click(ProfileIcon);
		
    }
    
    public void ClickOnNavHomeButton() {
    	Click(HomeIcon);
    }
   
    public void ClickOnSideMenu() {
		FlutterElement sidemenu= finder.byValueKey("sidemenu");
		sidemenu.click();
		
		FlutterElement sidemenu_dashbaord= finder.byText("Dashboard");
		sidemenu_dashbaord.click();
		
		FlutterElement sidemenu_wellness= finder.byText("IMC Wellness");
		sidemenu_wellness.click();
		
		FlutterElement sidemenu_virtualtour= finder.byText("Virtual Tour");
		sidemenu_virtualtour.click();
		
		FlutterElement sidemenu_contactus= finder.byText("Contact Us");
		sidemenu_contactus.click();
		
		FlutterElement sidemenu_location= finder.byText("Location Map");
		sidemenu_location.click();
		
		FlutterElement sidemenu_setting= finder.byText("Settings");
		sidemenu_setting.click();
		
		FlutterElement sidemenu_about= finder.byText("About Us");
		sidemenu_about.click();
		
		FlutterElement sidemenu_logout= finder.byText("Logout");
		sidemenu_logout.click();
	
		
    }
    
    public void ClickOnReports() {
	
		
		FlutterElement sidemenu_dashbaord= finder.byText("Laboratory Reports");
		sidemenu_dashbaord.click();
		
		FlutterElement sidemenu_wellness= finder.byText("Operative Reports");
		sidemenu_wellness.click();
		
		FlutterElement sidemenu_virtualtour= finder.byText("Cardiology Reports");
		sidemenu_virtualtour.click();
		
		FlutterElement sidemenu_contactus= finder.byText("Discharge Reports");
		sidemenu_contactus.click();
		
		FlutterElement sidemenu_location= finder.byText("Sick Leave Reports");
		sidemenu_location.click();
		
		FlutterElement sidemenu_setting= finder.byText("Request a Report");
		sidemenu_setting.click();
		
	
    }
   
    
    public void ManageAppointment() {
    	
//    	FlutterElement sidemenu_dashbaord= finder.byValueKey("manage_appointment");
//		sidemenu_dashbaord.click();
//		
//		FlutterElement sidemenu_wellness= finder.byValueKey("home_health_care");
//		sidemenu_wellness.click();
//		
//		FlutterElement sidemenu_virtualtour= finder.byValueKey("second_opinion");
//		ScrolltoElement(sidemenu_virtualtour);
//	
//	        FlutterElement element = (FlutterElement) driver.findElement(AppiumBy.flutterFind(
//	        	    finder.byValueKey("yourValueKey")
//	        	));
//		FlutterElement sidemenu_contactus= finder.byValueKey("family_profile");
//		sidemenu_contactus.click();
//		
//		FlutterElement sidemenu_location= finder.byValueKey("feedback");
//		sidemenu_location.click();
//		
//		FlutterElement sidemenu_setting= finder.byValueKey("chatbot");
//		sidemenu_setting.click();
    	
    }
    
    
    public void ClickOnNotification() {
    	FlutterElement notification = finder.byValueKey("notification");
    	notification.click();
    }
    
    
    public void ClickOnLanguageCancelButton() {
    	FlutterElement languagebtn = finder.byValueKey("languagebtn");
    	languagebtn.click();
    
    	FlutterElement langyesbtn = finder.byValueKey("langcancelbtn");
    	langyesbtn.click();
    	
    }
    
    
    public boolean VerifyIMCDashboard() {
    	return isButtonDisplaying_AccessibilityID(imcDashboard);
		
    }
    
    public boolean VerifyIMCHospital() {
    	return isButtonDisplaying_AccessibilityID(IMC);
		
    }
    
    public boolean VerifyFirstClinic() {
    	return isButtonDisplaying_AccessibilityID(FirstClinic);
		
    }
    
    public boolean VerifyKAUSTHealth() {
    	return isButtonDisplaying_AccessibilityID(KAUSTHealth);
		
    }
    
    public boolean VerifyRedSeaMallClinic() {
    	return isButtonDisplaying_AccessibilityID(RedSeaMallClinic);
		
    }
    
    
    public boolean VerifyHomeIcon() {
    	return isDisplaying(HomeIcon);
		
    }
    

    public boolean VerifyReportsIcon() {
    	return isDisplaying(ReportsIcon);
		
    }
    public boolean VerifyAppointmentsIcon() {
    	return isDisplaying(AppointmentsIcon);
		
    }
    
    public boolean VerifyVisitsIcon() {
    	return isDisplaying(VisitsIcon);
		
    }
    public boolean VerifyProfileIcon() {
    	return isDisplaying(ProfileIcon);
		
    }
    
    
}
