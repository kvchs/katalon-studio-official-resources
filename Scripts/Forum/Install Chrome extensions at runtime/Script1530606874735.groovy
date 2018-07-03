import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

System.setProperty("webdriver.chrome.driver", "D:\\Download\\Katalon_Studio_Windows_64-5.4.2\\Katalon_Studio_Windows_64-5.4.2\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
ChromeOptions options = new ChromeOptions()
options.addExtensions(new File("D:\\Download\\ModHeader_v2.2.3.crx"))
DesiredCapabilities capabilities = new DesiredCapabilities()
capabilities.setCapability(ChromeOptions.CAPABILITY, options)
WebDriver driver = new ChromeDriver(capabilities)

driver.get("http://www.baidu.com")
WebUI.delay(10)
