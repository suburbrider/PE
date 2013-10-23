package productive.forms.notauthorized;

import org.openqa.selenium.By;

import webdriver.elements.Link;

/**
 *
 *
 */
public class IForgotMyLoginForm extends NotAuthorizedBaseForm {

	/**
	 * Constructor by default
	 */
	public IForgotMyLoginForm() {
		super(By.xpath("//h1[contains(.,'I Forgot')]"), "I FORGOT MY LOG IN Page");
	}

	/**
	 * Forgot items list
	 */
	public enum Forgot {
		USERNAME("I forgot my username"), PASSWORD("I forgot my password"), USERNAME_PASSWORD("I forgot my username and password"), REGISTER("I have not registered before");

		/**
		 * @param value value
		 */
		private Forgot(final String value) {
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
	 * @param item Forgot
	 */
	public void navigateTo(final Forgot item){
		new Link(By.linkText(item.toString()),item.toString()).clickAndWait();
	}

}
