package com.imc.test;
import java.net.*;
import org.testng.annotations.Test;
import com.imc.base.*;
import com.imc.errorCollectors.ErrorCollector;
import com.imc.pages.DashboardPage;
import com.imc.pages.LoginPage;
import junit.framework.Assert;
public class DashboardTest extends BaseClass {
	
    @Test(priority = 1)
	public void VerifyHospital_Dropdown_Of_Dashboard() throws InterruptedException, MalformedURLException {
	try {
    		setupReport();
    		setupAppiumDriver();
    		
    		LoginPage loginPage=new LoginPage();
    		DashboardPage dashboardPage=new DashboardPage();
    		int step=1;
    		
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Navigating to application");
    		step++;
    		step=loginPage.login(step);
    		

    		ErrorCollector.extentLogInfo("Step " + step + " : Click On Hospital Dropdown");
    		dashboardPage.ClickOnHospitalDropdown();
    		step++;
    		
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Verify <b> IMC Hospital </b> is displaying");
      		ErrorCollector.verifyTrue(dashboardPage.VerifyIMCHospital() , "Verified : <b> IMC Hospital </b> is displaying");
    		step++;
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Verify <b> First Clinic </b> is displaying");
      		ErrorCollector.verifyTrue(dashboardPage.VerifyFirstClinic() , "Verified :<b> First Clinic </b> is displaying");
    		step++;
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Verify <b> KAUST Health </b> is displaying");
      		ErrorCollector.verifyTrue(dashboardPage.VerifyKAUSTHealth() , "Verified :<b> KAUST Health  </b> is displaying");
    		step++;
    		

    		ErrorCollector.extentLogInfo("Step " + step + " : Verify <b> Red Sea Mall Clinic </b> is displaying");
      		ErrorCollector.verifyTrue(dashboardPage.VerifyRedSeaMallClinic() , "Verified :<b> Red Sea Mall Clinic </b> is displaying");
    		step++;
    		
    		ErrorCollector.extentLogInfo("Step " + step + " : Closing the Application");
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
			Assert.fail();
    	}
	}

    
    @Test(priority = 2)
	public void VerifyBottom_NavigationIcons_Of_Dashboard() throws InterruptedException, MalformedURLException {
	try {
		setupReport();
		setupAppiumDriver();
		
		LoginPage loginPage=new LoginPage();
		DashboardPage dashboardPage=new DashboardPage();
		int step=1;
		
		
		ErrorCollector.extentLogInfo("Step " + step + " : Navigating to application");
		step++;
		step=loginPage.login(step);
		
		ErrorCollector.extentLogInfo("Step " + step + " : Click On Hospital Dropdown");
		dashboardPage.SelectHospital();
		step++;
		
		
		ErrorCollector.extentLogInfo("Step " + step + " : Verify <b> Home </b> Icon is displaying");
  		ErrorCollector.verifyTrue(dashboardPage.VerifyHomeIcon() , "Verified : <b> Home <b/> Icon is displaying");
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Verify <b> Reports </b> Icon is displaying");
  		ErrorCollector.verifyTrue(dashboardPage.VerifyReportsIcon() , "Verified : <b> Reports <b/> Icon is displaying");
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Verify <b> Appointments </b> Icon is displaying");
  		ErrorCollector.verifyTrue(dashboardPage.VerifyAppointmentsIcon() , "Verified : <b> Appointmnets <b/> Icon is displaying");
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Verify <b> Visits </b> Icon is displaying");
  		ErrorCollector.verifyTrue(dashboardPage.VerifyVisitsIcon() , "Verified : <b> Visits <b/> Icon is displaying");
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Verify <b> Profile </b> Icon is displaying");
  		ErrorCollector.verifyTrue(dashboardPage.VerifyProfileIcon() , "Verified : <b> Profile <b/> Icon is displaying");
		step++;
		
		ErrorCollector.extentLogInfo("Step " + step + " : Closing the Application");
    	

    	}
    	catch(Exception e) {
    		e.printStackTrace();
			Assert.fail();
    	}
	}
  
	



}
