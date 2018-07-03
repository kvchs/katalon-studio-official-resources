import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser("http://www.baidu.com")

WebDriver driver = DriverFactory.getWebDriver()

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Forum/btn_GoogleSearch'), 2)

JavascriptExecutor js = (JavascriptExecutor) driver;



js.executeScript("arguments[0].innerHTML = arguments[1]", element, "大新闻")

WebUI.delay(5)

