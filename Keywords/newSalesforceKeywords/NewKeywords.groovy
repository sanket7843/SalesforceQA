package newSalesforceKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.util.logging.Log
import internal.GlobalVariable

public class NewKeywords {

	/**
	 * Logs into the application with provided credentials.
	 * @param username: The username to log in with.
	 * @param password: The password associated with the username.
	 */
	
	@Keyword
	def loginToSalesforce(String user, String pw) {

		WebUI.openBrowser('https://mindful-badger-r5gt64-dev-ed.trailblaze.lightning.force.com/lightning/page/home')
		
		println("logging with ${user} and ${pw}");
		
		KeywordLogger logger = new KeywordLogger()
		logger.logInfo("Info")
		logger.logError("Error")
		logger.logSkipped("Skipped")
		
		WebUI.maximizeWindow()

		//login into the application
		WebUI.setText(findTestObject('Object Repository/Salesforce Object/Page_Login  Salesforce/input_Username_username'), user)

		WebUI.setEncryptedText(findTestObject('Object Repository/Salesforce Object/Page_Login  Salesforce/input_Password_pw'), pw)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Salesforce Object/Page_Login  Salesforce/input_Password_Login'),
				10, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/Salesforce Object/Page_Login  Salesforce/input_Password_Login'))
	}
	
	/*
	 * Error Handling
	 * @Keyword
		def loginToSalesforce(String username, String password) {
		    try {
		        WebUI.openBrowser('')
		        WebUI.navigateToUrl('https://login.salesforce.com/')
		        WebUI.setText(findTestObject('Object Repository/LoginPage/UsernameField'), username)
		        WebUI.setText(findTestObject('Object Repository/LoginPage/PasswordField'), password)
		        WebUI.click(findTestObject('Object Repository/LoginPage/LoginButton'))
		    } catch (Exception e) {
		        WebUI.comment("Error occurred during login: " + e.message)
		    }
		}

	 * 
	 * Returning Values
	 * @Keyword
			def boolean isLoginSuccessful() {
			   WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Dashboard'), 10)
			}
	 * 
	 * 
	 * */

	@Keyword
	def logoutFromSalesforce() {

		//Logout from the application
		WebUI.click(findTestObject('Object Repository/MindfulBadgerDevOrg/Page_Test Account  Account  Salesforce/span_Notifications_uiImage'))

		WebUI.click(findTestObject('Object Repository/MindfulBadgerDevOrg/Page_Test Account  Account  Salesforce/a_Log Out'))

		WebUI.closeBrowser()
	}
	
	@Keyword
	def createNewContact(String firstName, String lastName, String accountName) {
		// Navigate to the Contacts tab
		WebUI.navigateToUrl('https://your-salesforce-instance.lightning.force.com/lightning/o/Contact/list?filterName=Recent')

		// Click on the New button
		WebUI.click(findTestObject('Object Repository/ContactPage/NewButton'))

		// Fill in the contact details
		WebUI.setText(findTestObject('Object Repository/ContactPage/FirstNameField'), firstName)
		WebUI.setText(findTestObject('Object Repository/ContactPage/LastNameField'), lastName)
		WebUI.setText(findTestObject('Object Repository/ContactPage/AccountNameField'), accountName)

		// Save the new contact
		WebUI.click(findTestObject('Object Repository/ContactPage/SaveButton'))
		
		// Verify the contact is created successfully
		WebUI.verifyElementPresent(findTestObject('Object Repository/ContactPage/ContactCreatedSuccessMessage'), 30)
	}
	
	
	/*
	 * Error Handling
	 * 
	 * @Keyword
		def createNewContact(String firstName, String lastName, String accountName) {
		    try {
		        WebUI.navigateToUrl('https://your-salesforce-instance.lightning.force.com/lightning/o/Contact/list?filterName=Recent')
		        WebUI.click(findTestObject('Object Repository/ContactPage/NewButton'))
		        WebUI.setText(findTestObject('Object Repository/ContactPage/FirstNameField'), firstName)
		        WebUI.setText(findTestObject('Object Repository/ContactPage/LastNameField'), lastName)
		        WebUI.setText(findTestObject('Object Repository/ContactPage/AccountNameField'), accountName)
		        WebUI.click(findTestObject('Object Repository/ContactPage/SaveButton'))
		        WebUI.verifyElementPresent(findTestObject('Object Repository/ContactPage/ContactCreatedSuccessMessage'), 30)
		    } catch (Exception e) {
		        WebUI.comment("Error occurred while creating contact: " + e.message)
		    }
		}

	 * 
	 * Return value
	 * @Keyword
		def boolean isContactCreationSuccessful() {
		    return WebUI.verifyElementPresent(findTestObject('Object Repository/ContactPage/ContactCreatedSuccessMessage'), 30)
		}
	 * 
	 * 
	 * */

	
}
