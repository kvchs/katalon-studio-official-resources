import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('http://jqueryui.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Handle Frame Issue/link_Draggable'))

WebUI.switchToFrame(findTestObject('Object Repository/Handle Frame Issue/frame_Demo'), 2)

WebUI.dragAndDropByOffset(findTestObject('Object Repository/Handle Frame Issue/section_draggable'), 300, 100)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/Handle Frame Issue/link_droppable'))

WebUI.switchToFrame(findTestObject('Object Repository/Handle Frame Issue/frame_DemoTwo'), 2)

WebUI.dragAndDropToObject(findTestObject('Object Repository/Handle Frame Issue/section_draggable'), findTestObject('Object Repository/Handle Frame Issue/section_droppable'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToDefaultContent()

WebUI.scrollToElement(findTestObject('Object Repository/Handle Frame Issue/link_Position'), 5)

def text = WebUI.getText(findTestObject('Object Repository/Handle Frame Issue/link_Position'))

println text

WebUI.verifyEqual(text, "Position")

WebUI.closeBrowser()

