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

WebUI.openBrowser('https://bda.co.th/')

//Check Home Button
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Test BDA/HOME BT'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Test BDA/PORTFOLIO bt'))
WebUI.delay(3)

//Test Menu CLIENT
WebUI.click(findTestObject('Object Repository/Test BDA/CLIENT BT'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Test BDA/CLIENT BT ALL'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Test BDA/CLIENT BT BDT'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Test BDA/CLIENT BT SYS IN'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Test BDA/CLIENT BT ANM'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Test BDA/CLIENT BT APP'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Test BDA/CAREERS BT'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Test BDA/Contact bt'))
WebUI.delay(3)

//Test Photo Gallary
WebUI.click(findTestObject('Object Repository/Test BDA/CLICK PHOTO'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Test BDA/PHOTO CLOSE'))
WebUI.delay(3)

WebUI.verifyTextPresent('CONTACT', false)
WebUI.delay(5)