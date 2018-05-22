import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory


import org.openqa.selenium.WebDriver as WebDriver

 
'Launching the browser navigating to Alert present page\r\n'
 
//WebUI.openBrowser('C:\\\\Users\\\\User\\\\Desktop\\\\How to Handle Alerts.html')

WebUI.openBrowser('file:///E:/katalon_Automation/katalon-studio-official-resources/Document/Alert.html')
'Maximize the window of the browser'
 
WebUI.maximizeWindow()
 
'Clicking on  button'
 
WebUI.click(findTestObject('Object Repository/Handle Alerts/btn_Click Here'))
 
//'Accepting the Alert'
//
//WebUI.delay(3)
// 
//WebUI.acceptAlert()

WebUI.delay(3)

WebUI.verifyAlertPresent(3)

WebDriver driver = DriverFactory.getWebDriver()

String AlertText = driver.switchTo().alert().getText()

println(AlertText + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

'Verifying the Actual and Expected text from Alert'
WebUI.verifyEqual(AlertText, 'Please enter your name')

'Passing the text in the text box in the Alert\r\n'

driver.switchTo().alert().sendKeys("Alert message +++++++++")



/**
 * 向prompt中输入文本在chromedriver中不起作用，IE11也有点问题（Root cause: org.openqa.selenium.JavascriptException: ）
 * 
 * message: google chrome Version 59.0.3071.109 chrome driver 2.30 selenium 3.4 i have this version for chrome.
 * 
 * Also, please note - Sending text to the prompt dialog functions properly. Its just that text is not visible when chromedriver types into the prompt. But if you try to fetch the text from prompt, then it retrieves correctly.
 */






WebUI.setAlertText('Alert Message')

WebUI.delay(5)

'Dismiss the Alert '

WebUI.dismissAlert()

WebUI.closeBrowser()