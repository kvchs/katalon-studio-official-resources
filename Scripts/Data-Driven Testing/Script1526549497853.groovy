import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testdata.InternalData as InternalData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//run 3 times in case
InternalData data = findTestData('Data-Driven Testing')
//data = findTestData('Data-Driven Testing')


for (def index : (0..data.getRowNumbers() - 1)) {
	
	CustomKeywords.'com.module.utils.firefoxDriver.StartWithFirefox'()
	
	WebUI.openBrowser('http://demoaut.katalon.com/profile.php#login')
	
	WebUI.setText(findTestObject('Data-Driven Testing/input_UserName'), data.internallyGetValue("username", index))
	
	WebUI.setText(findTestObject('Data-Driven Testing/input_Password'), data.internallyGetValue("password", index))
	
	WebUI.click(findTestObject('Data-Driven Testing/btn_Login'))
	
	WebUI.verifyElementPresent(findTestObject('Data-Driven Testing/btn_MakeAppointment'), 3)
	
	WebUI.closeBrowser()
	
}





//CustomKeywords.'com.module.utils.firefoxDriver.StartWithFirefox'()
//
//WebUI.openBrowser('http://demoaut.katalon.com/profile.php#login')
//
//WebUI.setText(findTestObject('Data-Driven Testing/input_UserName'), username)
//
//WebUI.setText(findTestObject('Data-Driven Testing/input_Password'), password)
//
//WebUI.click(findTestObject('Data-Driven Testing/btn_Login'))
//
//WebUI.delay(3)

//WebUI.verifyElementPresent(findTestObject('Data-Driven Testing/btn_MakeAppointment'), 2)
//
//WebUI.closeBrowser()

