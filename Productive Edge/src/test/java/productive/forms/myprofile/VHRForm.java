package productive.forms.myprofile;

import org.openqa.selenium.By;
import productive.forms.MenuForm;
import webdriver.CommonFunctions;
import webdriver.elements.*;

/**
 * Vitality Health Review Page
 */
public class VHRForm extends MenuForm {

	private Button btnPrev = new Button(By.id("prevButton"), "Previous");
	private Button btnNext = new Button(By.id("nextButton"), "Next");
	private String radioTemplate = "//label[contains(., '%1$s')]/div[@class='radio']";

	/**
	 * Constructor by default
	 */
	public VHRForm() {
		super(By.xpath("//div[@id='breadcrumb'][contains(., 'My Profile') and contains(., 'VHR')]"),
				"Vitality Health Review Page");
		browser.getDriver().switchTo().frame(0);
	}

	/**
	 * Constructor
	 * @param locator Locator
	 * @param title Title
	 */
	public VHRForm(final By locator, final String title) {
		super(locator, title);
	}

	/**
	 * Goes next page
	 */
	public void goNext() {
		btnNext.clickViaJsAndWait();
		CommonFunctions.centerMouse();
	}

	/**
	 * Goes previous page
	 */
	public void goPrev() {
		btnPrev.clickExtAndWait();
	}

	/**
	 * Check if the First page is opened
	 * @return true\false
	 */
	public boolean isFirstPage() {
		return !btnPrev.isPresent();
	}

	/**
	 * Gets template for radio buttons
	 * @return x-path template
	 */
	protected String getRadio() {
		return radioTemplate;
	}

	// /**
	// * Asserts the page controls
	// * @param page Pages item
	// */
	// public void assertControls(final Pages page) {
	// if (checkSelected(page)) {
	// info(page.toString() + " page is opened");
	// } else {
	// error(page.toString() + " page is not opened");
	// }
	// }
	//
	// /**
	// * @param page Pages item
	// * @return boolean value, is tab selected
	// */
	// public boolean checkSelected(final Pages page) {
	// String classname;
	// switch (page) {
	// case PAGE1:
	// classname = new Link(By.xpath("//a[@title='Page 1']"), "Page 1").getAttribute("class");
	// break;
	// case PAGE2:
	// classname = new Link(By.xpath("//a[@title='Page 2']"), "Page 2").getAttribute("class");
	// break;
	// case PAGE3:
	// classname = new Link(By.xpath("//a[@title='Page 3']"), "Page 3").getAttribute("class");
	// break;
	// default:
	// classname = "";
	// }
	// return classname.contains("active");
	// }
	//
	// /**
	// * Pages list
	// */
	// public enum Pages {
	// PAGE1("Page 1"), PAGE2("Page 2"), PAGE3("Page 3");
	//
	// /**
	// * @param value value
	// */
	// private Pages(final String value) {
	// text = value;
	// }
	//
	// private final String text;
	//
	// @Override
	// public String toString() {
	// return text;
	// }
	// }
}
