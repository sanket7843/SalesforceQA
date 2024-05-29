package newSalesforceKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class loginKeyword {

	@Keyword
	def loginToSalesforce() {

		WebUI.openBrowser('https://mindful-badger-r5gt64-dev-ed.trailblaze.lightning.force.com/lightning/page/home')

		WebUI.maximizeWindow()

		//login into the application
		WebUI.setText(findTestObject('Object Repository/Salesforce Object/Page_Login  Salesforce/input_Username_username'), GlobalVariable.Profile_USER)

		WebUI.setEncryptedText(findTestObject('Object Repository/Salesforce Object/Page_Login  Salesforce/input_Password_pw'), GlobalVariable.Profile_PSW)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Salesforce Object/Page_Login  Salesforce/input_Password_Login'),
				10, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/Salesforce Object/Page_Login  Salesforce/input_Password_Login'))
	}

	@Keyword
	def logoutFromSalesforce() {

		//Logout from the application
		WebUI.click(findTestObject('Object Repository/MindfulBadgerDevOrg/Page_Test Account  Account  Salesforce/span_Notifications_uiImage'))

		WebUI.click(findTestObject('Object Repository/MindfulBadgerDevOrg/Page_Test Account  Account  Salesforce/a_Log Out'))

		WebUI.closeBrowser()
	}
}
