import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


//run 3 times in case

//data = findTestData('Data-Driven Testing')
//
//
//for (def index : (0..data.getRowNumbers() - 1)) {
//	
//	WebUI.openBrowser('http://demoaut.katalon.com/profile.php#login')
//	
//	WebUI.setText(findTestObject('Data-Driven Testing/input_UserName'), data.internallyGetValue("username", index))
//	
//	WebUI.setText(findTestObject('Data-Driven Testing/input_Password'), data.internallyGetValue("password", index))
//	
//	WebUI.click(findTestObject('Data-Driven Testing/btn_Login'))
//	
//	WebUI.verifyElementPresent(findTestObject('Data-Driven Testing/btn_MakeAppointment'), 0)
//	
//	WebUI.closeBrowser()
//	
//}




WebUI.openBrowser('http://demoaut.katalon.com/profile.php#login')

WebUI.setText(findTestObject('Data-Driven Testing/input_UserName'), username)

WebUI.setText(findTestObject('Data-Driven Testing/input_Password'), password)

WebUI.click(findTestObject('Data-Driven Testing/btn_Login'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Data-Driven Testing/btn_MakeAppointment'), 2)

WebUI.closeBrowser()

