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
 * 3. Navigate to URL with value of the Global Variable Name 'democbx'
 * 4. Scroll to Element 'demoqa/Elements/Checkbox/h1CheckBox' with value '0'
 * 5. Click 'demoqa/Elements/Checkbox/btnExpandAll'
 * 6. Click 'demoqa/Elements/Checkbox/cbxHome(All)'
 * 7. Verify Text Present 'home'
 * 8. Verify Text Present 'desktop'
 * 9. Verify Text Present 'notes'
 * 10. Verify Text Present 'commands'
 * 11. Verify Text Present 'documents'
 * 12. Verify Text Present 'workspace'
 * 13. Verify Text Present 'react'
 * 14. Verify Text Present 'angular'
 * 15. Verify Text Present 'veu'
 * 16. Verify Text Present 'office'
 * 17. Verify Text Present 'public'
 * 18. Verify Text Present 'privat'
 * 19. Verify Text Present 'classified'
 * 20. Verify Text Present 'general'
 * 21. Verify Text Present 'downloads'
 * 22. Verify Text Present 'wordFile'
 * 23. Verify Text Present 'excelFile'
 * 24. Close Browser
 */
// Open a Chrome Browser
WebUI.openBrowser('')

// Maximize the Window
WebUI.maximizeWindow()

// Navigate to URL with value of the Global Variable Name 'democbx'
WebUI.navigateToUrl(GlobalVariable.democbx)

// Scroll to Element 'demoqa/Elements/Checkbox/h1CheckBox'
WebUI.scrollToElement(findTestObject('demoqa/Elements/Checkbox/h1CheckBox'), 0)

// Click 'demoqa/Elements/Checkbox/btnExpandAll'
WebUI.click(findTestObject('demoqa/Elements/Checkbox/btnExpandAll'))

// Click 'demoqa/Elements/Checkbox/cbxHome(All)'
WebUI.click(findTestObject('demoqa/Elements/Checkbox/cbxHome(All)'))

// Verify Text Present 'home'
WebUI.verifyTextPresent('home', false)

// Verify Text Present 'desktop'
WebUI.verifyTextPresent('desktop', false)

// Verify Text Present 'notes'
WebUI.verifyTextPresent('notes', false)

// Verify Text Present 'commands'
WebUI.verifyTextPresent('commands', false)

// Verify Text Present 'documents'
WebUI.verifyTextPresent('documents', false)

// Verify Text Present 'workspace'
WebUI.verifyTextPresent('workspace', false)

// Verify Text Present 'react'
WebUI.verifyTextPresent('react', false)

// Verify Text Present 'angular'
WebUI.verifyTextPresent('angular', false)

// Verify Text Present 'veu'
WebUI.verifyTextPresent('veu', false)

// Verify Text Present 'office'
WebUI.verifyTextPresent('office', false)

// Verify Text Present 'public'
WebUI.verifyTextPresent('public', false)

// Verify Text Present 'privat'
WebUI.verifyTextPresent('privat', false)

// Verify Text Present 'classified'
WebUI.verifyTextPresent('classified', false)

// Verify Text Present 'general'
WebUI.verifyTextPresent('general', false)

// Verify Text Present 'downloads'
WebUI.verifyTextPresent('downloads', false)

// Verify Text Present 'wordFile'
WebUI.verifyTextPresent('wordFile', false)

// Verify Text Present 'excelFile'
WebUI.verifyTextPresent('excelFile', false)

// Close Browser
WebUI.closeBrowser()

