package productive.tests.base;

import org.testng.annotations.BeforeMethod;
import webdriver.BaseTestParam;

/**
 * Base parameterized test
 */
public abstract class ProductiveParamTest extends BaseTestParam {

	/**
	 * To get Version of browser
	 */
	@BeforeMethod
	public void beforeTest() {
		info("Browser version is: " + (String) browser.getDriver().getCapabilities().getCapability("version"));
	}
}
