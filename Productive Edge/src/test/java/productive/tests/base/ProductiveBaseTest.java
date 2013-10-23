package productive.tests.base;

import org.testng.annotations.BeforeMethod;

import webdriver.BaseTest;

/**
 * Base not parameterized test
 */
public abstract class ProductiveBaseTest extends BaseTest {

	/**
	 * To get Version of browser
	 */
	@BeforeMethod
	public void beforeTest() {
		info("Browser version is: " + (String) browser.getDriver().getCapabilities().getCapability("version"));
	}

	/**
	 * Switches browser to the default content
	 */
	public void switchToDefaultContent() {
		browser.getDriver().switchTo().defaultContent();
	}
}
