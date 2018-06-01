package com.module.utils

import java.awt.image.BufferedImage

import javax.imageio.ImageIO

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory

import ru.yandex.qatools.ashot.AShot
import ru.yandex.qatools.ashot.Screenshot
import ru.yandex.qatools.ashot.comparison.ImageDiff
import ru.yandex.qatools.ashot.comparison.ImageDiffer
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider



public class ScreenshotHelper {

	@Keyword
	public void takeWebElementScreenshot(TestObject object){
		WebElement element = WebUiCommonHelper.findWebElement(object, 20)
		WebDriver driver = DriverFactory.getWebDriver();

		//Getting "unknown error: $ is not defined" Error..
		//Screenshot screenshot = new AShot().takeScreenshot(driver, element);
		//to fix the issue
		Screenshot screenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, element);
		ImageIO.write(screenshot.getImage(), "PNG", new File(System.getProperty("user.dir") + "\\ErrorScreenshots\\ErrorScreenshot.png"))
	}

	@Keyword
	public boolean compareImage(TestObject object){
		WebElement element = WebUiCommonHelper.findWebElement(object, 20)
		WebDriver driver = DriverFactory.getWebDriver();

		BufferedImage expectedImage = ImageIO.read(new File(System.getProperty("user.dir") + "\\ErrorScreenshots\\ErrorScreenshot.png"))
		Screenshot logoImageScreenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, element);
		BufferedImage actualImage = logoImageScreenshot.getImage();

		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);

		//Is different or not.
		return diff.hasDiff();
	}
}
