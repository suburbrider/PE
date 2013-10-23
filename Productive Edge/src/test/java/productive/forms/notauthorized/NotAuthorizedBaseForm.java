package productive.forms.notauthorized;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Link;

/**
 * Base Form for not authorized users
 *
 */
public class NotAuthorizedBaseForm extends BaseForm {

	/**
	 *
	 * @param locator By
	 * @param formTitle String
	 */
	protected NotAuthorizedBaseForm(final By locator, final String formTitle) {
		super(locator, formTitle);
	}

	/**
	 * tabs
	 */
	public enum Tabs {
		REGISTER("REGISTER"), CONTACT_US("CONTACT US"), I_FORGOT_MY_LOG_IN("I FORGOT MY LOG IN"), LOG_IN("LOG IN"), HOME("HOME");

		/**
		 * @param value value
		 */
		private Tabs(final String value) {
			text = value;
		}

		private final String text;

		@Override
		public String toString() {
			return text;
		}
	}

	/**
	 *
	 * @param item Tabs
	 */
	public void moveTo(final Tabs item) {
		new Link(By.linkText(item.toString()),item.toString()).clickAndWait();
	}

}
