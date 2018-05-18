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

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration


def htmlDir = RunConfiguration.getProjectDir() + GlobalVariable.UploadFile_Html_Path

def imgDir = RunConfiguration.getProjectDir() + GlobalVariable.Image_Upload_Path

'Open browser'
WebUI.openBrowser(htmlDir)

'Maximize the window\r\n'
WebUI.maximizeWindow()

'Passing the path of the file'
//WebUI.uploadFile(findTestObject('Object Repository/Handle File Uploads/btn_Upload file'), imgDir)

WebUI.uploadFile(findTestObject('Object Repository/Handle File Uploads/btn_Upload file'), 'D:\\\\Entel\\\\automation\\\\katalon-studio-official-resources\\\\Document\\\\Desert.jpg')


'Capturing the file name after upload and storing it in a variable'
FilePath = WebUI.getAttribute(findTestObject('Object Repository/Handle File Uploads/btn_Upload file'), 'value')

println FilePath + '>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>'

'Verifying the Actual path and Expected path of file'
WebUI.verifyMatch(FilePath, 'C:\\fakepath\\Desert.jpg', false)

WebUI.closeBrowser()










//'Open browser and navigate to given URL'
//WebUI.openBrowser('D:\\\\Entel\\\\automation\\\\katalon-studio-official-resources\\\\Document\\\\UploadFile.html')
//'Maximize the window\r\n'
//WebUI.maximizeWindow()
//'Passing the path of the file'
//// Method one
////WebUI.uploadFile(findTestObject('Object Repository/Handle File Uploads/btn_Upload file'), 'D:\\\\Entel\\\\automation\\\\katalon-studio-official-resources\\\\Document\\\\Desert.jpg')
//
//// Method two
//WebUI.sendKeys(findTestObject('Object Repository/Handle File Uploads/btn_Upload file'), 'D:\\\\Entel\\\\automation\\\\katalon-studio-official-resources\\\\Document\\\\Desert.jpg')
//
//'Capturing the file name after upload and storing it in a variable'
//FilePath = WebUI.getAttribute(findTestObject('Object Repository/Handle File Uploads/btn_Upload file'), 'value')
// 
//'Verifying the Actual path and Expected path of file'
//WebUI.verifyMatch(FilePath, 'C:\\fakepath\\Desert.jpg', false)
//
//WebUI.closeBrowser()









