package productive.framework.elements;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import webdriver.elements.BaseElement;

/**
 * Slider class realization
 */
public class Slider extends BaseElement {

	private String stringLoc;
	private RemoteWebDriver driver = browser.getDriver();

	/**
	 * Default constructor
	 * @param stringLocator X-path locator
	 * @param nameOfElement Element name
	 */
	public Slider(final String stringLocator, final String nameOfElement) {
		super(By.xpath(stringLocator), nameOfElement);
		stringLoc = stringLocator + "/div";
	}

	@Override
	protected String getElementType() {
		return "Slider";
	}

	/**
	 * Selects slider value
	 * @param value Value to select
	 */
	public void selectValue(final String value) {
		info("Selecting value: " + value);
		driver.findElement(By.xpath(stringLoc)).click();
		Keys side = Keys.ARROW_RIGHT;

		int curr = getCurrentIndex();
		int target = getIndexByValue(value);
		if (curr == target) {
			return;
		}
		if (curr > target) {
			side = Keys.ARROW_LEFT;
		}
		for (int i = 0; i < Math.abs(curr - target); i++) {
			driver.getKeyboard().pressKey(side);
		}
	}

	/**
	 * Gets selected index
	 * @return Selected Value
	 */
	public int getCurrentIndex() {
		String val = driver.findElement(By.xpath(stringLoc + "/div")).getAttribute("aria-valuenow");
		return Integer.valueOf(val);
	}

	/**
	 * Gets Number if items
	 * @return Number Of Items
	 */
	public int getNumberOfItems() {
		int number = driver.findElements(By.xpath(stringLoc + "//div[@class='multi-state-label']")).size();
		return number;
	}

	/**
	 * Gets index by value
	 * @param value Value to select
	 * @return index of value
	 */
	public int getIndexByValue(final String value) {
		int count = 0;
		List<WebElement> list = driver.findElements(By.xpath(stringLoc + "//div[@class='multi-state-label']"));
		for (WebElement webElement : list) {
			count++;
			if (webElement.getText().equals(value)) {
				return count - 1;
			}
		}
		return -1;
	}
}
