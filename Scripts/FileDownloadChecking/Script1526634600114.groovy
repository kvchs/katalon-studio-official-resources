 //https://www.katalon.com/resources-center/tutorials/handle-file-uploads/
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

CustomKeywords.'com.module.utils.firefoxDriver.StartWithFirefox'()

'Define Custom Path where file needs to be downloaded'
String downloadPath = 'C:\\Users\\DefaultAppPool\\Downloads'

//WebUI.openBrowser(GlobalVariable.FileDownloadCheckingURL)
'Launch a browser and Navigate to URL'
WebUI.openBrowser('http://spreadsheetpage.com/index.php/file/C35/P10/')

WebDriver driver = DriverFactory.getWebDriver()

'Clicking on a Link text to download a file'
driver.findElement(By.linkText('smilechart.xls')).click()

'Wait for Some time so that file gets downloaded and Stored in user defined path'
WebUI.delay(10)

'Verifying the file is download in the User defined Path'
Assert.assertTrue(isFileDownloaded(downloadPath, 'smilechart.xls'), 'Failed to download Expected document')

boolean isFileDownloaded(String downloadPath, String fileName) {
    boolean flag = false

    'Creating an object for File and passing the download Path as argument'
    File dir = new File(downloadPath)

    'Creating an Array where it will store all the files from that folder'
    File[] dir_contents = dir.listFiles()

    println('Total Files Available in the folder are : ' + dir_contents.length)

    'Iterating a loop for number of files available in the folder to verify file name in the folder'
    for (int i = 0; i < dir_contents.length; i++) {
        println('File Name at 0 is : ' + dir_contents[i].getName())

        'Verifying the file name is available in the folder '
        if (dir_contents[i].getName().equals(fileName)) {
            'If the file is found then it will return a value as true'
            return flag = true
        }
    }
    
    'If the file is found then it will return a value as false'
    return flag
}

