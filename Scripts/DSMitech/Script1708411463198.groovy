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

def dataExcel = findTestData("Data Files/excel")

def userName = dataExcel.getObjectValue("Username", 1)

def password = dataExcel.getObjectValue("Password", 1)

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/Swag Labs/Login Page/field_input'), userName)

WebUI.setText(findTestObject('Object Repository/Swag Labs/Login Page/field_password'), password)

WebUI.click(findTestObject('Object Repository/Swag Labs/Login Page/button_login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Swag Labs/Dashboard/label_product'))

WebUI.delay(10)

WebUI.closeBrowser()

