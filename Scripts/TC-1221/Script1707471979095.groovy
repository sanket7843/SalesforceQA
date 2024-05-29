import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/* This script automates the Salesforce login process, creates a new account, and adds a contact to the account. 
 * Finally, it logs out from the application.
*/

WebUI.openBrowser('https://mindful-badger-r5gt64-dev-ed.trailblaze.lightning.force.com/lightning/page/home')

WebUI.maximizeWindow()

//login into the application
WebUI.setText(findTestObject('Object Repository/Salesforce Object/Page_Login  Salesforce/input_Username_username'), GlobalVariable.Profile_USER)

WebUI.setEncryptedText(findTestObject('Object Repository/Salesforce Object/Page_Login  Salesforce/input_Password_pw'), GlobalVariable.Profile_PSW)

WebUI.verifyElementPresent(findTestObject('Object Repository/Salesforce Object/Page_Login  Salesforce/input_Password_Login'), 
    10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Salesforce Object/Page_Login  Salesforce/input_Password_Login'))

//Navigate to the sales cloud. 
WebUI.navigateToUrl('https://mindful-badger-r5gt64-dev-ed.trailblaze.lightning.force.com/lightning/o/Account/list?filterName=Recent')

WebUI.click(findTestObject('Object Repository/MindfulBadgerDevOrg/Page_All Accounts  Accounts  Salesforce/a_New'))

//Give values to the input fields
WebUI.setText(findTestObject('Object Repository/MindfulBadgerDevOrg/Page_New Account  Salesforce/input__Name'), 'Automation')

WebUI.setText(findTestObject('Object Repository/MindfulBadgerDevOrg/Page_New Account  Salesforce/input_Annual Revenue_AnnualRevenue'), 
    '177482')

WebUI.click(findTestObject('Object Repository/MindfulBadgerDevOrg/Page_New Account  Salesforce/button_Save'))

//verify the account is created successfully
WebUI.verifyElementPresent(findTestObject('Object Repository/MindfulBadgerDevOrg/Page_Test Account  Account  Salesforce/lightning-formatted-text_Test Account'), 
    30)

//Create a contact
WebUI.click(findTestObject('Object Repository/MindfulBadgerDevOrg/Page_Test Account  Account  Salesforce/button_New Contact'))

WebUI.setText(findTestObject('Object Repository/MindfulBadgerDevOrg/Page_New Contact  Salesforce/input__31300'), 'Demo')

WebUI.click(findTestObject('Object Repository/MindfulBadgerDevOrg/Page_New Contact  Salesforce/button_Save'))

//verify the contact is created successfully with the account object
WebUI.verifyElementPresent(findTestObject('Object Repository/MindfulBadgerDevOrg/Page_Test Account  Account  Salesforce/span_Demo'), 
    30)

//Logout from the application
WebUI.click(findTestObject('Object Repository/MindfulBadgerDevOrg/Page_Test Account  Account  Salesforce/span_Notifications_uiImage'))

WebUI.click(findTestObject('Object Repository/MindfulBadgerDevOrg/Page_Test Account  Account  Salesforce/a_Log Out'))

WebUI.closeBrowser()

