package productive.framework.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import webdriver.elements.BaseElement;

/**
 * Describes Drop down element
 */
public class DropDown extends BaseElement {

	private String locator;
	private RemoteWebDriver driver = browser.getDriver();

	/**
	 * Default Constructor
	 * @param stringLocator X-Path Locator of div element that contains options
	 * @param nameOfElement Name
	 */
	public DropDown(String stringLocator, String nameOfElement) {
		super(By.xpath(stringLocator), nameOfElement);
		locator = stringLocator;
	}

	@Override
	protected String getElementType() {
		return "Drop-down";
	}

	/**
	 * Selects option by value
	 * @param value Value to select
	 */
	public void selectByValue(final String value) {
		waitAndAssertIsPresent();
		element.click();
		info("Selecting value: " + value);
		driver.findElement(By.xpath(String.format(locator + "//option[contains(., '%1$s')]", value))).click();
	}

}
