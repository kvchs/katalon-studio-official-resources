import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.google.com/')

TestObject to = findTestObject(findTestObject('Object Repository/Tips and Tricks/input_GoogleHomePage'))

//Change value of CSS selector
to.setSelectorValue(SelectorMethod.CSS, ".gb_Jb")

WebUI.click(to)