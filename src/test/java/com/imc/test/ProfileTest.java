//package com.imc.test;
//
//import com.imc.base.BaseClass;
//import com.imc.errorCollectors.ErrorCollector;
//import com.imc.pages.LoginPage;
//import com.imc.pages.ProfilePage;
//
//public class ProfileTest extends BaseClass {
//	
//
//	
////	@Test(priority = 1)
//	public void Verify_EditProfile() throws InterruptedException {
//
//		initReport();
//		initConfiguration();
//		LoginPage loginPage = new LoginPage();
//		ProfilePage profilePage = new ProfilePage();
//
//		String number="000348";
//		String otp="4321";
//		String email="test@gmail.com";
//		String address_english="test address";
//		int step = 1;
//		
//		
//		ErrorCollector.extentLogInfo("Step " + step + " : Navigating to application");
//		step++;
//		
//		step=loginPage.login(step, otp , number);
//	
//		ErrorCollector.extentLogInfo("Step " + step + " : Click On <b>'Profile Icon'</b>");
//		profilePage.clickOnProfileButton();
//		step++;
//
//		ErrorCollector.extentLogInfo("Step " + step + " Enter Email <b>"+email+"</b>");
//		profilePage.Enter_Email(email);
//		step++;
//
//		ErrorCollector.extentLogInfo("Step " + step + " Enter English Address <b>"+address_english+"</b>");
//		profilePage.EnterEnglish_Address(email);
//		step++;
//
//		ErrorCollector.extentLogInfo("Step " + step + " : Click On <b>'Save Button'</b>");
//		profilePage.clickSaveButton();
//		step++;
//		
////		ErrorCollector.extentLogInfo("Step " + step + " : Verify <b>'Updated Profile' is displaying</b>");
////		loginPage.VerifyTheDashboardIsDisplaying();
////		step++;
//		
//		ErrorCollector.extentLogInfo("Step " + step + " : Closing the Application");
//	}
//	
//	
//	
//}
