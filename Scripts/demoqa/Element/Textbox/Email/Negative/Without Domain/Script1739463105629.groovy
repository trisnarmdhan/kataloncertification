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
 * 3. Navigate to URL demoqa.com/text-box
 * 4. Scroll to Element 'demoqa/Elements/Textbox/inputFullName' with value '0'
 * 5. Input the Element 'demoqa/Elements/Textbox/inputEmail' with the value of the local variable 'input'
 * 6. Click the Element 'demoqa/Elements/Textbox/btnSubmit'
 * 7. Mouse Hover to Element 'demoqa/Elements/Textbox/inputEmail'
 * 8. Add delay with value '3'
 * 9. Get Attribute to Element 'demoqa/Elements/Textbox/inputEmail' with value 'validationMessage'
 * 7. Add step Verify Element Attribute Value for Element 'demoqa/Elements/Textbox/inputEmail' with AttributeName value 'validationMessage' and AttributeValue with the value of the local variable 'Message' and Number value '0'
 * 8. Close Browser
 */
// Open a Chrome Browser
WebUI.openBrowser('')

// Maximize the Window
WebUI.maximizeWindow()

// Navigate to URL demoqa.com/text-box
WebUI.navigateToUrl('https://demoqa.com/text-box')

// Scroll to Element 'demoqa/Elements/Textbox/inputFullName' with value '0'
WebUI.scrollToElement(findTestObject('demoqa/Elements/Textbox/inputFullName'), 0)

// Input the Element 'demoqa/Elements/Textbox/inputEmail' with the value of the local variable 'input'
WebUI.setText(findTestObject('demoqa/Elements/Textbox/inputEmail'), input)

// Click the Element 'demoqa/Elements/Textbox/btnSubmit'
WebUI.click(findTestObject('demoqa/Elements/Textbox/btnSubmit'))

// Mouse Hover to Element 'demoqa/Elements/Textbox/inputEmail'
WebUI.mouseOver(findTestObject('demoqa/Elements/Textbox/inputEmail'))

// Add delay with value '3'
WebUI.delay(3)

// Get Attribute to Element 'demoqa/Elements/Textbox/inputEmail' with value 'validationMessage'
String validationMessage = WebUI.getAttribute(findTestObject('demoqa/Elements/Textbox/inputEmail'), 'validationMessage')

// Add step Verify Element Attribute Value for Element 'demoqa/Elements/Textbox/inputEmail' with AttributeName value 'validationMessage' and AttributeValue with the value of the local variable 'Message' and Number value '0'
WebUI.verifyElementAttributeValue(findTestObject('demoqa/Elements/Textbox/inputEmail'), 'validationMessage', Message, 0)

// Close Browser
WebUI.closeBrowser()