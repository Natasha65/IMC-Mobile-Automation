package com.imc.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.imc.base.BaseClass;
import com.imc.errorCollectors.ErrorCollector;
import com.imc.pages.AppointmentsPage;
import com.imc.pages.DashboardPage;
import com.imc.pages.LoginPage;

import junit.framework.Assert;


public class AppointmentsTest extends BaseClass {
	
	@Test(priority = 1 , enabled=true)
	public void Verify_UserCanSearchAppointment_By_Doctor() throws InterruptedException, IOException {

	try {
		setupReport();
		setupAppiumDriver();
		
		LoginPage loginPage = new LoginPage();
		AppointmentsPage appointmentsPage=new AppointmentsPage();
		DashboardPage dashboardPage=new DashboardPage();

		String doctorName="Adeeb Bulkhi";
		int step = 1;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Navigating to application");
		Thread.sleep(10000);
		step++;
		
		step=loginPage.login(step);
		Thread.sleep(10000);
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On Hospital Dropdown");
		dashboardPage.SelectHospital();
		Thread.sleep(15000);
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On <b>'Appointment Icon'</b>");
		dashboardPage.ClickOnNavAppointmentButton();
		step++;
	
		ErrorCollector.extentLogInfo("Step " + step + " : Search Doctor :  <b>"+doctorName+"</b>");
		appointmentsPage.SearchDoctor(doctorName);
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Verify <b> Searched Doctor Name : " + doctorName + "</b> is displaying ");
		ErrorCollector.verifyTrue(appointmentsPage.VerifySearchedDoctorResult(doctorName),"Verified: <b> Searched Doctor Name : " + doctorName + "</b> is displaying ");
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

	@Test(priority = 2 ,enabled=true)
	public void Verify_UserCanSearchAppointment_By_Clinic() throws InterruptedException, IOException {

	try {
		setupReport();
		setupAppiumDriver();
		
		LoginPage loginPage = new LoginPage();
		AppointmentsPage appointmentsPage=new AppointmentsPage();
		DashboardPage dashboardPage=new DashboardPage();

		String clinicName="Cardiac Surgery";
		int step = 1;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Navigating to application");
		Thread.sleep(10000);
		step++;
		
		step=loginPage.login(step);
		Thread.sleep(10000);
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On Hospital Dropdown");
		dashboardPage.SelectHospital();
		Thread.sleep(30000);
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On <b>'Appointment Icon'</b>");
		dashboardPage.ClickOnNavAppointmentButton();
		step++;
	
		ErrorCollector.extentLogInfo("Step " + step + " Search by Clinic :  <b>"+clinicName+"</b>");
		appointmentsPage.SearchDoctor(clinicName);
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + "Verify <b> Searched Clinic Name : " + clinicName + "</b> is displaying ");
		ErrorCollector.verifyTrue(appointmentsPage.VerifySearchedDoctorResult(clinicName),"Verified: <b> Searched Clinic Name : " + clinicName + "</b> is displaying ");
		step++;

	}
	catch(Exception e) {
		e.printStackTrace();
		Assert.fail();
	}finally {
        if (driver != null) {
            Runtime.getRuntime().exec("adb shell am force-stop sa.med.imc.myimc"); 
            driver.quit(); 
        }
	}
	
	}


//	@Test(priority = 3, enabled=true)
	public void Verify_UserCanSearchAppointment_By_Existing_Tabs() throws InterruptedException, IOException {

	try {
		setupReport();
		setupAppiumDriver();
		
		LoginPage loginPage = new LoginPage();
		AppointmentsPage appointmentsPage=new AppointmentsPage();
		DashboardPage dashboardPage=new DashboardPage();

		String clinicName="Cardiac Surgery";
		int step = 1;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Navigating to application");
		Thread.sleep(10000);
		step++;
		
		step=loginPage.login(step);
		Thread.sleep(10000);
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On Hospital Dropdown");
		dashboardPage.SelectHospital();
		Thread.sleep(30000);
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On <b>'Appointment Icon'</b>");
		dashboardPage.ClickOnNavAppointmentButton();
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On <b>'Cardiac Surgery Tabs'</b>");
		dashboardPage.ClickOnExistingTabs();
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + "Verify <b> Searched Doctor Name : " + clinicName + "</b> is displaying ");
		ErrorCollector.verifyTrue(appointmentsPage.VerifySearchedDoctorResult(clinicName),"Verified: <b> Searched Doctor Name : " + clinicName + "</b> is displaying ");
		step++;

	}
	catch(Exception e) {
		e.printStackTrace();
		Assert.fail();
	}finally {
        if (driver != null) {
            Runtime.getRuntime().exec("adb shell am force-stop sa.med.imc.myimc"); 
            driver.quit(); 
        }
	}
	
	}	

	@Test(priority = 4, enabled=true)
	public void Verify_UserCan_BookAnAppointment_Successfully() throws InterruptedException, IOException {

	try {
		setupReport();
		setupAppiumDriver();
		
		LoginPage loginPage = new LoginPage();
		AppointmentsPage appointmentsPage=new AppointmentsPage();
		DashboardPage dashboardPage=new DashboardPage();

		String clinicName="General Cardiology";
		String doctorName="Nadir";
		int step = 1;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Navigating to application");
		Thread.sleep(30000);
		step++;
		
		step=loginPage.login(step);
		Thread.sleep(10000);
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On Hospital Dropdown");
		dashboardPage.SelectHospital();
		Thread.sleep(30000);
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On <b>'Appointment Icon'</b>");
		dashboardPage.ClickOnNavAppointmentButton();
		step++;
	
		ErrorCollector.extentLogInfo("Step " + step + " : Search Doctor :  <b>"+doctorName+"</b>");
		appointmentsPage.SearchDoctor(doctorName);
		Thread.sleep(10000);
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On <b>'Doctor Profile'</b>");
		appointmentsPage.ClickOnDoctorProfile(doctorName);
		step++;
		
		
		ErrorCollector.extentLogInfo("Step " + step + " : Select <b> Month Slot </b> ");
		appointmentsPage.SelectMonth();
		step++;

		ErrorCollector.extentLogInfo("Step " + step + " : Select <b> Date Slot </b> ");
		appointmentsPage.selectDate();
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " :Select <b>  Time Slot </b> ");
		appointmentsPage.selectTime();
		step++;
		
		ErrorCollector.extentLogInfo("*****  Verify <b> Slot Details </b> ***** ");
		ErrorCollector.extentLogInfo("*****  Verify <b> Location </b> ***** ");
		ErrorCollector.verifyTrue(appointmentsPage.VerifySlotLocation(),"Verified: 'Location' is Displaying");
		
		ErrorCollector.extentLogInfo("*****  Verify <b> Clinic </b> ***** ");
		ErrorCollector.verifyTrue(appointmentsPage.VerifySlotClinic(clinicName),"Verified: 'Clinic' is Displaying");
		
		ErrorCollector.extentLogInfo("*****  Verify <b> Doctor Name </b> ***** ");
		ErrorCollector.verifyTrue(appointmentsPage.VerifyDoctorName(doctorName),"Verified: 'Doctor Name' is Displaying");
		
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On <b> Confirm </b> Button ");
		appointmentsPage.ClickOnConfirmSlotButton();
		step++;
	
		
		ErrorCollector.extentLogInfo("Step " + step + "Verify <b> Success </b> Message is displaying ");
		ErrorCollector.verifyTrue(appointmentsPage.VerifyAppointmentSuccessMessage(),"Verified: 'Success Message' is Displaying");
		step++;
		
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On <b> Ok </b> Button ");
		appointmentsPage.ClickOnConfirmSlotOKButton();
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
	
	@Test(priority = 5, enabled=true)
	public void Verify_UserIsUnable_To_BookAnAppointment_ToBookedSlot() throws InterruptedException, IOException {

	try {
		setupReport();
		setupAppiumDriver();
		
		LoginPage loginPage = new LoginPage();
		AppointmentsPage appointmentsPage=new AppointmentsPage();
		DashboardPage dashboardPage=new DashboardPage();

		String clinicName="General Cardiology";
		String doctorName="Nadir";
		int step = 1;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Navigating to application");
		Thread.sleep(30000);
		step++;
		
		step=loginPage.login(step);
		Thread.sleep(10000);
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On Hospital Dropdown");
		dashboardPage.SelectHospital();
		Thread.sleep(30000);
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On <b>'Appointment Icon'</b>");
		dashboardPage.ClickOnNavAppointmentButton();
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " Search by Doctor :  <b>"+doctorName+"</b>");
		appointmentsPage.SearchDoctor(doctorName);
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On <b>'Doctor Profile'</b>");
		appointmentsPage.ClickOnDoctorProfile(doctorName);
		step++;
		
		
		ErrorCollector.extentLogInfo("Step " + step + " Select <b> Month Slot </b> ");
		appointmentsPage.SelectMonth();
		step++;

		ErrorCollector.extentLogInfo("Step " + step + " Select <b> Date Slot </b> ");
		appointmentsPage.selectDate();
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " Select <b>  Time Slot </b> ");
		appointmentsPage.selectTime();
		step++;
		
		ErrorCollector.extentLogInfo("*****  Verify <b> Slot Details </b> ***** ");
		ErrorCollector.extentLogInfo("*****  Verify <b> Location </b> ***** ");
		ErrorCollector.verifyTrue(appointmentsPage.VerifySlotLocation(),"Verified: 'Location' is Displaying");
		
		ErrorCollector.extentLogInfo("*****  Verify <b> Clinic </b> ***** ");
		ErrorCollector.verifyTrue(appointmentsPage.VerifySlotClinic(clinicName),"Verified: 'Clinic' is Displaying");
		
		ErrorCollector.extentLogInfo("*****  Verify <b> Doctor Name </b> ***** ");
		ErrorCollector.verifyTrue(appointmentsPage.VerifyDoctorName(doctorName),"Verified: 'Doctor Name' is Displaying");
		
		
		ErrorCollector.extentLogInfo("Step " + step + "Click On <b> Confirm </b> Button ");
		appointmentsPage.ClickOnConfirmSlotButton();
		step++;
	
		
		ErrorCollector.extentLogInfo("Step " + step + "Verify <b> Error </b> Message is displaying ");
		ErrorCollector.verifyTrue(appointmentsPage.VerifyAppointmentDeniedMessage(),"Verified: 'Error Message' is Displaying");
		step++;
		
		
		ErrorCollector.extentLogInfo("Step " + step + "Click On <b> Ok </b> Button ");
		appointmentsPage.ClickOnConfirmSlotOKButton();
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

	
	@Test(priority = 6, enabled=true)
	public void Verify_User_Can_Cancel_ExistingAppoinment() throws InterruptedException, IOException {

	try {
		setupReport();
		setupAppiumDriver();
	
		LoginPage loginPage = new LoginPage();
		AppointmentsPage appointmentsPage=new AppointmentsPage();
		DashboardPage dashboardPage=new DashboardPage();
	
		int step = 1;
		String doctorName="Nadir";
		
		ErrorCollector.extentLogInfo("Step " + step + " : Navigating to application");
		Thread.sleep(30000);
		step++;
		
		step=loginPage.login(step);
		Thread.sleep(10000);
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On Hospital Dropdown");
		dashboardPage.SelectHospital();
		Thread.sleep(30000);
		step++;
		
//		driver.navigate().refresh();
		ErrorCollector.extentLogInfo("Step " + step + "Verify <b> Booked Slot  </b> is displaying ");
		ErrorCollector.verifyTrue(appointmentsPage.VerifyBookedSlot(doctorName),"Verified: 'Booked Slot' is Displaying");
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + "Click On <b> Three Dots </b> Of Booked Appointment");
		appointmentsPage.ClickOnThreeDots();
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + "Click On <b> Cancel Button</b> Of Booked Appointment");
		appointmentsPage.ClickOnCancelButton();
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + "Click On <b> Yes</b>");
		appointmentsPage.ClickOnYes();
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + "Verify <b> Booked Slot  </b> is cancelled successfully ");
		ErrorCollector.verifyTrue(appointmentsPage.VerifyBookedSlot(doctorName),"Verified: 'Booked Slot' is cancelled successfully");
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


