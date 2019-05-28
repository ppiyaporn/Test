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

//Random String
String chars = 'abcdefghijklmnopqrstuvwxyz0123456789'
public static String randomString(String chars, int length) {
	Random rand = new Random();
	StringBuilder sb = new StringBuilder();
	for (int i=0; i<length; i++) {
	  sb.append(chars.charAt(rand.nextInt(chars.length())));
	}
	return sb.toString();
}
println('mai====='+ randomString(chars, 5) + "@gmail.com")

String randomEmail = randomString(chars, 5) + "@gmail.com"
String randomPassword = randomString(chars, 9)
String randomName = randomString(chars, 9)

//Register Katalon
WebUI.openBrowser(GlobalVariable.url)
WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/Signup_create_user_name'), randomName)
WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/create_user_email'), randomEmail)
WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/create_pass'), randomPassword)
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/singup_create_user'))
WebUI.delay(5)
WebUI.verifyTextPresent('Sign out', false)

//Sign out Before Login
WebUI.click(findTestObject('Object Repository/signout_katalon'))
WebUI.delay(6)
WebUI.verifyTextPresent('Login', false)
WebUI.delay(5)

//Login
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/login_katalon'))
WebUI.delay(6)

WebUI.setText(findTestObject('Object Repository/input_email'), randomEmail)
WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/input_pass'), randomPassword)
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/signin_button'))
WebUI.delay(5)
WebUI.verifyTextPresent('Sign out', false)
WebUI.delay(5)
