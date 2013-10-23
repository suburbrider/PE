package productive.framework.elements;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import webdriver.CommonFunctions;
import webdriver.elements.RadioButton;

/**
 *
 * Class supports check box and 2nd level radio groups
 *
 */
public class CheckBoxExt extends webdriver.elements.CheckBox {

	private String locator, name;
	private static final String YES="Yes", NO="No";
	private final String idRegexp = "(?<=id=\')(.*?)(?=\')";
	private String qGroupTemplate ="(//div[@class='progressive-question']//div[@id='%1$s']/ancestor::div/div[@class='question-group follow-up']//div[@class='label-input-wrapper radio']//span[input[@value='%2$s' and @type='radio']])[%3$s]";
	private String question1Title = "Has your doctor suggested you take prescription medication for %1$s? - '%2$s'";
	private String question2Title = "Are you now being treated by a doctor or healthcare professional for %1$s? - '%2$s'";

	/**
	 *
	 * @param stringLocator X-Path Locator with parent element ID
	 * @param nameOfElement Name
	 */
	public CheckBoxExt(final String stringLocator, final String nameOfElement) {
		super(By.xpath(stringLocator), nameOfElement);
		locator = stringLocator;
		name = nameOfElement;
	}

	/**
	 * Set value via JS
	 * @param state value (true/false)
	 */
	public void check(boolean state) {
		waitAndAssertIsPresent();
		info(String.format(getLoc("loc.setting.value") + " '%1$s'", state));
		if (state && !elementIsSelected()) {
			((JavascriptExecutor) browser.getDriver()).executeScript("arguments[0].click();", getElement());
		} else if (!state && elementIsSelected()) {
			((JavascriptExecutor) browser.getDriver()).executeScript("arguments[0].click();", getElement());
		}

	}

	/**
	 * Set value via JS
	 * @param state value (true/false)
	 */
	public void check(final String state) {
        boolean value = Boolean.parseBoolean(state);
        check(value);
	}

	/**
	 * Set a random value for checkbox and 2 radio groups
	 * @return set value
	 */
	public boolean checkRandomExt() {
		boolean state = new Random().nextBoolean();
		check(state);
		if (state){
			String answer = randomAnswer();
			new RadioButton(By.xpath(String.format(qGroupTemplate, getParentID(), answer, "1")), String.format(question1Title, name.toLowerCase(), answer)).clickViaJS();
			answer = randomAnswer();
			new RadioButton(By.xpath(String.format(qGroupTemplate, getParentID(), answer, "2")), String.format(question2Title, name.toLowerCase(), answer)).clickViaJS();
		}
		return state;
	}

	/**
	 *
	 * @return parent tag ID
	 */
	public String getParentID(){
		return CommonFunctions.regexGetMatch(locator, idRegexp);
	}

	/**
	 * Random Yes/No answer
	 * @return Yes/No
	 */
	public String randomAnswer(){
		return new Random().nextBoolean() ? YES : NO;
	}

	/**
	 * Checks if checkbox is selected
	 * @return boolean
	 */
	public boolean elementIsSelected() {
		return element.getAttribute("class").equalsIgnoreCase("checked") ? true : false;
	  }


}
