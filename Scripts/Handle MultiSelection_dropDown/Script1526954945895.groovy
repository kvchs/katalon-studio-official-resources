//https://www.cnblogs.com/testway/p/6037774.html
//解决selenium 启动ie浏览器报错：Unexpected error launching Internet Explorer. Protected Mode settings are not the same for all zones

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
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

def url = RunConfiguration.getProjectDir() + GlobalVariable.MultiSelection_dropDown

println(url)

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.maximizeWindow()

WebUI.selectAllOption(findTestObject('Object Repository/Handle MultiSelection_dropDown/MultiSelection_dropDown'))

WebUI.delay(3)

WebUI.deselectAllOption(findTestObject('Object Repository/Handle MultiSelection_dropDown/MultiSelection_dropDown'))

def NoOfSelectedOptions = WebUI.getNumberOfSelectedOption(findTestObject('Object Repository/Handle MultiSelection_dropDown/MultiSelection_dropDown'))

WebUI.verifyEqual(NoOfSelectedOptions, 0)

def TotelNumber = WebUI.getNumberOfTotalOption(findTestObject('Object Repository/Handle MultiSelection_dropDown/MultiSelection_dropDown'))

println(TotelNumber)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Handle MultiSelection_dropDown/MultiSelection_dropDown'), 2)

WebUI.verifyOptionSelectedByIndex(findTestObject('Object Repository/Handle MultiSelection_dropDown/MultiSelection_dropDown'), 
    2, 3)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Handle MultiSelection_dropDown/MultiSelection_dropDown'), '2-4')

WebUI.verifyOptionSelectedByIndex(findTestObject('Object Repository/Handle MultiSelection_dropDown/MultiSelection_dropDown'), 
    '2-4', 3)

WebUI.deselectAllOption(findTestObject('Object Repository/Handle MultiSelection_dropDown/MultiSelection_dropDown'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Handle MultiSelection_dropDown/MultiSelection_dropDown'), "Networking", false)

WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Handle MultiSelection_dropDown/MultiSelection_dropDown'), "Networking", false, 3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Handle MultiSelection_dropDown/MultiSelection_dropDown'), "1", false)

WebUI.verifyOptionSelectedByValue(findTestObject('Object Repository/Handle MultiSelection_dropDown/MultiSelection_dropDown'), "1", false, 3)

WebUI.closeBrowser()

