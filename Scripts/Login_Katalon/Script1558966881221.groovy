import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

String email = 'pengnamsuwan@gmail.com'
String password = 'MooMai1125'

WebUI.openBrowser('https://katalon.com/')


WebUI.delay(5)
WebUI.click(findTestObject('Login Takalon/login_katalon'))
WebUI.delay(6)

WebUI.setText(findTestObject('Login Takalon/input_email'), email)
WebUI.delay(5)
WebUI.setText(findTestObject('Login Takalon/input_pass'), password)
WebUI.delay(5)
WebUI.click(findTestObject('Login Takalon/signin_button'))
WebUI.delay(5)
WebUI.verifyTextPresent('Sign out', false)
WebUI.delay(5)
WebUI.click(findTestObject('Login Takalon/signout_katalon'))
WebUI.delay(6)
WebUI.verifyTextPresent('Login', false)
WebUI.delay(5)