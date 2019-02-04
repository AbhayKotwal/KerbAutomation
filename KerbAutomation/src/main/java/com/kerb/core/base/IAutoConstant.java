package com.kerb.core.base;

public interface IAutoConstant {

	/** Path of driver executable file [firefox and chrome] */
	String GECKO_KEY = "webdriver.gecko.driver";
	String GECKO_PATH = "./src/test/resources/drivers/firefoxDrivers/geckodriver.exe";

	String CHROME_KEY = "webdriver.chrome.driver";
	String CHROME_PATH = "./src/test/resources/drivers/chromeDrivers/windows/chromedriver.exe";

	/** path of excel in inputdata */
	String EXCEL_PATH = "./src/main/java/com/kerb/core/testData/FreeCrmTestData.xlsx";

	/** path of config file */
	String CONFIG_PATH = "./src/main/java/com/kerb/core/config/config.properties";
	String SNAPSHOT_PATH = "./screenshots/";

}
