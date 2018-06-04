package com.module.utils
import org.openqa.selenium.firefox.FirefoxProfile

import com.kms.katalon.core.annotation.Keyword




class AutoDownloadFileForFirefox {
	/**
	 * Refresh browser
	 */
	@Keyword
	def setPreference() {
//		FirefoxOptions options = new FirefoxOptions();
//		options.setPreference("browser.download.folderList", 2);
//		options.setPreference("browser.download.dir", "C:\\Windows\\temp");
//		options.setPreference("browser.download.useDownloadDir", true);
//		options.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
//		options.setPreference("pdfjs.disabled", true);  // disable the built-in PDF viewer
//		return options
		
		FirefoxProfile profile = new FirefoxProfile();
		// profile.setPreference("browser.download.useDownloadDir", true); This is true by default. Add it if it's not working without it.
		
		profile.setPreference("browser.download.folderList",2); //Use for the default download directory the last folder specified for a download
		profile.setPreference("browser.download.dir", "/Path/to/directory"); //Set the last directory used for saving a file from the "What should (browser) do with this file?" dialog.
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf"); //list of MIME types to save to disk without asking what to use to open the file
		profile.setPreference("pdfjs.disabled", true);  // disable the built-in PDF viewer
		
//		firefoxOptions.setProfile(profile);
		return profile
	}
}
