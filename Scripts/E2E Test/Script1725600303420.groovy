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

WebUI.navigateToUrl('https://sites.google.com/view/satisfies/home')

WebUI.click(findTestObject('Object Repository/Page_Satisfies/div_Skip to navigation_s9iPrd'))

WebUI.click(findTestObject('Object Repository/Page_Satisfies/a_History'))

WebUI.click(findTestObject('Object Repository/Page_Satisfies - History/path_Skip to navigation_HBu6N'))

WebUI.click(findTestObject('Object Repository/Page_Satisfies - History/a_Team'))

WebUI.click(findTestObject('Object Repository/Page_Satisfies - Team/div_Skip to navigation_s9iPrd'))

WebUI.click(findTestObject('Object Repository/Page_Satisfies - Team/a_FAQ'))

WebUI.click(findTestObject('Object Repository/Page_Satisfies - FAQ/svg_Skip to navigation_wFCWne'))

WebUI.click(findTestObject('Object Repository/Page_Satisfies - FAQ/a_Home'))

WebUI.closeBrowser()

