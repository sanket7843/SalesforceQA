import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.concurrent.TimeUnit

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
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver

//calling the login customKeyword
CustomKeywords.'newSalesforceKeywords.NewKeywords.loginToSalesforce'(GlobalVariable.Profile_USER, GlobalVariable.Profile_PSW)

//passing First Name, Last Name, Account Name 
CustomKeywords.'newSalesforceKeywords.NewKeywords.createNewContact'("John","Doe","Acme Corporation")

// Example code to create a Job Application with a lookup to Job Posting
WebUI.setText(findTestObject('Page_JobApplication/input_JobTitle'), 'Software Engineer')
WebUI.setText(findTestObject('Page_JobApplication/input_ApplicantName'), 'John Doe')
WebUI.selectOptionByLabel(findTestObject('Page_JobApplication/select_JobPosting'), 'Software Engineer - 2024', false)
WebUI.click(findTestObject('Page_JobApplication/button_Save'))

// Automation test to verify job application references the correct job posting
WebUI.verifyElementText(findTestObject('Page_JobApplicationDetail/field_JobPosting'), 'Software Engineer - 2024')

//--------------------------------------------------------------------------------------------------------------------//

// Example code to create a Patient Visit with a master-detail relationship to Patient Record
WebUI.setText(findTestObject('Page_PatientVisit/input_PatientName'), 'Jane Smith')
WebUI.setText(findTestObject('Page_PatientVisit/input_VisitDate'), '2024-05-21')
WebUI.selectOptionByLabel(findTestObject('Page_PatientVisit/select_PatientRecord'), 'Jane Smith - ID12345', false)
WebUI.click(findTestObject('Page_PatientVisit/button_Save'))

// Automation test to verify patient visit inherits changes from patient record
WebUI.click(findTestObject('Page_PatientRecord/button_Edit'))
WebUI.setText(findTestObject('Page_PatientRecord/input_Address'), '123 New Street')
WebUI.click(findTestObject('Page_PatientRecord/button_Save'))

// Verify the updated address reflects in related patient visits
WebUI.verifyElementText(findTestObject('Page_PatientVisitDetail/field_PatientAddress'), '123 New Street')

//calling the logout customKeyword
CustomKeywords.'newSalesforceKeywords.NewKeywords.logoutFromSalesforce'()
