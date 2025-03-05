package com.imc.utilities;

public class Constants {

	public static String premiumSkippedTestCases = "<b>***************************************************************</b><br>"
			+ "Following Test Cases will be Skipped and will not add in Report<br>"
			+ "Due to Failure of <b>'VerifyFundsAvailable_Premium'</b><br>"
			+ "<b>***************************************************************</b><br>"
			+ "-> Verify_DifferentUser_PremiumPlan<br>"
			+ "-> CreateRecurringInvestment<br>"
			+ "-> CreateRecurringInvestmentThemeBasedVests<br>"
			+ "-> KYCApproved_FundedAccountPurchase_ThemeBasedVest<br>"
			+ "-> KYCApproved_FundedAccountPurchase_MultiAssetClass<br>"
			+ "-> Instruments_Sell<br>"
			+ "-> InstrumentsBuy_LimitOrder<br>"
			+ "-> InstrumentsBuy_StopOrder<br>"
			+ "-> InstrumentsSell_LimitOrder<br>"
			+ "-> InstrumentsSell_StopOrder<br>"
			+ "-> InstrumentBuyScenario<br>"
			+ "-> VerifyAndPurchaseETFFlow<br>"
			+ "-> VerifyAndPurchaseOTCFlow<br>"
			+ "-> VerifyAndPurchaseStockFlow<br>"
			+ "-> Instruments_Buy";

	public static String nonPremiumSkippedTestCases = "<b>***************************************************************</b> <br>"
			+ "Following Test Cases will be Skipped and will not add in Report<br>"
			+ "Due to Failure of <b>'VerifyFundsAvailable_NonPremium'</b>br>"
			+ "<b>***************************************************************</b><br>"
			+ "-> Verify_UserProfile_BasicPlan";

}
