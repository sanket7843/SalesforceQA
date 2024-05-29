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

WebUI.openBrowser('')
 
WebUI.navigateToUrl('https://mindful-badger-r5gt64-dev-ed.trailblaze.my.salesforce.com/')

WebUI.setText(findTestObject('Object Repository/Page_Login  Salesforce/input_Username_username (3)'), 'sanket.dudhe@mindful-badger-r5gt64.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_pw (3)'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_Login (2)'))

WebUI.click(findTestObject('Object Repository/Page_Home  Salesforce/button_App Launcher'))

WebUI.click(findTestObject('Object Repository/Page_Home  Salesforce/div_Sales'))

WebUI.click(findTestObject('Object Repository/Page_Home  Salesforce/span_Accounts (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Recently Viewed  Accounts  Salesforce/a_American Banking Corp (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Recently Viewed  Accounts  Salesforce/a_New (1)'))

WebUI.click(findTestObject('Object Repository/Page_New Account  Salesforce/input__Name (1)'))

WebUI.click(findTestObject('Object Repository/Page_New Account  Salesforce/button_Save (1)'))

WebUI.click(findTestObject('Object Repository/Page_Demo Test  Account  Salesforce/span_Accounts'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Recently Viewed  Accounts  Salesforce/a_Demo Test (1)'), 
    0)

WebUI.closeBrowser()

