package com.module.utils
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class ModifyHeader {

	@Keyword
	def ModifyHeader(){
		ChromeOptions options = new ChromeOptions()

		DesiredCapabilities capabilities = new DesiredCapabilities()

		options.addArguments('load-extension=C:\\Users\\charleychen\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\idgpnmonknjnojddfkpgkljpfnnfcklj\\2.2.0_0')

		capabilities.setCapability(ChromeOptions.CAPABILITY, options)

		//Path to chromedriver, e.g on Windows
		System.setProperty('webdriver.chrome.driver', 'D:\\Entel_Automation\\plug-in\\chromedriver.exe')

		ChromeDriver driver = new ChromeDriver(capabilities)

		DriverFactory.changeWebDriver(driver)

		driver.navigate().to('chrome-extension://idgpnmonknjnojddfkpgkljpfnnfcklj/icon.png')

		((driver) as JavascriptExecutor).executeScript((((((('localStorage.setItem(\'profiles\', JSON.stringify([{                ' +
				'  title: \'Katalon\', hideComment: true, appendMode: \'\',           ') + '  headers: [                                                      ') +
				'    {enabled: true, name: \'msisdn\', value: \'995001162\', comment: \'\'}, ') + '  ],                                                              ') +
				'  respHeaders: [],                                                ') + '  filters: []                                                     ') +
				'}]));                                                             ')
	}
}
