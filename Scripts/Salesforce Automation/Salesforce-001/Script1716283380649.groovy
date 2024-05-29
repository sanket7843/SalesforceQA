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
//
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://mindful-badger-r5gt64-dev-ed.trailblaze.my.salesforce.com/')
//
//WebUI.setText(findTestObject('Object Repository/Page_Login  Salesforce/input_Username_username (1)'), 'sanket.dudhe@mindful-badger-r5gt64.com')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_pw (1)'), 'cvW8qx4B2o3F4VwP/kNsqA==')
//
//WebUI.sendKeys(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_pw (1)'), Keys.chord(Keys.ENTER))
//
//WebUI.click(findTestObject('Object Repository/Page_Home  Salesforce/div_Notifications_profileTrigger branding-u_5d7f4b'))
//
//WebUI.click(findTestObject('Object Repository/Page_Home  Salesforce/a_Log Out'))
//
//WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/frames')

WebUI.verifyElementText(findTestObject('Object Repository/Page_DEMOQA/div_Sample Iframe page There are 2 Iframes _9bd0b1'), 
    'below')

WebUI.verifyElementText(findTestObject('Object Repository/Page_DEMOQA/h1_This is a sample page'), 'This is a sample page')

WebUI.verifyElementText(findTestObject('Object Repository/Page_DEMOQA/h1_This is a sample page (1)'), 'This is a sample page')

