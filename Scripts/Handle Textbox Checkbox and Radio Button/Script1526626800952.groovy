import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('http://demoaut.katalon.com/')

WebUI.click(findTestObject('Object Repository/Handle Textbox Checkbox and Radio Button/btn_Make Appointment'))

def userName = "test"

WebUI.sendKeys(findTestObject('Object Repository/Handle Textbox Checkbox and Radio Button/input_Username'), userName)

def input_Value = WebUI.getAttribute(findTestObject('Object Repository/Handle Textbox Checkbox and Radio Button/input_Username'), 'value')

println input_Value

WebUI.verifyMatch(userName, input_Value, false)

WebUI.closeBrowser()


//WebUI.selectOptionByValue(findTestObject('Page_CURA Healthcare Service (2)/select_facility'), 'Hongkong CURA Healthcare Center',true)