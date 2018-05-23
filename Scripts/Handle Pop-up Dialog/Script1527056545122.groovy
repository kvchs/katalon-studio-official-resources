import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Note:when text can not clear in input box,should use sendKeys method to set value.

/**
 * 1.WebUI.switchToWindowIndex(1)
 * 2.WebUI.switchToWindowTitle('New Window')
 * 3.WebUI.switchToWindowUrl('http://the-internet.herokuapp.com/windows/new')
 * Noted that NoSuchWindowException exception will be thrown when window target to be switched doesn’t exist.
 */



WebUI.openBrowser('http://www.elated.com/articles/javascript-tabs/')

'Maximize current browser window'
WebUI.maximizeWindow()

WebUI.waitForPageLoad(10)

WebUI.switchToFrame(findTestObject('Object Repository/Handle Pop-up Dialog/Frame_Tweet'), 2)

'Click on \'Tweet\' button in iframe'
WebUI.click(findTestObject('Handle Pop-up Dialog/link_Tweet'))

'Switch to window that has title \'Share a link on Twitter\''
WebUI.switchToWindowTitle('Share a link on Twitter')


'Enter email'
WebUI.delay(3)
//WebUI.clearText(findTestObject('Object Repository/Handle Pop-up Dialog/input_Username'))
WebUI.sendKeys(findTestObject('Object Repository/Handle Pop-up Dialog/input_Username'), '32131321@wwq.om')

'Enter password'
//WebUI.clearText(findTestObject('Object Repository/Handle Pop-up Dialog/input_Password'))
WebUI.sendKeys(findTestObject('Object Repository/Handle Pop-up Dialog/input_Password'), '212132')

'Verify Tweet message is displayed for successful login'
WebUI.verifyTextPresent("Share a link with your followers",false)

'Switch back to default content, Switch back to the default window, after working with iFrame windows.'
WebUI.switchToDefaultContent()

WebUI.closeBrowser()