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

/*
 * Write a Katalon Studio Test Case to perform the following steps:
 * 1. Open a Chrome Browser
 * 2. Maximize the Window
 * 3. Navigate to URL with value of the Test Data Value 'Data Files/GENERAL/Link' with column '1' and row '1'
 * 4. Scroll to Element 'demoqa/Elements/Textbox/inputFullName' with value '0'
 * 5. Input the Element 'demoqa/Elements/Textbox/txtPermanentAddress' with the value of the local variable 'input'
 * 6. Click the Element 'demoqa/Elements/Textbox/btnSubmit'
 * 7. Verify Text Present with the value of the local variable 'expectedResult'
 * 8. Close Browser
 */
// Open a Chrome Browser
WebUI.openBrowser('')

// Maximize the Window
WebUI.maximizeWindow()

// Navigate to URL with value of the Test Data Value 'Data Files/GENERAL/Link' with column '1' and row '1'
WebUI.navigateToUrl(findTestData('Data Files/GENERAL/URL').getValue(1, 1))

// Scroll to Element 'demoqa/Elements/Textbox/inputFullName' with value '0'
WebUI.scrollToElement(findTestObject('demoqa/Elements/Textbox/inputFullName'), 0)

// Input the Element 'demoqa/Elements/Textbox/txtPermanentAddress' with the value of the local variable 'input'
WebUI.setText(findTestObject('demoqa/Elements/Textbox/txtPermanentAddress'), input)

// Click the Element 'demoqa/Elements/Textbox/btnSubmit'
WebUI.click(findTestObject('demoqa/Elements/Textbox/btnSubmit'))

// Verify Text Present with the value of the local variable 'expectedResult'
WebUI.verifyTextPresent(expectedResult, false)

// Close Browser
WebUI.closeBrowser()
