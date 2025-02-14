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

WebUI.navigateToUrl(GlobalVariable.democura)

WebUI.click(findTestObject('democura/btnMakeAppointment'))

WebUI.setText(findTestObject('democura/inputUsername'), username)

WebUI.setEncryptedText(findTestObject('democura/inputPassword'), password)

WebUI.click(findTestObject('democura/btnLogin'))

for (def n : (0..2)) {
    WebUI.selectOptionByIndex(findTestObject('democura/ddlHealthcareCenter'), 1)

    WebUI.click(findTestObject('democura/cbReadmission'), FailureHandling.STOP_ON_FAILURE)

    if (n == 0) {
        WebUI.click(findTestObject('democura/cbMedicare'), FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(1)
    } else if (n == 1) {
        WebUI.click(findTestObject('democura/cbMedicaid'), FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(1)
    } else {
        WebUI.click(findTestObject('democura/cbNone'), FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(1)
    }
    
    WebUI.setText(findTestObject('democura/inputVisitDate'), '01/01/1998')

    WebUI.setText(findTestObject('democura/txtComment'), 'Automation Test')

    WebUI.click(findTestObject('democura/btnBookAppointment'))

    WebUI.verifyElementPresent(findTestObject('democura/h2AppointmentConfirmation'), 3)

    WebUI.click(findTestObject('democura/btnGoToHomepage'))
}

WebUI.closeBrowser()

